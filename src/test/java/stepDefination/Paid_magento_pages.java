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

public class Paid_magento_pages extends BaseClass {
	public WebElement select_ppt;
	public String verify_ppt_page;
	public int product_size;
	public WebElement page_number;
	WebElement business_ppt;
	public String pageNumber;
	public WebElement mostPopular;

	@Given("^User is on Home Pageii$")
	public void user_is_on_Home_Pageii() throws Throwable {
		driver.get(AppURL);
		log.info("It's opening the website URL");
		BaseClass.ClearBrowserCache();
	}

	@Then("^click on Most Popular PPts$")
	public void click_on_Most_Popular_PPts() throws Throwable {
		mostPopular = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("MOST POPULAR")));
		mostPopular.click();
	}

	@Then("^mouse hover on any of one most Popular PPt$")
	public void mouse_hover_on_any_of_one_most_Popular_PPt() throws Throwable {

		try {
			Thread.sleep(3000);
			select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='box-top']//img[@title='Up Skilling Vector With Progress In Content Writing Ppt PowerPoint Presentation Styles Professional PDF']")));
			Actions action = new Actions(driver);
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			action.moveToElement(select_ppt).perform();
			Thread.sleep(3000);

		} catch (NoSuchElementException e) {

		}
	}

	@Then("^verify the displayed pop-up is visible$")
	public void verify_the_displayed_pop_up_is_visible() throws Throwable {
		// to verify the pop-up
		String display = driver.findElement(By.xpath("//div[@id = 'imgtip237418']")).getCssValue("display");

		System.out.println("display= " + display);

		Assert.assertTrue("pop-up is not visible", display.equals("block")); // if block - visible if none - not
																				// visible
	}

	@Then("^click on Any of page number and verify the listing of most populat ppts$")
	public void click_on_Any_of_page_number_and_verify_the_listing_of_most_populat_ppts() throws Throwable {
		Thread.sleep(3000);
		// click on 7th page number
		page_number = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-info']//ul//li[8]")));
		pageNumber = page_number.getText();
		page_number.click();

		List<WebElement> productSize = driver.findElements(By.xpath("//div[@class='box-row']//a[1]//img[1]"));

		System.out.println("Total product on " + pageNumber + "th page = " + productSize.size());

		product_size = productSize.size();
		Assert.assertTrue("No product is displayed", product_size > 0);
	}

	@Then("^click on any of one Ppt$")
	public void click_on_any_of_one_Ppt() throws Throwable {
		try {
			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^verify the user will navigation on cottect ppt page$")
	public void verify_the_user_will_navigation_on_cottect_ppt_page() throws Throwable {
		// verify the download button
		try {
			Thread.sleep(2000);
			verify_ppt_page = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='download_product']"))).getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Click on signin pageii$")
	public void click_on_signin_pageii() throws Throwable {
		Thread.sleep(3000);
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LOGIN")));
		login.click();
	}

	@Then("^Enter username \"([^\"]*)\" and passwordii \"([^\"]*)\"$")
	public void enter_username_and_passwordii(String username, String password) throws Throwable {
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

	@Then("^Click on Most popular ppts$")
	public void click_on_Most_popular_ppts() throws Throwable {
		Thread.sleep(4000);
		mostPopular = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("MOST POPULAR")));
		mostPopular.click();
	}

	@Then("^Mouse hover on any of one ppti$")
	public void mouse_hover_on_any_of_one_ppti() throws Throwable {
		try {
			Thread.sleep(3000);
			select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='Emerging Marketplace Strategies Growth Ppt PowerPoint Presentation Complete Deck']")));
			Actions action = new Actions(driver);
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			action.moveToElement(select_ppt).perform();
			Thread.sleep(3000);

		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Verify the displayed pop-up is visibleii$")
	public void verify_the_displayed_pop_up_is_visibleii() throws Throwable {
		// to verify the pop-up
		String display = driver.findElement(By.xpath("//div[@id = 'imgtip224364']")).getCssValue("display");

		System.out.println("display= " + display);

		Assert.assertTrue("pop-up is not visible", display.equals("block")); // if block - visible if none - not
																				// visible
	}

	@Then("^Click on any of page number$")
	public void click_on_any_of_page_number() throws Throwable {
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

	@Then("^Click on any of ppt$")
	public void click_on_any_of_ppt() throws Throwable {
		try {
			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[5]/div[1]/a[1]/div[1]/img[1]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^Verify the navigation on cottect ppt page$")
	public void verify_the_navigation_on_cottect_ppt_page() throws Throwable {
		// verify the download button
		try {
			Thread.sleep(4000);
			verify_ppt_page = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn-download pg-button pg-addtocart pg-green-background-btn']"))).getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}
		try {
			Thread.sleep(4000);
			WebElement logout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", logout);
		} catch (NoSuchElementException e) {

		}
	}

}