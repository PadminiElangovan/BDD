	package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import appHook.Hooks;
import common.Util;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Array_Page;
import pages.Home_Page;
import pages.Login_Page;
import pages.Tree_Page;


public class Array_Step {
	WebDriver driver;
	
	Array_Page array_page= new Array_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	Tree_Page tree_page = new Tree_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;
	List<Map<String, String>> Code = Hooks.Code;
	Util util =new Util();
	

@Given("The user logged in to dsAlgo Portal and should be in Array Page")
public void the_user_logged_in_to_ds_algo_portal_and_should_be_in_array_page() {
	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.ArrayStrtBtn();
}

@Given("the user is in the Array page after logged in")
public void the_user_is_in_the_array_page_after_logged_in() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(7).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Arrays in Python link")
public void the_user_clicks_arrays_in_python_link() {
	array_page.clickOnarraysInPythonLink();
}

@Then("the user is navigated to Arrays in Python page")
public void the_user_is_navigated_to_arrays_in_python_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(8).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Arrays using List link")
public void the_user_clicks_arrays_using_list_link() {
	array_page.clickArraysUsingList();
}

@Then("the user is navigated to Arrays using List page")
public void the_user_is_navigated_to_arrays_using_list_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(9).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Basic operations in Lists link")
public void the_user_clicks_basic_operations_in_lists_link() {
	array_page.clickBasicOpInLists();
}

@Then("the user is navigated to Basic operations in Lists page")
public void the_user_is_navigated_to_basic_operations_in_lists_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(10).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Applications of Array in link")
public void the_user_clicks_applications_of_array_in_link() {
	array_page.clickAppOfArray();
}

@Then("the user is navigated to Applications of Array page")
public void the_user_is_navigated_to_applications_of_array_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(11).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("the user is in Arrays in Python page")
public void the_user_is_in_arrays_in_python_page() {
	array_page.clickOnarraysInPythonLink();
}

@Given("The user is on the Try Editor of Arrays in Python page")
public void the_user_is_on_the_try_editor_of_arrays_in_python_page() {
	array_page.clickOnarraysInPythonLink();
	array_page.OnClickTryhere();
}

@Given("the user is in Arrays Using List page")
public void the_user_is_in_arrays_using_list_page() {
	array_page.clickArraysUsingList();	
}

@Given("The user is on the Try Editor Arrays Using List page")
public void the_user_is_on_the_try_editor_arrays_using_list_page() {
	array_page.clickArraysUsingList();
	array_page.OnClickTryhere();
}

@Given("the user is in Basic Operations in Lists page")
public void the_user_is_in_basic_operations_in_lists_page() {
	array_page.clickBasicOpInLists();
}

@Given("The user is on the Try Editor Basic Operations in Lists page")
public void the_user_is_on_the_try_editor_basic_operations_in_lists_page() {
	array_page.clickBasicOpInLists();
	array_page.OnClickTryhere();
}

@Given("the user is in Applications of Array page")
public void the_user_is_in_applications_of_array_page() {
	array_page.clickAppOfArray();
}

@Given("The user is on the Try Editor Applications of Array page")
public void the_user_is_on_the_try_editor_applications_of_array_page() {
	array_page.clickAppOfArray();
	array_page.OnClickTryhere();
}
//---------------------------------------------------------------------------------------------------------------------------------------
//Navigation to Practice Question Pages
@Given("the user is in Practice Question main page")
public void the_user_is_in_practice_question_main_page() {
	array_page.clickOnarraysInPythonLink();
	array_page.PracticeQues(); 
}

@When("the user clicks search the Array")
public void the_user_clicks_search_the_array() {
    array_page.SearchArray();
    
}

@Then("the should be navigated to Question1 page page")
public void the_should_be_navigated_to_question1_page_page() {
	String actualUrl = array_page.url();
	String expectedUrl = Code.get(0).get("url");
	Assert.assertEquals(actualUrl, expectedUrl);
       
}

@When("the user clicks Max Cons Ones")
public void the_user_clicks_max_cons_ones() {
    array_page.Maxconsones();  
}

@Then("the should be navigated to Question2 page page")
public void the_should_be_navigated_to_question2_page_page() {
	String actualUrl = array_page.url();
	String expectedUrl = Code.get(1).get("url");
	Assert.assertEquals(actualUrl, expectedUrl);
    
}

@When("the user clicks Find even no digit")
public void the_user_clicks_find_even_no_digit() {
    array_page.Findevendigits();    
}

@Then("the should be navigated to Question3 page page")
public void the_should_be_navigated_to_question3_page_page() {
	String actualUrl = array_page.url();
	String expectedUrl = Code.get(2).get("url");
	Assert.assertEquals(actualUrl, expectedUrl);
    
}

@When("the user clicks Sq of sorted Array")
public void the_user_clicks_sq_of_sorted_array() {
    array_page.SquaresofSortredArray();
    
}

@Then("the should be navigated to Question4 page page")
public void the_should_be_navigated_to_question4_page_page() {
	String actualUrl = array_page.url();
	String expectedUrl = Code.get(3	).get("url");
	Assert.assertEquals(actualUrl, expectedUrl);
    
}
//----------------------------------------------------------------------------------------------------------------------------------
////Practice Question 1. Array Search successfull
//**************************************************************************
@Given("the user is in the Search the Array Question page")
public void the_user_is_in_the_search_the_array_question_page() {
	array_page.clickOnarraysInPythonLink();
	array_page.PracticeQues(); 
	array_page.SearchArray();
}

//****************************************************************************
@When("the user enters valid code in Search The Array and clickd Run Button")
public void the_user_enters_valid_code_in_search_the_array_and_clickd_run_button() throws Exception {
	
	array_page.enterCodeFromExcel( "python", 0, "pythoncode");
	 array_page.RunBtn();
  
}

@Then("The Element Found should be displayed")
public void the_element_found_should_be_displayed() throws TimeoutException, InvalidFormatException, IOException {
	String actualOutput =   array_page.OutputPracticeQues();
    String expectedOutput = array_page.getExpectedResultFromExcel("python", 0, "Run");
	 Assert.assertEquals(actualOutput,expectedOutput);
   
}

@When("user enters valid code in Search The Array and clickd Submit Button")
public void user_enters_valid_code_in_search_the_array_and_clickd_submit_button() throws Exception {
	array_page.enterCodeFromExcel( "python", 0, "pythoncode");
	  array_page.SubmitBtn();
}

@Then("the submission success should be displayed")
public void the_submission_success_should_be_displayed() throws InvalidFormatException, IOException {
	String actualOutput =   array_page.OutputPracticeQues();
	System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr"+ actualOutput);
    String expectedOutput = array_page.getExpectedResultFromExcel("python", 0, "Submit");
	 Assert.assertEquals(actualOutput,expectedOutput);
}
//-------------------------------------------------------------------------------------------------------------------------
//Practice 2.Question Max Cons Ones  successfull
@Given("the user is in the Max Cons Ones Question page")
public void the_user_is_in_the_max_cons_ones_question_page() {
	array_page.clickOnarraysInPythonLink();
	array_page.PracticeQues();
	array_page.Maxconsones();
   
}

@When("the user enters valid code in Max Cons Ones and clickd Run Button")
public void the_user_enters_valid_code_in_max_cons_ones_and_clickd_run_button() throws Exception {
	array_page.enterCodeFromExcel( "python", 1, "pythoncode");
	 array_page.RunBtn();
   
}

@Then("Number two should be displayed")
public void number_two_should_be_displayed() throws InvalidFormatException, IOException {
	String actualOutput =   array_page.OutputPracticeQues();
    String expectedOutput = array_page.getExpectedResultFromExcel("python", 1, "Run");
	 Assert.assertEquals(actualOutput,expectedOutput);
   
}

@When("user enters valid code in Max Cons Ones and clickd Submit Button")
public void user_enters_valid_code_in_max_cons_ones_and_clickd_submit_button() throws Exception {
	array_page.enterCodeFromExcel( "python", 1, "pythoncode");
	 array_page.SubmitBtn();   
}
//*******************************************************************************************************************************
//3.Find Numbers with Even numbers of Digits Successfull

@Given("the user is in the Nos with Even Nos Of Digits Question page")
public void the_user_is_in_the_nos_with_even_nos_of_digits_question_page() {
	array_page.clickOnarraysInPythonLink();
	array_page.PracticeQues();
	array_page.Findevendigits();
   
}

@When("the user enters valid code in Nos with Even Nos Of Digits and clickd Run Button")
public void the_user_enters_valid_code_in_nos_with_even_nos_of_digits_and_clickd_run_button() throws Exception {
	array_page.enterCodeFromExcel( "python", 2, "pythoncode");
	 array_page.RunBtn();
   
}

@When("user enters valid code in Nos with Even Nos Of Digits and clickd Submit Button")
public void user_enters_valid_code_in_nos_with_even_nos_of_digits_and_clickd_submit_button() throws Exception {
	array_page.enterCodeFromExcel( "python", 2, "pythoncode");
	 array_page.SubmitBtn();   
}
//******************************************************************************************************************************
//4.Squares of a Sorted Array Successfull

@Given("the user is in the Sq of Sorted Array Question page")
public void the_user_is_in_the_sq_of_sorted_array_question_page() {
	array_page.clickOnarraysInPythonLink();
	array_page.PracticeQues();
	array_page.SquaresofSortredArray();
   
}

@When("the user enters valid code in Sq of Sorted Array and clickd Run Button")
public void the_user_enters_valid_code_in_sq_of_sorted_array_and_clickd_run_button() throws Exception {
	array_page.enterCodeFromExcel( "python", 3, "pythoncode");
	 array_page.RunBtn();
   
}

@Then("Numbers should be displayed")
public void numbers_should_be_displayed() throws InvalidFormatException, IOException {
	String actualOutput =   array_page.OutputPracticeQues();
    String expectedOutput = array_page.getExpectedResultFromExcel("python", 3, "Run");
	 Assert.assertEquals(actualOutput,expectedOutput);

   
}

@When("user enters valid code in Sq of Sorted Array and clickd Submit Button")
public void user_enters_valid_code_in_sq_of_sorted_array_and_clickd_submit_button() throws Exception {
	array_page.enterCodeFromExcel( "python", 3, "pythoncode");
	 array_page.SubmitBtn();
   
}


//*****************************************************************************************************************************

}
