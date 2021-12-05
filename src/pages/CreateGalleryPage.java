package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGalleryPage extends BasicPage {

	public CreateGalleryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public WebElement getCreateGalleryButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[3]/a"));
	}

	public WebElement getTitleInput() {
		return this.driver.findElement(By.id("title"));
	}

	public WebElement getDescriptionsInput() {
		return this.driver.findElement(By.id("description"));
	}

	public WebElement getImageInput() {
		return this.driver.findElement(
				By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]"));

	}

	public WebElement getAddImageButton() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]"));
	}

	public WebElement moveImageDown() {
		return this.driver.findElement(
				By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/button[3]"));
	}

	public WebElement getSubmitGalleryButton() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/button[1]"));
	}

	public void CreateGallery(String title, String description, String linkToPhoto1, String linkToPhoto2) {
		this.getCreateGalleryButton().click();
		this.getTitleInput().sendKeys(title);
		this.getDescriptionsInput().sendKeys(description);
		this.getImageInput().sendKeys(linkToPhoto1);
//        this.moveImageDown().click();
//        this.getImageInput().sendKeys(linkToPhoto2);
		this.getSubmitGalleryButton().click();

	}

}
