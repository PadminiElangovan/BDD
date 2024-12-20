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
import pages.Tree_Page;

public class Tree_Step {
	
	Tree_Page tree_page = new Tree_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	
    List<Map<String, String>> Login = Hooks.Login; //if you want to use login sheet
//------------------------------------------------------------------------------------------------------------------------------
//Background    
    @Given("The user is in the Home Page")
    public void the_user_is_in_the_home_page() {
    	login_page.GetstdButton();//common
       	login_page.SigninButton();//common
       	login_page.LoginwithvalidCred();//common
    }
//--------------------------------------------------------------------------------------------------------------------------------
//1. Overview of Trees    Successfull
    @Given("The user is in the TREE INTRODUCTION Page")
    public void the_user_is_in_the_tree_introduction_page() {
    	
       	tree_page.GetStdButton();

    }
    
    @When("The user clicks OVERVIEW OF TRESS tab")
    public void the_user_clicks_overview_of_tress_tab() {
  
    	tree_page.OverviewBtn();
    }

    @Then("The user should be navigated to Overview of Trees Page")
    public void the_user_should_be_navigated_to_overview_of_trees_page() {
    	String actualTitle = login_page.PageTitle();
		String expectedTitle = Login.get(1).get("title");
		Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("The user is on the OVERVIEW OF TRESS page")
    public void the_user_is_on_the_overview_of_tress_page() {
    	tree_page.GetStdButton();
    	tree_page.OverviewBtn();
        
    }

    @When("The user clicks TRY HERE button in the Overview of Trees Page")
    public void the_user_clicks_try_here_button_in_the_overview_of_trees_page() {
    	tree_page.TryhereBtn();

    }

    @Then("The user should be navigated to try Editor page with a RUN button to test")
    public void the_user_should_be_navigated_to_try_editor_page_with_a_run_button_to_test() {
    	String actualTitle = login_page.PageTitle();
		String expectedTitle = Login.get(3).get("title");
		Assert.assertEquals(actualTitle, expectedTitle);
        
    }

    @Given("The user is on the Try Editor page of Overview of Trees page")
    public void the_user_is_on_the_try_editor_page_of_overview_of_trees_page() {
    	tree_page.GetStdButton();
    	tree_page.OverviewBtn();
 	   tree_page.TryhereBtn();
        
    }

    @When("The user enters the Empty in Text Editor and clicks RUN button")
    public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
       tree_page.RunBtn();
        
    }

    @Then("The Error message in alert window should be displayed")
    public void the_error_message_in_alert_window_should_be_displayed() {
    	Assert.assertTrue(tree_page.IsAlertPresent());

    }

    @When("The user enters the valid code in Text Editor and clicks RUN button")
    public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() {
    	String CodeText = Login.get(0).get("code");
    	tree_page.TextEditor(CodeText);
   	    tree_page.RunBtn();
        
    }

    @Then("The displayed in the console should be displayed")
    public void the_displayed_in_the_console_should_be_displayed() {
    	String actualcode= tree_page.OutputTxtEditorField();
		String expectedcode = Login.get(0).get("output");
		Assert.assertEquals(actualcode,expectedcode );

        
    }

    @When("The user enters the Invalid code1 in Text Editor and clicks RUN button")
    public void the_user_enters_the_invalid_code1_in_text_editor_and_clicks_run_button() {
    	String CodeText = Login.get(1).get("invalidcode");
       	tree_page.TextEditor(CodeText);
       	tree_page.RunBtn();       

        
    }

    @Then("The nameerror pop up alert message should be displayed")
    public void the_nameerror_pop_up_alert_message_should_be_displayed() {
       
    	String actualalert = tree_page.AlertText();
    	String expectedalert = Login.get(6).get("alert");
    	Assert.assertTrue(actualalert.contains(expectedalert));
    	tree_page.AcceptAlert();

    }

    @When("The user enters the Invalid code2 in Text Editor and clicks RUN button")
    public void the_user_enters_the_invalid_code2_in_text_editor_and_clicks_run_button() {
       
    	String CodeText = Login.get(0).get("invalidcode");
       	tree_page.TextEditor(CodeText);
       	tree_page.RunBtn();       

    }

