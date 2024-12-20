package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import appHook.Hooks;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Datastructure_Page;
import pages.Home_Page;
import pages.Login_Page;

public class Datastructure_Step {
	Datastructure_Page datastructure_page = new Datastructure_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;

@Given("The user logged in to dsAlgo Portal and should be in DataStructure Page")
public void the_user_logged_in_to_ds_algo_portal_and_should_be_in_data_structure_page() {
	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.DataStructureStrtBtn();
}

@Given("the user is in the DataStructure page after logged in")
public void the_user_is_in_the_data_structure_page_after_logged_in() {
	String actualTitle = datastructure_page.PageTitle();
	String expectedTitle = Login.get(5).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks DataStructure in timeComplixity link")
public void the_user_clicks_data_structure_in_time_complixity_link() {
	datastructure_page.TimeComplexityLink();
}

@Then("the user is navigated to DataStructure in timeComplixity page")
public void the_user_is_navigated_to_data_structure_in_time_complixity_page() {
	String actualTitle = datastructure_page.PageTitle();
	String expectedTitle = Login.get(6).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("the user is in DataStructure of timeComplixity page")
public void the_user_is_in_data_structure_of_time_complixity_page() {
	datastructure_page.TimeComplexityLink();
}

@Given("The user is on the Try Editor DataStructure in timeComplixity page")
public void the_user_is_on_the_try_editor_data_structure_in_time_complixity_page() {
	datastructure_page.TimeComplexityLink();
	datastructure_page.Tryhere();	
}


}
