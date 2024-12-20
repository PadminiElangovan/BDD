package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import appHook.Hooks;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home_Page;
import pages.Login_Page;
import pages.Stack_Page;

public class Stack_Step {
	
	Stack_Page stack_page = new Stack_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;

@Given("The user is in Stack main page after signing in")
public void the_user_is_in_stack_main_page_after_signing_in() {

	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.StackStrtBtn();
}

@Given("user is on the Stack Introduction page")
public void user_is_on_the_stack_introduction_page() {
	String actualTitle = stack_page.PageTitle();
	String expectedTitle = Login.get(20).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("user clicks on Operations in Stack link")
public void user_clicks_on_operations_in_stack_link() {

	stack_page.operationsinStack();
}

@Then("user navigated to operations in stack page")
public void user_navigated_to_operations_in_stack_page() {
	String actualTitle = stack_page.PageTitle();
	String expectedTitle = Login.get(21).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("the user is in operations in stack page")
public void the_user_is_in_operations_in_stack_page() {
	stack_page.operationsinStack();
}

@Given("The user is on the tryEditor page of Opinstack")
public void the_user_is_on_the_try_editor_page_of_opinstack() {
	stack_page.operationsinStack();
	stack_page.TryHere();
}

@When("user clicks on implementations link")
public void user_clicks_on_implementations_link() {

	stack_page.implementation();
}

@Then("user is navigated to implementation page")
public void user_is_navigated_to_implementation_page() {
	String actualTitle = stack_page.PageTitle();
	String expectedTitle = Login.get(22).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("user is on the Implementation page")
public void user_is_on_the_implementation_page() {
	stack_page.implementation();
}

@Given("The user is on the tryEditor page of Implentation")
public void the_user_is_on_the_try_editor_page_of_implentation() {
	stack_page.implementation();
	stack_page.TryHere();
}

@When("user clicks on Applications link")
public void user_clicks_on_applications_link() {
	stack_page.applications();
}

@Then("user is navigated to stack-applications page")
public void user_is_navigated_to_stack_applications_page() {
	String actualTitle = stack_page.PageTitle();
	String expectedTitle = Login.get(23).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("user is on the stack applications page")
public void user_is_on_the_stack_applications_page() {
	stack_page.applications();
}

@Given("The user is on the tryEditor page of applications")
public void the_user_is_on_the_try_editor_page_of_applications() {
	stack_page.applications();
	stack_page.TryHere();
}
}
