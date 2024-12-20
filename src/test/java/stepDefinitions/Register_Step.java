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
import pages.Register_Page;

public class Register_Step {
	
	Register_Page register_page = new Register_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	List<Map<String, String>> Login = Hooks.Login;
	@Given("the User is in the Registration page")
	public void the_user_is_in_the_registration_page() {
		login_page.GetstdButton();
		register_page.RegMainBtn();
	    
	}

	@When("the user enters empty username empty password empty password confirmation")
	public void the_user_enters_empty_username_empty_password_empty_password_confirmation() {
	    register_page.RegisterBtn();
	    
	}

	@Then("the an Please fill out this field. below the username field should be displayed")
	public void the_an_please_fill_out_this_field_below_the_username_field_should_be_displayed() {
	    
		String actualAlert = login_page.errmsg(register_page.usernameField);
		String expectedAlert = Login.get(0).get("alert"); 
		Assert.assertEquals(expectedAlert, actualAlert);
	}

	@When("the user enters valid username empty password empty password confirmation")
	public void the_user_enters_valid_username_empty_password_empty_password_confirmation() {
		String username = Login.get(0).get("username");
	    register_page.UsernameField(username);
	    register_page.RegisterBtn();
	    
	  
	}
	
	@Then("the an Please fill out this field. below the password field should be displayed")
	public void the_an_please_fill_out_this_field_below_the_password_field_should_be_displayed() {
		String actualAlert = login_page.errmsg(register_page.passwordField);
		String expectedAlert = Login.get(0).get("alert"); 
		Assert.assertEquals(expectedAlert, actualAlert);
	   
	}
	@When("the user enters valid username valid1 password empty password confirmation")
	public void the_user_enters_valid_username_valid1_password_empty_password_confirmation() {
		String username = Login.get(0).get("username");
		String password = Login.get(0).get("password");
		register_page.UsernameField(username);
		register_page.PasswordField(password);	
		register_page.RegisterBtn();
		
	}

	@Then("the an Please fill out this field. below the password confirmation field should be displayed")
	public void the_an_please_fill_out_this_field_below_the_password_confirmation_field_should_be_displayed() {
		String actualAlert = login_page.errmsg(register_page.confirmpassField);
		String expectedAlert = Login.get(0).get("alert"); 
		Assert.assertEquals(expectedAlert, actualAlert);
	    
	}

	@When("the user enters valid username invalid password invalid password confirmation")
	public void the_user_enters_valid_username_invalid_password_invalid_password_confirmation() {
		String username = Login.get(5).get("username");
		String password = Login.get(2).get("password");
		String confpwd=   Login.get(2).get("password");
		register_page.UsernameField(username);
		register_page.PasswordField(password);
		register_page.ConfPassField(confpwd);
		register_page.RegisterBtn();	
	    
	}

	@Then("the an Enter the valid password should be displayed")
	public void the_an_enter_the_valid_password_should_be_displayed() {
		String actualAlert = register_page.RegAlert();
		System.out.println(actualAlert);
		String expectedAlert = Login.get(7).get("alert"); 
		Assert.assertEquals(expectedAlert, actualAlert);
	    
	}

	@When("the user enters valid username valid password mismatch password confirmation")
	public void the_user_enters_valid_username_valid_password_mismatch_password_confirmation() {
		String username = Login.get(5).get("username");
		String password = Login.get(0).get("password");
		String confpwd=   Login.get(3).get("password");
		register_page.UsernameField(username);
		register_page.PasswordField(password);
		register_page.ConfPassField(confpwd);
		register_page.RegisterBtn();	
	    
	}

	@Then("the an password mismatch message should be displayed")
	public void the_an_password_mismatch_message_should_be_displayed() {
		String actualAlert = register_page.RegAlert();
		System.out.println(actualAlert);
		String expectedAlert = Login.get(8).get("alert"); 
		Assert.assertTrue(actualAlert.contains(expectedAlert));        
	}

	@When("the user enters existing username existing password existing password confirmation")
	public void the_user_enters_existing_username_existing_password_existing_password_confirmation() {
		String username = Login.get(0).get("username");
		String password = Login.get(0).get("password");
		String confpwd=   Login.get(0).get("password");
		register_page.UsernameField(username);
		register_page.PasswordField(password);
		register_page.ConfPassField(confpwd);
		register_page.RegisterBtn();
	    
	}

	@Then("the an The User is already Registered should be displayed")
	public void the_an_the_user_is_already_registered_should_be_displayed() {
		String actualAlert = register_page.RegAlert();
		String expectedAlert = Login.get(9).get("alert"); 
		Assert.assertEquals(expectedAlert, actualAlert);
	    
	}

	@When("the user enters valid username valid password valid password confirmation")
	public void the_user_enters_valid_username_valid_password_valid_password_confirmation() {
		String username = Login.get(5).get("username");
		String password = Login.get(0).get("password");
		String confpwd=   Login.get(0).get("password");
		register_page.UsernameField(username);
		register_page.PasswordField(password);
		register_page.ConfPassField(confpwd);
		register_page.RegisterBtn();
	    
	}

	@Then("the an Successfully registered should be displayed")
	public void the_an_successfully_registered_should_be_displayed() {
		String actualAlert = register_page.RegSuccessAlert();
		String expectedAlert = Login.get(10).get("alert"); 
		Assert.assertTrue(actualAlert.contains(expectedAlert));        
	    
	}
	@When("the user enters invalid username valid password valid password confirmation")
	public void the_user_enters_invalid_username_valid_password_valid_password_confirmation() {
		String username = Login.get(6).get("username");
		String password = Login.get(0).get("password");
		String confpwd=   Login.get(0).get("password");
		register_page.UsernameField(username);
		register_page.PasswordField(password);
		register_page.ConfPassField(confpwd);
		register_page.RegisterBtn();
	    
	}

	@Then("the an Invalid username should be displayed")
	public void the_an_invalid_username_should_be_displayed() {
		String actualAlert = register_page.RegAlert();
		String expectedAlert = Login.get(11).get("alert"); 
		Assert.assertEquals(expectedAlert, actualAlert);
	    
	}
	@When("the user clicks login link")
	public void the_user_clicks_login_link() {
		register_page.LoginLinkBtn();
	    
	}
	@Then("The user should be redirected to the Login Page")
	public void the_user_should_be_redirected_to_the_login_page() {
		String actualTitle = login_page.PageTitle();
		 String expectedTitle = Login.get(44).get("title"); 
		 Assert.assertEquals(actualTitle, expectedTitle);

		
	}


}