    @Then("The syntaxerror pop up alert message should be displayed")
    public void the_syntaxerror_pop_up_alert_message_should_be_displayed() {
    	String actualalert = tree_page.AlertText();
       	String expectedalert = Login.get(5).get("alert");
      // 	Assert.assertEquals(actualalert,expectedalert);   
       	Assert.assertTrue(actualalert.contains(expectedalert));
       	tree_page.AcceptAlert();

        
    }

    @When("The user clicks The left arrow in The browser")
    public void the_user_clicks_the_left_arrow_in_the_browser() {
    	tree_page.DriverNavigation();
        
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
//2.Terminologies Successfull
    @When("The user clicks TERMINOLOGIES tab")
    public void the_user_clicks_terminologies_tab() {
    	tree_page.TerminologiesBtn();
     }

    @Then("The user should be navigated to Terminologies page")
    public void the_user_should_be_navigated_to_terminologies_page() {
    	String actualTitle = login_page.PageTitle();
    	   String expectedTitle = Login.get(29).get("title");
        Assert.assertEquals(actualTitle,expectedTitle);

        
    }

    @Given("The user is in The TERMINOLOGIES  page")
    public void the_user_is_in_the_terminologies_page() {
    	tree_page.GetStdButton();
    	tree_page.TerminologiesBtn();
        
    }

    @When("The user clicks TRY HERE button in The Terminologies page")
    public void the_user_clicks_try_here_button_in_the_terminologies_page() {
    	tree_page.TryhereBtn();  
    }

    @Given("The user is on the Try Editor in Terminologies page")
    public void the_user_is_on_the_try_editor_in_terminologies_page() {
    	tree_page.GetStdButton();
    	tree_page.TerminologiesBtn();
 	   tree_page.TryhereBtn();
       
    }//Successfull
//------------------------------------------------------------------------------------------------------------------------------------------------------
//3.Types of Trees Successfull
    
    @When("The user clicks TYPES OF TREES tab")
    public void the_user_clicks_types_of_trees_tab() {
    	
    	tree_page.TypesOfTreesBtn();
    	
    }

    @Then("The user should be navigated to Types of Trees page")
    public void the_user_should_be_navigated_to_types_of_trees_page() {
    	String actualTitle = login_page.PageTitle();
 	   String expectedTitle = Login.get(30).get("title");
     Assert.assertEquals(actualTitle,expectedTitle);
  
    }

    @Given("The user is in The TYPES OF TREES  page")
    public void the_user_is_in_the_types_of_trees_page() {
    	tree_page.GetStdButton();
    	tree_page.TypesOfTreesBtn();
        
    }

    @When("The user clicks TRY HERE button in The Types of Trees page")
    public void the_user_clicks_try_here_button_in_the_types_of_trees_page() {
    	tree_page.TryhereBtn();
        
    }

    @Given("The user is on the Try Editor in Types of Trees page")
    public void the_user_is_on_the_try_editor_in_types_of_trees_page() {
    	tree_page.GetStdButton();
    	tree_page.TypesOfTreesBtn();
    	tree_page.TryhereBtn();
    } //Successfull
//----------------------------------------------------------------------------------------------------------------------------------------------------------
//4.Tree Traversals Successfull
    
    @When("The user clicks TREE TRAVERSALS tab")
    public void the_user_clicks_tree_traversals_tab() {
        tree_page.TreeTraversalsBtn();
    }

    @Then("The user should be navigated to Trees Traversals page")
    public void the_user_should_be_navigated_to_trees_traversals_page() {
    	
    	String actualTitle = login_page.PageTitle();
 	   String expectedTitle = Login.get(31).get("title");
     Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Given("The user is in The TREE TRAVERSALS  page")
    public void the_user_is_in_the_tree_traversals_page() {
    	tree_page.GetStdButton();
    	tree_page.TreeTraversalsBtn();
    }

    @When("The user clicks TRY HERE button in The Tree Traversals page")
    public void the_user_clicks_try_here_button_in_the_tree_traversals_page() {
    	tree_page.TryhereBtn();
        
    }

    @Given("The user is on the Try Editor in Tree Traversals Page")
    public void the_user_is_on_the_try_editor_in_tree_traversals_page() {
    	tree_page.GetStdButton();
    	tree_page.TreeTraversalsBtn();
    	tree_page.TryhereBtn();
        
    }//Sucessfull
 //----------------------------------------------------------------------------------------------------------------------------------------------------------
 //5.Traversals Illustration Sucessfull
    
@When("The user clicks TRAVERSALS-ILLUSTRATION tab")
public void the_user_clicks_traversals_illustration_tab() {
 
    tree_page.TraversalsIllusBtn();
}

@Then("The user should be navigated to Traversals Illustration page")
public void the_user_should_be_navigated_to_traversals_illustration_page() {
	String actualTitle = login_page.PageTitle();
	   String expectedTitle = Login.get(32).get("title");
  Assert.assertEquals(actualTitle,expectedTitle);
    
}

@Given("The user is in The TRAVERSALS-ILLUSTRATION page")
public void the_user_is_in_the_traversals_illustration_page() {
	tree_page.GetStdButton();
	tree_page.TraversalsIllusBtn();
}

@When("The user clicks TRY HERE button in The Traversals-Illustration page")
public void the_user_clicks_try_here_button_in_the_traversals_illustration_page() {
	tree_page.TryhereBtn();
    
}

@Given("The user is on the Try Editor in Traversals-Illustration Page")
public void the_user_is_on_the_try_editor_in_traversals_illustration_page() {
	tree_page.GetStdButton();
	tree_page.TraversalsIllusBtn();
	tree_page.TryhereBtn();
} //Sucessfull
//---------------------------------------------------------------------------------------------------------------------	`
//6.Binary Trees Sucessfull
@When("The user clicks BINARY TREES tab")
public void the_user_clicks_binary_trees_tab() {
 tree_page.BinaryTreeBtn();
    
}

@Then("The user should be navigated to Binary Trees page")
public void the_user_should_be_navigated_to_binary_trees_page() {
	
	String actualTitle = login_page.PageTitle();
	   String expectedTitle = Login.get(33).get("title");
Assert.assertEquals(actualTitle,expectedTitle);
}

@Given("The user is in The BINARY TREES page")
public void the_user_is_in_the_binary_trees_page() {
	
	tree_page.GetStdButton();
	tree_page.BinaryTreeBtn();
    
}

@When("The user clicks TRY HERE button in The Binary Trees page")
public void the_user_clicks_try_here_button_in_the_binary_trees_page() {
	tree_page.TryhereBtn();
    
}

@Given("The user is on the Try Editor in Binary Trees Page")
public void the_user_is_on_the_try_editor_in_binary_trees_page() {
	tree_page.GetStdButton();
	tree_page.BinaryTreeBtn();
	tree_page.TryhereBtn();
}// Sucessfull
//--------------------------------------------------------------------------------------------------------------------------------
//7. Types of Binary Trees  Sucessfull

@When("The user clicks TYPES OF BINARY TREES tab")
public void the_user_clicks_types_of_binary_trees_tab() {
 tree_page.TypesBTBtn();
    
}

@Then("The user should be navigated to The Types of Binary Trees page")
public void the_user_should_be_navigated_to_the_types_of_binary_trees_page() {
	String actualTitle = login_page.PageTitle();
	   String expectedTitle = Login.get(34).get("title");
Assert.assertEquals(actualTitle,expectedTitle);
    
}

@Given("The user is in The TYPES OF BINARY TREES page")
public void the_user_is_in_the_types_of_binary_trees_page() {
	tree_page.GetStdButton();
	tree_page.TypesBTBtn();
    
}

@When("The user clicks TRY HERE button in The Types of Binary Trees page")
public void the_user_clicks_try_here_button_in_the_types_of_binary_trees_page() {
 
	tree_page.TryhereBtn();
}

@Given("The user is on the Try Editor page in Types of Binary Trees Page")
public void the_user_is_on_the_try_editor_page_in_types_of_binary_trees_page() {
	tree_page.GetStdButton();
	tree_page.TypesBTBtn();
	tree_page.TryhereBtn();
} // Sucessfull
//------------------------------------------------------------------------------------------------
//8.Implementation in Python  Sucessfull
@When("The user clicks IMPLEMENTATION IN PYTHON tab")
public void the_user_clicks_implementation_in_python_tab() {
 tree_page.ImpPythonBtn();
    
}

@Then("The user should be navigated to implementation in python page")
public void the_user_should_be_navigated_to_implementation_in_python_page() {
	String actualTitle = login_page.PageTitle();
	   String expectedTitle = Login.get(35).get("title");
Assert.assertEquals(actualTitle,expectedTitle);
    
}

@Given("The user is in IMPLEMENTATION IN PYTHON page")
public void the_user_is_in_implementation_in_python_page() {
	tree_page.GetStdButton();
	tree_page.ImpPythonBtn();
    
}

@When("The user clicks TRY HERE button in Implementation in Pytton page")
public void the_user_clicks_try_here_button_in_implementation_in_pytton_page() {
	tree_page.TryhereBtn();
    
}

@Given("The user is on the Try Editor in IMPLEMENTATION IN PYTHON Page")
public void the_user_is_on_the_try_editor_in_implementation_in_python_page() {
	tree_page.GetStdButton();
	tree_page.ImpPythonBtn();
	tree_page.TryhereBtn();
} //Sucessfull
//-----------------------------------------------------------------------------------------------------------------------------
//9. Binary Tree Traversals Sucessfull

@When("The user clicks BINARY TREE TRAVERSALS tab")
public void the_user_clicks_binary_tree_traversals_tab() {
 tree_page.BinTreeTravBtn();
    
}

@Then("The user should be navigated to Binary Tree Traversals page")
public void the_user_should_be_navigated_to_binary_tree_traversals_page() {
	String actualTitle = login_page.PageTitle();
	   String expectedTitle = Login.get(36).get("title");
Assert.assertEquals(actualTitle,expectedTitle);
    
}

@Given("The user is in BINARY TREE TRAVERSALS page")
public void the_user_is_in_binary_tree_traversals_page() {
	tree_page.GetStdButton();
	tree_page.BinTreeTravBtn();
    
}

@When("The user clicks TRY HERE button in Binary Tree Traversals page")
public void the_user_clicks_try_here_button_in_binary_tree_traversals_page() {
	tree_page.TryhereBtn();
    
}

@Given("The user is on the Try Editor in BINARY TREE TRAVERSALS Page")
public void the_user_is_on_the_try_editor_in_binary_tree_traversals_page() {
	tree_page.GetStdButton();
	tree_page.BinTreeTravBtn();
	tree_page.TryhereBtn();
}// Sucessfull
//-------------------------------------------------------------------------------------------------------------------------------
//10.Implementation of Binary Tree   Sucessfull
@When("The user clicks IMPLEMENTATION OF BINARY tab")
public void the_user_clicks_implementation_of_binary_tab() {
 tree_page.IBTBtn();
    
}

@Then("The user should be navigated to Implementation of Binary page")
public void the_user_should_be_navigated_to_implementation_of_binary_page() {
	String actualTitle = login_page.PageTitle();
	 String expectedTitle = Login.get(37).get("title");
	Assert.assertEquals(actualTitle,expectedTitle);
    
}

@Given("The user is in IMPLEMENTATION OF BINARY TREE page")
public void the_user_is_in_implementation_of_binary_tree_page() {
	tree_page.GetStdButton();
	tree_page.IBTBtn();
    
}

@When("The user clicks TRY HERE button in IMPLEMENTATION OF BINARY TREE page")
public void the_user_clicks_try_here_button_in_implementation_of_binary_tree_page() {
	tree_page.TryhereBtn();
 
}

@Given("The user is on the Try Editor in IMPLEMENATATION OF BINARY TREE Page")
public void the_user_is_on_the_try_editor_in_implemenatation_of_binary_tree_page() {
	tree_page.GetStdButton();
	tree_page.IBTBtn();
	tree_page.TryhereBtn();
}// Sucessfull

//-------------------------------------------------------------------------------------------------------------------------------
// 11.Application Of Binary Tree   Sucessfull
@When("The user clicks APPLICATION OF BINARY TREES tab")
public void the_user_clicks_application_of_binary_trees_tab() {
 tree_page.ABTBtn();
    
}

@Then("The user should be navigated to Application of Binary Trees page")
public void the_user_should_be_navigated_to_application_of_binary_trees_page() {
 
	String actualTitle = login_page.PageTitle();
	 String expectedTitle = Login.get(38).get("title");
	Assert.assertEquals(actualTitle,expectedTitle);
}

@Given("The user is in APPLICATION OF BINARY TREES page")
public void the_user_is_in_application_of_binary_trees_page() {
	tree_page.GetStdButton();
	tree_page.ABTBtn();
    
}

@When("The user clicks TRY HERE button in APPLICATION OF BINARY TREES page")
public void the_user_clicks_try_here_button_in_application_of_binary_trees_page() {
	tree_page.TryhereBtn();
   
}

@Given("The user is on the Try Editor in APPLICATION OF BINARY TREES Page")
public void the_user_is_on_the_try_editor_in_application_of_binary_trees_page() {
	tree_page.GetStdButton();
	tree_page.ABTBtn();
	tree_page.TryhereBtn();
}   //Sucessfull
//------------------------------------------------------------------------------------------------------------------------------
//12. Binary Search Tree Successfull
@When("The user clicks BINARY SEARCH TREE tab")
public void the_user_clicks_binary_search_tree_tab() {
  tree_page.BSTbtn();
}

@Then("The user should be navigated to Binary Search Tree page")
public void the_user_should_be_navigated_to_binary_search_tree_page() {
	String actualTitle = login_page.PageTitle();
	 String expectedTitle = Login.get(39).get("title");
	Assert.assertEquals(actualTitle,expectedTitle);
   
}

@Given("The user is in BINARY SEARCH TREE page")
public void the_user_is_in_binary_search_tree_page() {
	tree_page.GetStdButton();
	tree_page.BSTbtn();
   
}

@When("The user clicks TRY HERE button in BINARY SEARCH TREE page")
public void the_user_clicks_try_here_button_in_binary_search_tree_page() {
	tree_page.TryhereBtn();
}

@Given("The user is on the Try Editor in BINARY SEARCH TREE Page")
public void the_user_is_on_the_try_editor_in_binary_search_tree_page() {
	tree_page.GetStdButton();
	tree_page.BSTbtn();
	tree_page.TryhereBtn();
}// Successfull
    
//-------------------------------------------------------------------------------------------------------------------------------
//13.Implementation of Binary Search Tree   Successfull
@When("The user clicks IMPLEMENTATION OF BINARY SEARCH TREE tab")
public void the_user_clicks_implementation_of_binary_search_tree_tab() {
	tree_page.IBSTBtn();
    
}

@Then("The user should be navigated to Implementation of Binary Search Tree page")
public void the_user_should_be_navigated_to_implementation_of_binary_search_tree_page() {
	String actualTitle = login_page.PageTitle();
	 String expectedTitle = Login.get(40).get("title");
	Assert.assertEquals(actualTitle,expectedTitle);
   
}

@Given("The user is in IMPLEMENTATION OF BINARY SEARCH TREE page")
public void the_user_is_in_implementation_of_binary_search_tree_page() {
	tree_page.GetStdButton();
	tree_page.IBSTBtn();
    
}

@When("The user clicks TRY HERE button in IMPLEMENTATION OF BINARY SEARCH TREE page")
public void the_user_clicks_try_here_button_in_implementation_of_binary_search_tree_page() {
 
	tree_page.TryhereBtn();

}

@Given("The user is on the Try Editor in IMPLEMENTATION OF BINARY SEARCH TREE Page")
public void the_user_is_on_the_try_editor_in_implementation_of_binary_search_tree_page() {
	tree_page.GetStdButton();
	tree_page.IBSTBtn();
	tree_page.TryhereBtn();
    
} //Successfull
//-------------------------------------------------------------------------------------------------------------------------------
//Practice Question  Successfull

@When("The user clicks PRACTICE QUESTIONS tab")
public void the_user_clicks_practice_questions_tab() {
 tree_page.PractQuesBtn();
    
}

@Then("The user should be navigated to The Practice Question page")
public void the_user_should_be_navigated_to_the_practice_question_page() {
 
	String actualTitle = login_page.PageTitle();
	 String expectedTitle = Login.get(43).get("title");
	Assert.assertEquals(actualTitle,expectedTitle);
}
//--------------------------------------------------------------------------------------------------------------------------------
//Logout Successfull
@When("The user clicks The SIGN OUT button")
public void the_user_clicks_the_sign_out_button() {
 
    tree_page.SignOut();
}

@Then("The user should see logged out Successfully message")
public void the_user_should_see_logged_out_successfully_message() {
	String actualTitle = tree_page.LoggedOutAlert();
	 String expectedTitle = Login.get(4).get("alert");
	Assert.assertEquals(actualTitle,expectedTitle);
    
}



    
    

}