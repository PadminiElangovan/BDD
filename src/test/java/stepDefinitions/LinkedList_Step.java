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
import pages.LinkedList_Page;
import pages.Login_Page;


public class LinkedList_Step {
	
	LinkedList_Page linkedlist_page = new LinkedList_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;

@Given("The user logged in to dsAlgo Portal and should be in LinkedList Page")
public void the_user_logged_in_to_ds_algo_portal_and_should_be_in_linked_list_page() {
	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.LinkListStrtBtn();
}

@Given("the user is in the linked list page after Logged in")
public void the_user_is_in_the_linked_list_page_after_logged_in() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(12).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Introduction link")
public void the_user_clicks_introduction_link() {
	linkedlist_page.LLIntroLink();
}

@Then("the user is navigated to Introduction page")
public void the_user_is_navigated_to_introduction_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(13).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks creating linked list link")
public void the_user_clicks_creating_linked_list_link() {

	linkedlist_page.LLCreateLLlink();
}

@Then("the user is navigated to creating linked list page")
public void the_user_is_navigated_to_creating_linked_list_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(14).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Types of linked list link")
public void the_user_clicks_types_of_linked_list_link() {
 
	linkedlist_page.TypeOfLLlink();
}

@Then("the user is navigated to Types of linked list page")
public void the_user_is_navigated_to_types_of_linked_list_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(15).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks implement linked list in python link")
public void the_user_clicks_implement_linked_list_in_python_link() {
	
	linkedlist_page.ImpLLlink();
}

@Then("the user is navigated to implement linked list in python page")
public void the_user_is_navigated_to_implement_linked_list_in_python_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(16).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks traversal link in linked list page")
public void the_user_clicks_traversal_link_in_linked_list_page() {
	linkedlist_page.LLTraversallink();
}

@Then("the user is navigated to traversal page")
public void the_user_is_navigated_to_traversal_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(17).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks insertion link in linked list page")
public void the_user_clicks_insertion_link_in_linked_list_page() {

	linkedlist_page.LLInsertionlink();
}

@Then("the user is navigated to insertion page")
public void the_user_is_navigated_to_insertion_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(18).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks deletion link in linked list page")
public void the_user_clicks_deletion_link_in_linked_list_page() {
	linkedlist_page.LLDeletionlink();
}

@Then("the user is navigated to deletion page")
public void the_user_is_navigated_to_deletion_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(19).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("the user is in Introduction page")
public void the_user_is_in_introduction_page() {
	linkedlist_page.LLIntroLink();
}

@Given("The user is on the Try Editor Introduction page")
public void the_user_is_on_the_try_editor_introduction_page() {
	linkedlist_page.LLIntroLink();
	linkedlist_page.TryHereButton();
}

@Given("the user is in creating linked list page")
public void the_user_is_in_creating_linked_list_page() {
	linkedlist_page.LLCreateLLlink();
}

@Given("The user is on the Try Editor creating linked list page")
public void the_user_is_on_the_try_editor_creating_linked_list_page() {
	linkedlist_page.LLCreateLLlink();
	linkedlist_page.TryHereButton();
}

@Given("the user is in Types of linked list page")
public void the_user_is_in_types_of_linked_list_page() {
	linkedlist_page.TypeOfLLlink();
}

@Given("The user is on the Try Editor Types of linked list page")
public void the_user_is_on_the_try_editor_types_of_linked_list_page() {
	linkedlist_page.TypeOfLLlink();
	linkedlist_page.TryHereButton();
}

@Given("the user is in implement linked list in python page")
public void the_user_is_in_implement_linked_list_in_python_page() {
	linkedlist_page.ImpLLlink();
}

@Given("The user is on the Try Editor implement linked list page")
public void the_user_is_on_the_try_editor_implement_linked_list_page() {
	linkedlist_page.ImpLLlink();
	linkedlist_page.TryHereButton();
}


@When("the user clicks traversal link")
public void the_user_clicks_traversal_link() {
	linkedlist_page.LLTraversallink();
}

@Given("the user is in traversal page")
public void the_user_is_in_traversal_page() {
	linkedlist_page.LLTraversallink();
}

@Given("The user is on the Try Editor traversal page")
public void the_user_is_on_the_try_editor_traversal_page() {
	linkedlist_page.LLTraversallink();
	linkedlist_page.TryHereButton();	
}

@When("the user clicks insertion link")
public void the_user_clicks_insertion_link() {
	linkedlist_page.LLInsertionlink();
}

@Given("the user is in insertion page")
public void the_user_is_in_insertion_page() {
	linkedlist_page.LLInsertionlink();
}

@Given("The user is on the Try Editor insertion page")
public void the_user_is_on_the_try_editor_insertion_page() {
	linkedlist_page.LLInsertionlink();
	linkedlist_page.TryHereButton();
}

@When("the user clicks Deletion link")
public void the_user_clicks_deletion_link() {
	linkedlist_page.LLDeletionlink();
}

@Given("the user is in Deletion page")
public void the_user_is_in_deletion_page() {
	linkedlist_page.LLDeletionlink();
}

@Given("The user is on the Try Editor Deletion page")
public void the_user_is_on_the_try_editor_deletion_page() {
	linkedlist_page.LLDeletionlink();
	linkedlist_page.TryHereButton();
}

@When("the user clicks Practice Questions link")
public void the_user_clicks_practice_questions_link() {
	linkedlist_page.LLPracticeQues();
}

@Then("the user is navigated to Practice Questions page")
public void the_user_is_navigated_to_practice_questions_page() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(43).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Sign out")
public void the_user_clicks_sign_out() {
	linkedlist_page.SignOut();
}

@Then("the user is directed to home page with message Logged out successfully")
public void the_user_is_directed_to_home_page_with_message_logged_out_successfully() {
	String actualTitle = linkedlist_page.PageTitle();
	String expectedTitle = Login.get(0).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
	
	String actualAlert = home_page.LoggedOutAlert();
	String expectedAlert = Login.get(4).get("alert");
	Assert.assertEquals(actualAlert,expectedAlert);

}


}
