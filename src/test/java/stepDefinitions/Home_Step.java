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

public class Home_Step {
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;
	
	@Given("The user clicks the Datastructure dropdown")
	public void the_user_clicks_the_datastructure_dropdown() {
	    home_page.OpenDropDown();
	    
	}

	@When("The user clicks the Arrays from the dropdown")
	public void the_user_clicks_the_arrays_from_the_dropdown() {
		home_page.Arraydrpdwn();
	    
	}

	@Then("The user should be navigated to Array page")
	public void the_user_should_be_navigated_to_array_page() {
	    
		String actualTitle = login_page.PageTitle();
 	    String expectedTitle = Login.get(7).get("title");
        Assert.assertEquals(actualTitle,expectedTitle);
	}

	@When("The user clicks the Linked List from the dropdown")
	public void the_user_clicks_the_linked_list_from_the_dropdown() {
	    
		home_page.LinkListdrpdwn();
	}

	@Then("The user should be navigated to Linked List page")
	public void the_user_should_be_navigated_to_linked_list_page() {
	
		String actualTitle = login_page.PageTitle();
 	    String expectedTitle = Login.get(12).get("title");
        Assert.assertEquals(actualTitle,expectedTitle);    
	}

	@When("The user clicks the Stack from the dropdown")
	public void the_user_clicks_the_stack_from_the_dropdown() {
		home_page.Stackdrpdwn();
	    
	}

	@Then("The user should be navigated to Stack page")
	public void the_user_should_be_navigated_to_stack_page() {
		String actualTitle = login_page.PageTitle();
 	    String expectedTitle = Login.get(20).get("title");
        Assert.assertEquals(actualTitle,expectedTitle);    
	    
	}

	@When("The user clicks the Queue from the dropdown")
	public void the_user_clicks_the_queue_from_the_dropdown() {
		home_page.Queuedrpdwn();
	    
	}

	@Then("The user should be navigated to Queue page")
	public void the_user_should_be_navigated_to_queue_page() {
		String actualTitle = login_page.PageTitle();
 	    String expectedTitle = Login.get(24).get("title");
        Assert.assertEquals(actualTitle,expectedTitle);    
	    
	}

	@When("The user clicks the Tree from the dropdown")
	public void the_user_clicks_the_tree_from_the_dropdown() {
		home_page.Treedrpdwn();
	    
	}

	@Then("The user should be navigated to Tree page")
	public void the_user_should_be_navigated_to_tree_page() {
		String actualTitle = login_page.PageTitle();
 	    String expectedTitle = Login.get(2).get("title");
        Assert.assertEquals(actualTitle,expectedTitle);    
	    
	}

	@When("The user clicks the Graph from the dropdown")
	public void the_user_clicks_the_graph_from_the_dropdown() {
	    
		home_page.Graphdrpdwn();
	}

	@Then("The user should be navigated to Graph page")
	public void the_user_should_be_navigated_to_graph_page() {
		String actualTitle = login_page.PageTitle();
 	    String expectedTitle = Login.get(41).get("title");
        Assert.assertEquals(actualTitle,expectedTitle);    
	    
	}

	@When("The user clicks the Arrays button")
	public void the_user_clicks_the_arrays_button() {
		home_page.ArrayStrtBtn();
	    
	}

	@When("The user clicks the Linked List button")
	public void the_user_clicks_the_linked_list_button() {
		home_page.LinkListStrtBtn();
	    
	}

	@When("The user clicks the Stack button")
	public void the_user_clicks_the_stack_button() {
		home_page.StackStrtBtn();
	    
	}

	@When("The user clicks the Queue button")
	public void the_user_clicks_the_queue_button() {
	    
		home_page.QueueStrtBtn();
	}

	@When("The user clicks the Tree button")
	public void the_user_clicks_the_tree_button() {
		home_page.TreeStrtBtn();
	    
	}

	@When("The user clicks the Graph button")
	public void the_user_clicks_the_graph_button() {
		home_page.GraphStrtBtn();
	    
	}
	
}
