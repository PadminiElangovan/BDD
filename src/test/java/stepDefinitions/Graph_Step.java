package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import appHook.Hooks;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Graph_Page;
import pages.Home_Page;
import pages.Login_Page;

public class Graph_Step {
	
	Graph_Page graph_page = new Graph_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;
	

@Given("The user is in graph main page after signing in")
public void the_user_is_in_graph_main_page_after_signing_in() {
	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.GraphStrtBtn();
}

@Given("The user is in graph main page")
public void the_user_is_in_graph_main_page() {
	String actualTitle = graph_page.PageTitle();
	String expectedTitle = Login.get(41).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks graph link in gmain page")
public void the_user_clicks_graph_link_in_gmain_page() {
 	graph_page.graphMain();
}

@Then("the user is navigated to graph page")
public void the_user_is_navigated_to_graph_page() {
	String actualTitle = graph_page.PageTitle();
	String expectedTitle = Login.get(41).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("the user is in graph page")
public void the_user_is_in_graph_page() {
	graph_page.graphMain();
}

@Given("The user is on the Try Editor graph page")
public void the_user_is_on_the_try_editor_graph_page() {
	graph_page.graphMain();
	graph_page.tryherebtn();
}

@When("the user clicks Graph Representation link")
public void the_user_clicks_graph_representation_link() {
	graph_page.graphRepMain();
}

@Then("the user is navigated to graphrepresentation page")
public void the_user_is_navigated_to_graphrepresentation_page() {
	String actualTitle = graph_page.PageTitle();
	String expectedTitle = Login.get(42).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("the user is in graphrepresentation page")
public void the_user_is_in_graphrepresentation_page() {
	graph_page.graphRepMain();
	
}

@Given("The user is on the Try Editor graphrepresentation page")
public void the_user_is_on_the_try_editor_graphrepresentation_page() {
	graph_page.graphRepMain();
	graph_page.tryherebtn();
}

}
