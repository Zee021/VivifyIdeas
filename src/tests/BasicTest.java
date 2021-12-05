package tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pages.BasicPage;
import pages.CreateGalleryPage;
import pages.LoginPage;

import pages.RegisterPage;
import pages.GalleryAppPage;

public abstract class BasicTest {

	protected WebDriver driver;
	protected WebDriverWait waiter;
	protected SoftAssert softAssert;
	protected BasicPage basicPage;
	protected GalleryAppPage galleryAppPage;
	protected LoginPage loginPage;
	protected RegisterPage registerPage;
	protected CreateGalleryPage createGalleryPage;

	protected String firstName = "Yellow";
	protected String lastName = "Snowman";
	protected String email = "4test@somemail.com";
	protected String password = "testpass222";
	protected String galleryAppURL = "https://gallery-app.vivifyideas.com/";
	protected String title = "Novi Sad";
	protected String description = "Moj grad";
	protected String linkToPhoto1 = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1d/6b/4b/85/caption.jpg?w=1200&h=-1&s=1&cx=2980&cy=1592&chk=v1_4c086a3f0079164b576b";
	protected String linkToPhoto2 = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0a/46/1e/79/caption.jpg?w=1200&h=-1&s=1";
	protected String search = "Novi Sad";

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.waiter = new WebDriverWait(driver, 20);
//		this.js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		galleryAppPage = new GalleryAppPage(driver, waiter);
		loginPage = new LoginPage(driver, waiter);
		registerPage = new RegisterPage(driver, waiter);
		createGalleryPage = new CreateGalleryPage(driver, waiter);

	}

	@AfterMethod
	public void afterTest(ITestResult result) throws IOException, InterruptedException {

		if (result.getStatus() == ITestResult.FAILURE) {
			File screenShot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
			String fileName = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss'.png'").format(new Date());
			File save = new File("screenshots/" + fileName);
			FileHandler.copy(screenShot, save);
			Thread.sleep(2000);
			this.driver.quit();
		} else {
			this.driver.quit();
		}
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
