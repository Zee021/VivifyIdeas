package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasicPage {

	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public WebElement getRegisterButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[2]"));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getConfirmPasswordField() {
		return driver.findElement(By.id("password-confirmation"));
	}

	public WebElement getAcceptedTermsCheckbox() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[6]/input"));
	}

	public WebElement getSubmitRegisterButton() {
		return driver.findElement(By.xpath("//*[@class='btn btn-custom']"));
	}

	public void Register(String firstName, String lastName, String email, String password) throws InterruptedException {
		this.getRegisterButton().click();
		Thread.sleep(2000);
		this.getFirstName().sendKeys(firstName);
		this.getLastName().sendKeys(lastName);
		this.getEmailField().sendKeys(email);
		this.getPasswordField().sendKeys(password);
		this.getConfirmPasswordField().sendKeys(password);
		this.getAcceptedTermsCheckbox().click();
		this.getSubmitRegisterButton().click();
	}

}
