package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[1]"));
	}

	public WebElement getEmailInput() {
		return this.driver.findElement(By.xpath("//input[@id='email']"));
	}

	public WebElement getPasswordInput() {
		return this.driver.findElement(By.xpath("//input[@id='password']"));
	}

	public WebElement getSubmitLoginButton() {
		return this.driver.findElement(By.tagName("button"));
	}

	public void logIn(String email, String password) throws InterruptedException {
		this.getLoginButton().click();
		Thread.sleep(2000);
		this.getEmailInput().sendKeys(email);
		this.getPasswordInput().sendKeys(password);
		this.getSubmitLoginButton().click();
	}
}
