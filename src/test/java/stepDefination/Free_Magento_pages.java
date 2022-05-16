package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SetUpClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Free_Magento_pages extends BaseClass {

	public String verify_ppt_page;
	public WebElement page_number;
	public String pageNumber;
	public WebElement freeSlides;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver.get(AppURL);
		log.info("It's opening the website URL");
		BaseClass.ClearBrowserCache();
	}

	@Then("^click on Free Slides button on top navigation bar$")
	public void click_on_Free_Slides_button_on_top_navigation_bar() throws Throwable {
		freeSlides = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("FREE SLIDES")));
		freeSlides.click();
		
	}

	@Then("^click on any of page number and verify the listing page below$")
	public void click_on_any_of_page_number_and_verify_the_listing_page_below() throws Throwable {
		Thread.sleep(3000);
		// click on 4th page number
		page_number = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-info free_product-info']//ul//li[5]")));
		pageNumber = page_number.getText();
		page_number.click();

		List<WebElement> productSize = driver
				.findElements(By.xpath("//div[@class='freedownload-block']//div[@class='product-block']"));

		System.out.println("Total product on " + pageNumber + "th page = " + productSize.size());

		int product_size = productSize.size();
		Assert.assertTrue("No product is displayed", product_size > 0);
	}

	@Then("^select any of one ppt on the page$")
	public void select_any_of_one_ppt_on_the_page() throws Throwable {
		try {
			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html[1]/body[1]/div[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^verify the navigation on correct ppt page$")
	public void verify_the_navigation_on_correct_ppt_page() throws Throwable {
		// verify the download button

		try {
			Thread.sleep(2000);
			verify_ppt_page = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='download_product']"))).getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Click on signin page$")
	public void click_on_signin_page() throws Throwable {
		Thread.sleep(3000);
		WebElement sign_in = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LOGIN")));
		sign_in.click();

	}

	@Then("^Enter username \"([^\"]*)\" and passwordi \"([^\"]*)\"$")
	public void enter_username_and_passwordi(String username, String password) throws Throwable {
		Thread.sleep(3000);
		try {
			WebElement email = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='E-mail Address']")));
			email.sendKeys(username);

			WebElement password_field = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
			password_field.sendKeys(password);
			Thread.sleep(2000);

			WebElement login_btn = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Submit']")));
			login_btn.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Click on Free Slides button on top navigation bar$")
	public void Click_on_Free_Slides_button_on_top_navigation_bar() throws Throwable {
		freeSlides = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("FREE SLIDES")));
		freeSlides.click();
	}

	@Then("^Click on any of page number and verify the listing page$")
	public void click_on_any_of_page_number_and_verify_the_listing_page() throws Throwable {
		Thread.sleep(3000);
		// click on 4th page number
		page_number = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-info free_product-info']//ul//li[5]")));
		pageNumber = page_number.getText();
		page_number.click();

		List<WebElement> productSize = driver
				.findElements(By.xpath("//div[@class='freedownload-block']//div[@class='product-block']"));

		System.out.println("Total product on " + pageNumber + "th page = " + productSize.size());

		int product_size = productSize.size();
		Assert.assertTrue("No product is displayed", product_size > 0);
	}

	@Then("^Click on any of one ppt under free ppts$")
	public void click_on_any_of_one_ppt_under_free_ppts() throws Throwable {
		try {
			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html[1]/body[1]/div[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Verify the navigation on correct ppt page$")
	public void Verify_the_navigation_on_correct_ppt_page() throws Throwable {
		// verify the download button

		try {
			Thread.sleep(4000);
			verify_ppt_page = BaseClass.elementToBeClickable(By.xpath("//a[@id='download_product']")).getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^User logout from the application$")
	public void user_logout_from_the_application() throws Throwable {
		try {
			Thread.sleep(4000);
			WebElement logout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", logout);
		} catch (NoSuchElementException e) {

		}
	}

}