package testRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import common.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class) 
@CucumberOptions(
		plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
		monochrome=false,  //console output color
		tags="@Login", //tags from feature file
		features = {"src/test/resources/Feature files"}, //location of feature files
		glue= {"stepDefinitions","appHook"}) //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@BeforeTest
		@Parameters({"browser"})
		public void defineBrowser(String browser) throws Throwable {
			ConfigReader.properties.setProperty("Browser", browser);
		} 

		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    } 

}