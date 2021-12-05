package tests;

import java.io.IOException;

import org.testng.annotations.Test;

public class GaleryTest extends BasicTest {

	@Test(priority = 2)
	public void LoginTest() throws InterruptedException, IOException {

		this.driver.navigate().to(galleryAppURL);
		Thread.sleep(2000);
		this.loginPage.logIn(email, password);
		Thread.sleep(2000);
		this.galleryAppPage.logOut();
		Thread.sleep(2000);
		this.driver.navigate().to(galleryAppURL);
		
	}
//	@Test(priority = 1)
//	public void RegistrationTest() throws InterruptedException, IOException {
//
//		this.driver.navigate().to(galleryAppURL);
//		Thread.sleep(2000);
//		this.registerPage.Register(firstName, lastName, email, password);
//		Thread.sleep(2000);
//		this.galleryAppPage.logOut();
//		Thread.sleep(2000);
//		this.driver.navigate().to(galleryAppURL);
//		
//	}
	@Test(priority = 3)
	public void CreateGaleryTest() throws InterruptedException, IOException {

		this.driver.navigate().to(galleryAppURL);
		Thread.sleep(2000);
		this.loginPage.logIn(email, password);
		Thread.sleep(2000);
		this.createGalleryPage.CreateGallery(title, description, linkToPhoto1, linkToPhoto2);
		Thread.sleep(2000);
		this.driver.navigate().to(galleryAppURL);
		
	}
	@Test(priority = 4)
	public void FindGalleryTest() throws InterruptedException, IOException {

		this.driver.navigate().to(galleryAppURL);
		Thread.sleep(2000);
		this.galleryAppPage.Search(search);
		Thread.sleep(5000);
		this.galleryAppPage.ClearSearch();
		Thread.sleep(5000);

	}
}
