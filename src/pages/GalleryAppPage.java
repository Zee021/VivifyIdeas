package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GalleryAppPage extends BasicPage {

	public GalleryAppPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public WebElement getSearchInputField() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/input"));
	}

	public WebElement getFilterButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button"));
	}

	public WebElement getLoadMoreButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div[2]/button"));
	}

	public WebElement getLogoutButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]"));
	}

	public WebElement getMyGalleryesButton() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a"));
	}

	public List<WebElement> getLastImage() {
		return driver.findElements(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/div"));
	}

	public void logOut() {
		this.getLogoutButton().click();
	}

	public void Search(String search) {
		this.getSearchInputField().sendKeys(search);
		this.getFilterButton().click();
	}

	public void ClearSearch() {
		this.getSearchInputField().clear();
		this.getFilterButton().click();
	}

}
