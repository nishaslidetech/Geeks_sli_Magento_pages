package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SetUpClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Widgets_pages extends BaseClass {

	@Given("^Go to the home page$")
	public void go_to_the_home_page() throws Throwable {
		driver.get(AppURL);
		log.info("It's opening the website URL");
		BaseClass.ClearBrowserCache();
	}

	@Then("^scroll down the page and select any of one ppt$")
	public void scroll_down_the_page_and_select_any_of_one_ppt() throws Throwable {
		Thread.sleep(3000);

		try {
			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//div[@class='heading-wrapper reports-wrapper']//div[2]//div[1]/div[1]//div[1]//a[1]//div[1]//img[1]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();
		} catch (NoSuchElementException e) {

		}
	}

	@Then("^verify the download button$")
	public void verify_the_download_button() throws Throwable {
		// verify the download button

		try {
			Thread.sleep(4000);
			String verify_ppt_page = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='download_product']"))).getText();
			Assert.assertTrue("user is not on corect page", verify_ppt_page.contains("Download this presentation"));
		} catch (NoSuchElementException e) {

		}
	}

}
