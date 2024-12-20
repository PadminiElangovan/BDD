package stepDefinitions;

import org.testng.Assert;
import java.util.List;
import java.util.Map;

import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home_Page;
import pages.Login_Page;
import pages.Queue_Page;
import appHook.Hooks;

public class Queue_Step {
	
	Queue_Page queue_page = new Queue_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;

@Given("The user logged in to dsAlgo Portal and should be in Queue Page")
public void the_user_logged_in_to_ds_algo_portal_and_should_be_in_queue_page() {
	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.QueueStrtBtn();
}

@Given("the user is in the queue page after logged in")
public void the_user_is_in_the_queue_page_after_logged_in() {
	String actualTitle = queue_page.PageTitle();
	String expectedTitle = Login.get(24).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks implementation of queue in python link")
public void the_user_clicks_implementation_of_queue_in_python_link() {
    queue_page.ImpQueueLink();
}

@Then("the user is navigated to implementation of queue in python page")
public void the_user_is_navigated_to_implementation_of_queue_in_python_page() {
	String actualTitle = queue_page.PageTitle();
	String expectedTitle = Login.get(25).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks implementation using collections deque link in queue page")
public void the_user_clicks_implementation_using_collections_deque_link_in_queue_page() {
	queue_page.ImpCollLink();
}

@Then("the user is navigated to implementation using collections deque page")
public void the_user_is_navigated_to_implementation_using_collections_deque_page() {
	String actualTitle = queue_page.PageTitle();
	String expectedTitle = Login.get(26).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);  
}

@When("the user clicks implementation using array link in queue page")
public void the_user_clicks_implementation_using_array_link_in_queue_page() {
	queue_page.ImpArryLink();
}

@Then("the user is navigated to implementation using array page")
public void the_user_is_navigated_to_implementation_using_array_page() {
	String actualTitle = queue_page.PageTitle();
	String expectedTitle = Login.get(27).get("title");
	Assert.assertEquals(actualTitle, expectedTitle); 
}

@When("the user clicks queue operations link")
public void the_user_clicks_queue_operations_link() {
	queue_page.QueueOprLink();
}

@Then("the user is navigated to queue operations page")
public void the_user_is_navigated_to_queue_operations_page() {
	String actualTitle = queue_page.PageTitle();
	String expectedTitle = Login.get(28).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);      
}

@Given("the user is in implementation of queue in python page")
public void the_user_is_in_implementation_of_queue_in_python_page() {
	queue_page.ImpQueueLink();
}

@When("the user clicks Try here>>> button")
public void the_user_clicks_try_here_button() {
	queue_page.Tryhere();
}

@Then("the user is navigated to tryeditor window")
public void the_user_is_navigated_to_tryeditor_window() {
	String actualTitle = queue_page.PageTitle();
	String expectedTitle = Login.get(3).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
	}

@Given("The user is on the Try Editor implementation of queue page")
public void the_user_is_on_the_try_editor_implementation_of_queue_page() {
	queue_page.ImpQueueLink();
	queue_page.Tryhere();
}

@When("the user click browser back arrow")
public void the_user_click_browser_back_arrow() {
    queue_page.BrowserBack();
}

@When("the user clicks implementation using collections deque link")
public void the_user_clicks_implementation_using_collections_deque_link() {
	queue_page.ImpCollLink();
}

@Given("the user is in implementation using collections deque page")
public void the_user_is_in_implementation_using_collections_deque_page() {
	queue_page.ImpCollLink();
}

@Given("The user is on the Try Editor implementation using collections deque page")
public void the_user_is_on_the_try_editor_implementation_using_collections_deque_page() {
	queue_page.ImpCollLink();
	queue_page.Tryhere();
}

@When("the user clicks implementation using array link")
public void the_user_clicks_implementation_using_array_link() {
	queue_page.ImpArryLink();
}

@Given("the user is in implementation using array page")
public void the_user_is_in_implementation_using_array_page() {
	queue_page.ImpArryLink();
}

@Given("The user is on the Try Editor implementation using array page")
public void the_user_is_on_the_try_editor_implementation_using_array_page() {
	queue_page.ImpArryLink();
	queue_page.Tryhere();
}

@Given("the user is in queue operations page")
public void the_user_is_in_queue_operations_page() {
	queue_page.QueueOprLink();
}

@Given("The user is on the Try Editor queue operations page")
public void the_user_is_on_the_try_editor_queue_operations_page() {
	queue_page.QueueOprLink();
	queue_page.Tryhere();
}
}