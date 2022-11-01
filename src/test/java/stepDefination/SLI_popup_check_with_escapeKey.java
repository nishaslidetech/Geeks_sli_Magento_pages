package stepDefination;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SetUpClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SLI_popup_check_with_escapeKey extends BaseClass {
	public String pop_up_Value;
	public String pop_up_visible = "block";
	public String pop_up_not_visible = "none";
	public WebElement search_field;

	@Given("Now user is on Home Page")
	public void Now_user_is_on_home_page() throws Throwable {
		driver.get(AppURL);
		log.info("It's opening the website URL");
		BaseClass.ClearBrowserCache();
	}

	@Then("Enter data in search field")
	public void enter_data_in_search_field() throws Throwable {

		try {
			search_field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			search_field.sendKeys("HR");
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {

		}

	}

	@Then("press escape key")
	public void press_escape_key() throws Throwable {

		try {
			Thread.sleep(2000);
			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");

			System.out.println("pop-up value before pressing Escape key1 =  " + pop_up_Value);
			if (pop_up_Value.equals(pop_up_visible)) {

				Actions action = new Actions(driver);
				action.sendKeys(Keys.ESCAPE).build().perform();
				
			} else {

				System.out.println("pop-up is not displayed before pressing Escape key1 " + pop_up_Value);
				assertTrue(pop_up_Value.equals(pop_up_visible));
			}
		} catch (NoSuchElementException e) {
		}

	}

	@Then("verify the pop-up")
	public void verify_the_pop_up() throws Throwable {

		try {
			Thread.sleep(3000);
			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");
			System.out.println("pop-up is displayed after pressing Escape key1 " + pop_up_Value);
			assertTrue(pop_up_Value.equals(pop_up_not_visible));
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {

		}

	}

	@Then("^open Sli listing page and verify the pop-up$")
	public void open_Sli_listing_page_and_verify_the_pop_up() throws Throwable {

		try {
			search_field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			search_field.clear();
			search_field.sendKeys("HR");
			Thread.sleep(4000);

			// click on "hr report" in left navigation bar

			WebElement hrBudget = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//div[@Class='sli_ac_suggestions']//ul//li[5]")));
			hrBudget.click();
			Thread.sleep(3000);

			// Clear the search field and enter "Management" on sli listing pagea and verify
			// // the pop-up
			search_field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			search_field.clear();
			search_field.sendKeys("Software");
			Thread.sleep(3000);

			// Pressed ESC key after pop-up is visible else script got failed

			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");
			System.out.println("pop-up value before pressing Escape key2 =  " + pop_up_Value);
			if (pop_up_Value.equals(pop_up_visible)) {

				Actions action = new Actions(driver);
				action.sendKeys(Keys.ESCAPE).build().perform();
			} else {

				System.out.println("pop-up is not displayed before pressing Escape key2 " + pop_up_Value);
				assertTrue(pop_up_Value.equals(pop_up_visible));
			}

			// verify the pop-up should not visible after pressing Escape key

			Thread.sleep(3000);
			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");
			System.out.println("pop-up is displayed after pressing Escape key2 " + pop_up_Value);
			assertTrue(pop_up_Value.equals(pop_up_not_visible));
			Thread.sleep(2000);

		} catch (NoSuchElementException e) {

		}

	}

	@Then("Click on Sign in button")
	public void click_on_sign_in_button() throws Throwable {

		try {
			search_field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			search_field.clear();
			Thread.sleep(2000);

			WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LOGIN")));
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", login);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {

		}

	}

	@Then("Enter free valid username and password")
	public void enter_free_valid_username_and_password() throws InterruptedException {

		Thread.sleep(3000);
		try {
			WebElement email = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='E-mail Address']")));
			email.sendKeys("qaslidegeeks@gmail.com");

			WebElement password_field = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
			password_field.sendKeys("Qwerty@1");
			Thread.sleep(2000);

			WebElement login_btn = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Submit']")));
			login_btn.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {

		}

	}

	@Then("enter data in Search fields")
	public void enter_data_in_Search_fields() throws Throwable {

		try {
			Thread.sleep(3000);
			search_field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			search_field.sendKeys("Management");
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

	}

	@Then("Press Escape key")
	public void press_Escape_key() throws Throwable {

		try {
			Thread.sleep(3000);
			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");
			System.out.println("pop-up is not displayed before pressing Escape key3 " + pop_up_Value);
			if (pop_up_Value.equals(pop_up_visible)) {

				Actions action = new Actions(driver);
				action.sendKeys(Keys.ESCAPE).build().perform();

			} else {

				System.out.println("pop-up is not displayed before pressing Escape key3 " + pop_up_Value);
				assertTrue(pop_up_Value.equals(pop_up_visible));
			}
		} catch (NoSuchElementException e) {
		}

	}

	@Then("verify the Pop-up")
	public void verify_the_Pop_up() throws Throwable {

		try {
			Thread.sleep(3000);
			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");
			System.out.println("pop-up is displayed after pressing Escape key3 " + pop_up_Value);
			assertTrue(pop_up_Value.equals(pop_up_not_visible));

			search_field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			search_field.clear();
			Thread.sleep(3000);

		} catch (NoSuchElementException e) {

		}

	}

	@Then("^open Sli listing pages and verify the pop-up$")
	public void open_Sli_listing_pages_and_verify_the_pop_up() throws Throwable {

		try {
			search_field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
			search_field.clear();
			search_field.sendKeys("Management");
			Thread.sleep(3000);

			// click on "hr report" in left navigation bar

			WebElement change_Management_Decks = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//div[@Class='sli_ac_suggestions']//ul//li[6]")));
			change_Management_Decks.click();
			System.out.println();

			// Clear the search field and enter "Management" on sli listing page
			Thread.sleep(2000);
			search_field = BaseClass.elementToBeClickable(By.xpath("//input[@id='search-input']"));
			search_field.clear();
			search_field.sendKeys("HR");
			Thread.sleep(4000);

			// Pressed ESC key after pop-up is visible else script got failed

			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");
			System.out.println("pop-up value before pressing Escape key4 =  " + pop_up_Value);
			if (pop_up_Value.equals(pop_up_visible)) {

				Actions action = new Actions(driver);
				action.sendKeys(Keys.ESCAPE).build().perform();

			} else {

				System.out.println("pop-up is not displayed before pressing Escape key4 " + pop_up_Value);
				assertTrue(pop_up_Value.equals(pop_up_visible));
			}

			// verify the pop-up should not visible after pressing Escape key

			Thread.sleep(3000);
			pop_up_Value = BaseClass.precenceOfElement(By.xpath("//ul[@id='sli_autocomplete']")).getCssValue("display");
			System.out.println("pop-up is displayed after pressing Escape key4 " + pop_up_Value);
			assertTrue(pop_up_Value.equals(pop_up_not_visible));
			Thread.sleep(4000);

		} catch (NoSuchElementException e) {

		}

	}

	@Then("^Click on the sign out button$")
	public void click_on_the_sign_out_button() throws Throwable {

		try {
			Thread.sleep(4000);
			WebElement logout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", logout);
		} catch (NoSuchElementException e) {

		}

	}

}