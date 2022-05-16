package SetUpClass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(features = { "." }, glue = { "stepDefination" }, // tags= {"@Free_Magento_pages_test"},
		plugin = { "pretty", "html:target/cucumber-pretty"})

public class TestRunner {

	@BeforeClass
	public static void beforeClass() throws Exception {
		BaseClass.before_Class();
	}

	@AfterClass
	public static void afterClass() throws Exception {
		BaseClass.after_Class();
	}
	
}
