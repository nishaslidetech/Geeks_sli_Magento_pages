package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SetUpClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class New_Additions extends BaseClass {
	public WebElement newAdditions;
	public String pageNumber;
	public int product_size;
	public WebElement page_number;
	public WebElement select_ppt;
	public String verify_ppt_page;

	@Given("^user is on Home Pagesi$")
	public void user_is_on_Home_Pagesi() throws Throwable {
		driver.get(AppURL);
		log.info("It's opening the website URL");
		BaseClass.ClearBrowserCache();

	}

	@Then("^click on New Addition button on Top navigation bar$")
	public void click_on_New_Addition_button_on_Top_navigation_bar() throws Throwable {
		newAdditions = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("NEW ADDITIONS")));
		newAdditions.click();

	}

	@Then("^mouse hover on any of one ppt and verify the popup$")
	public void mouse_hover_on_any_of_one_ppt_and_verify_the_popup() throws Throwable {
		try {
			Thread.sleep(3000);
			select_ppt = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//img[@title='Scrum Master Job Profile IT Who Can Become A Scrum Master Clipart PDF']")));
			Actions action = new Actions(driver);
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			action.moveToElement(select_ppt).perform();
			Thread.sleep(3000);

			// to verify the pop-up
			String display = driver.findElement(By.xpath("//div[@id = 'imgtip318052']")).getCssValue("display");

			System.out.println("display= " + display);

			Assert.assertTrue("pop-up is not visible", display.equals("block")); // if block - visible if none - not
																					// visible
		} catch (NoSuchElementException e) {

		}

	}

	@Then("^click on pagination number and verify the listing below$")
	public void click_on_pagination_number_and_verify_the_listing_below() throws Throwable {
		Thread.sleep(3000);
		// click on 5th page number
		page_number = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-info']//ul//li[6]")));
		pageNumber = page_number.getText();
		page_number.click();

		List<WebElement> productSize = driver.findElements(By.xpath("//div[@class='box-row']//a[1]//img[1]"));

		System.out.println("Total product on " + pageNumber + "th page = " + productSize.size());

		product_size = productSize.size();
		Assert.assertTrue("No product is displayed", product_size > 0);

	}

	@Then("^click on any of PPT$")
	public void click_on_any_of_PPT() throws Throwable {

		try {
			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^verify the page$")
	public void verify_the_page() throws Throwable {
		// verify the download button
		try {
			Thread.sleep(4000);
			verify_ppt_page = BaseClass.elementToBeClickable(By.xpath("//a[@id='download_product']")).getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}

	}

	@Given("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		Thread.sleep(3000);
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LOGIN")));
		login.click();
	}

	@Then("^Enter valid username \"([^\"]*)\" and \"([^\"]*)\" password$")
	public void enter_valid_username_and_password(String username, String password) throws Throwable {
		Thread.sleep(3000);
		try {
			WebElement email = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='E-mail Address']")));
			email.sendKeys(username);

			WebElement password_field = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
			password_field.sendKeys(password);
			Thread.sleep(3000);

			WebElement login_btn = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Submit']")));
			js.executeScript("arguments[0].click();", login_btn);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Click on New Addition button on Top navigation bar$")
	public void Click_on_New_Addition_button_on_Top_navigation_bar() throws Throwable {
		newAdditions = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("NEW ADDITIONS")));
		newAdditions.click();
	}

	@Then("^Mouse hover on any of one ppt and verify the the popup$")
	public void mouse_hover_on_any_of_one_ppt_and_verify_the_the_popup() throws Throwable {
		try {
			Thread.sleep(3000);
			select_ppt = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//img[@title='Scrum Master Job Profile IT Who Can Become A Scrum Master Clipart PDF']")));
			Actions action = new Actions(driver);
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			action.moveToElement(select_ppt).perform();
			Thread.sleep(3000);

			// to verify the pop-up
			String display = driver.findElement(By.xpath("//div[@id = 'imgtip318052']")).getCssValue("display");

			System.out.println("display= " + display);

			Assert.assertTrue("pop-up is not visible", display.equals("block")); // if block - visible if none - not
																					// visible
		} catch (NoSuchElementException e) {

		}

	}

	@Then("^Click on pagination number and verify the listing below$")
	public void Click_on_pagination_number_and_verify_the_listing_below() throws Throwable {
		Thread.sleep(3000);
		// click on 5th page number
		page_number = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-info']//ul//li[6]")));
		pageNumber = page_number.getText();
		page_number.click();

		List<WebElement> productSize = driver.findElements(By.xpath("//div[@class='box-row']//a[1]//img[1]"));

		System.out.println("Total product on " + pageNumber + "th page = " + productSize.size());

		product_size = productSize.size();
		Assert.assertTrue("No product is displayed", product_size > 0);
	}

	@Then("^Click on any of PPT and verify the download button$")
	public void click_on_any_of_PPT_and_verify_the_download_button() throws Throwable {
		try {
			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}

		// verify the download button
		try {
			Thread.sleep(4000);
			verify_ppt_page = BaseClass
					.elementToBeClickable(
							By.xpath("//a[@class='btn-download pg-button pg-addtocart pg-green-background-btn']"))
					.getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Clicks on the Logout button$")
	public void clicks_on_the_Logout_button() throws Throwable {
		try {
			Thread.sleep(4000);
			WebElement logout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", logout);
		} catch (NoSuchElementException e) {

		}
	}
}