package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SetUpClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Sli_listing_pagination extends BaseClass {

	public WebElement searchField;
	public int product_size;
	public String pageNumber;
	public WebElement select_ppt;
	public String verify_ppt_page;
	public WebElement page_number;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver.get(AppURL);
		log.info("It's opening the website URL");
		BaseClass.ClearBrowserCache();

	}

	@Test
	@Then("^Enter keyword \"([^\"]*)\" in search field$")
	public void enter_keyword_in_search_field(String text) throws Throwable {
				/*try {
			searchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			searchField.sendKeys(text);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^Go to the listing page$")
	public void go_to_the_listing_page() throws Throwable {
				/*try {
			WebElement softwareTesting = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//div[@Class='sli_ac_suggestions']//ul//li[6]")));
			Thread.sleep(3000);
			softwareTesting.click();
			System.out.println();
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^mouse hover on any of one ppts$")
	public void mouse_hover_on_any_of_one_ppts() throws Throwable {
				/*try {
			Thread.sleep(3000);
			select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//img[@title='Software Architecture Microservices Platform Ppt PowerPoint Presentation Infographic Template Show']")));
			Actions action = new Actions(driver);
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			action.moveToElement(select_ppt).perform();
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^verify the whether the pop-up is visible$")
	public void verify_the_whether_the_pop_up_is_visible() throws Throwable {
		// to verify the pop-up
				/*Thread.sleep(4000);

		String display = BaseClass.elementToBeClickable(By.xpath("//div[@id = 'imgtip182213']")).getCssValue("display");

		System.out.println("display= " + display);

		Assert.assertTrue("pop-up is not visible", display.equals("block")); */// if block - visible if none - not
																				// visible
	}

	@Test
	@Then("^click on any of page number and verify the product below$")
	public void click_on_any_of_page_number_and_verify_the_product_below() throws Throwable {
				/*Thread.sleep(3000);
		// click on 7th page number
		page_number = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-info sli_generic_container']//ul//li[8]")));
		pageNumber = page_number.getText();
		page_number.click();

		List<WebElement> productSize = driver.findElements(By.xpath("//div[@class='box-row sli_container  ']//a//img"));

		System.out.println("Total product on " + pageNumber + "th page = " + productSize.size());

		product_size = productSize.size();
		Assert.assertTrue("No product is displayed", product_size > 0);*/
	}

	@Test
	@Then("^click on any of ppt$")
	public void click_on_any_of_ppt() throws Throwable {
				/*try {
			WebElement select_ppt = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@class = 'box-row sli_container  ']//div[3]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^verify the ppt page$")
	public void verify_the_ppt_page() throws Throwable {
		// verify the download button
				/*try {
			Thread.sleep(4000);
			verify_ppt_page = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='download_product']"))).getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^Click on signup page$")
	public void click_on_signup_page() throws Throwable {
		/*Thread.sleep(3000);
		WebElement sign_in = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LOGIN")));
		sign_in.click();*/
	}

	@Test
	@Then("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String username, String password) throws Throwable {
				/*Thread.sleep(3000);
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
		}*/
	}

	@Test
	@Then("^Enter keyword \"([^\"]*)\" in search fields$")
	public void enter_keyword_in_search_fields(String text1) throws Throwable {
				/*try {
			searchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			searchField.sendKeys(text1);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^Go to the listing pagei$")
	public void go_to_the_listing_pagei() throws Throwable {
				/*try {
			WebElement workProgress = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//div[@Class='sli_ac_suggestions']//ul//li[5]")));
			workProgress.click();
			System.out.println();
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^mouse hover on any of one pptsi$")
	public void mouse_hover_on_any_of_one_pptsi() throws Throwable {
				/*try {
			Thread.sleep(3000);
			select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//img[@title='Employee Project Progress Report With Upcoming Work Ppt PowerPoint Presentation File Example Introduction PDF']")));
			Actions action = new Actions(driver);
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			action.moveToElement(select_ppt).perform();
			Thread.sleep(3000);

		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^verify the whether the pop-up is visiblei$")
	public void verify_the_whether_the_pop_up_is_visiblei() throws Throwable {

		// to verify the pop-up
				/*String display = driver.findElement(By.xpath("//div[@id = 'imgtip299832']")).getCssValue("display");

		System.out.println("display= " + display);

		Assert.assertTrue("pop-up is not visible", display.equals("block")); */// if block - visible if none - not
																				// visible
	}

	@Test
	@Then("^click on Any of page number and verify the listing pagebelowi$")
	public void click_on_Any_of_page_number_and_verify_the_listing_pagebelowi() throws Throwable {
				/*Thread.sleep(3000);
		// click on 7th page number
		page_number = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-info sli_generic_container']//ul//li[8]")));
		pageNumber = page_number.getText();
		js.executeScript("arguments[0].scrollIntoView();", page_number);
		js.executeScript("arguments[0].click();", page_number);

		List<WebElement> productSize = driver.findElements(By.xpath("//div[@class='box-row sli_container  ']//a//img"));

		System.out.println("Total product on " + pageNumber + "th page = " + productSize.size());

		product_size = productSize.size();
		Assert.assertTrue("No product is displayed", product_size > 0);*/
	}

	@Test
	@Then("^click on any of ppti$")
	public void click_on_any_of_ppti() throws Throwable {
				/*try {
			Thread.sleep(2000);
			WebElement select_ppt = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@class = 'box-row sli_container  ']//div[4]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			js.executeScript("arguments[0].click();", select_ppt);
			//select_ppt.click();
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	@Then("^verify the navigation on cottect ppt pageii$")
	public void verify_the_navigation_on_cottect_ppt_pageii() throws Throwable {
		// verify the download button
				/*try {
			Thread.sleep(4000);
			verify_ppt_page = BaseClass.elementToBeClickable(By.xpath(
					"//a[@class='btn-download pg-button pg-addtocart pg-green-background-btn vwo_subscribe_click']"))
					.getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this Presentation"));
		} catch (NoSuchElementException e) {

		}*/
	}

	@Test
	
	@Then("^click on Sign out button and verify the pagei$")
	public void click_on_Sign_out_button_and_verify_the_pagei() throws Throwable {
		/*try {
			Thread.sleep(4000);
			WebElement logout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", logout);
		} catch (NoSuchElementException e) {

		}*/
	}

}
