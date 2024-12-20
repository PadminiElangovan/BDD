package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import appHook.Hooks;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_Page;

public class Login_Step {
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	
    List<Map<String, String>> Login = Hooks.Login; 
  

@Given("The user is on the DS Algo Home Page")
public void the_user_is_on_the_ds_algo_home_page() {
login_page.CurrentUrl();
}

@When("The user clicks the Getstarted tab")
public void the_user_clicks_the_getstarted_tab() {
login_page.GetstdButton();

}

@Then("The user should be redirected to the Sign-in page")
public void the_user_should_be_redirected_to_the_sign_in_page() {
 String signinpgTitle = login_page.PageTitle();
 String expectedTitle = Login.get(0).get("title"); 
 Assert.assertEquals(signinpgTitle, expectedTitle);

}

@Given("The user is on the DS Algo Sign-in Page")
public void the_user_is_on_the_ds_algo_sign_in_page() {
login_page.GetstdButton();
login_page.SigninButton();

}

@When("The user clicks LOGIN button with no inputs")
public void the_user_clicks_login_button_with_no_inputs() {
login_page.LoginButton();    
}

@Then("The error message Please fill out this field. appears below the Username textbox")
public void the_error_message_please_fill_out_this_field_appears_below_the_username_textbox() {
String actualAlert = login_page.errmsg(login_page.usernameField);
String expectedAlert = Login.get(0).get("alert"); 
Assert.assertEquals(expectedAlert, actualAlert);
}

@When("The user enters validUsername and leaves the password empty")
public void the_user_enters_valid_username_and_leaves_the_password_empty() {
 String username = Login.get(0).get("username");
 login_page.emptyPassword(username);
 login_page.LoginButton();

}

@Then("The error message Please fill out this field. appears below the Password textbox")
public void the_error_message_please_fill_out_this_field_appears_below_the_password_textbox() {
 String actualAlert = login_page.errmsg(login_page.passwordField);
 String expectedAlert = Login.get(0).get("alert"); 
 Assert.assertEquals(expectedAlert, actualAlert);
}

@When("The user enters validPassword and leaves the username empty")
public void the_user_enters_valid_password_and_leaves_the_username_empty() {
String username = Login.get(2).get("username");
String password = Login.get(0).get("password");  
login_page.SigninButton();
login_page.emptyUsername(username, password);
login_page.LoginButton();

}

@When("The user enters invalidUsername and invalidPassword")
public void the_user_enters_invalid_username_and_invalid_password() {
 String username = Login.get(1).get("username");  
 String password = Login.get(0).get("password"); 
 login_page.Credentials(username, password);
 login_page.LoginButton();
}

@Then("The error message Invalid Username and Password. should be displayed")
public void the_error_message_invalid_username_and_password_should_be_displayed() {
 String actualAlert = login_page.InvalidcredAlert();
 System.out.println(actualAlert);
 String expectedAlert = Login.get(1).get("alert"); 
 Assert.assertEquals(expectedAlert, actualAlert);
}

@When("The user enters validUsername and validPassword")
public void the_user_enters_valid_username_and_valid_password() {
		login_page.LoginwithvalidCred();
}

@Then("The user should navigate to the Data Structure Home Page with the message You are logged in")
public void the_user_should_navigate_to_the_data_structure_home_page_with_the_message_you_are_logged_in() {
 String actualAlert = login_page.LoginAlert();
 String expectedAlert = Login.get(2).get("alert"); 
 Assert.assertEquals(expectedAlert, actualAlert);
}

}
