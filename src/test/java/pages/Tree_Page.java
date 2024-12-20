package pages;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appHook.Hooks;

public class Tree_Page {
	
   WebDriver driver;
   WebDriverWait wait;
   List<Map<String, String>> Login = Hooks.Login; //if you want to use login sheet
   
	 @FindBy(xpath = "//a[@href='tree']") WebElement getstdButton;	
	 @FindBy(linkText="Try here>>>") WebElement tryhereButton;
	 @FindBy(xpath="//button[text()='Run']") WebElement runButton;  
	 @FindBy(xpath ="//div[@class='input']/div/div/textarea") WebElement txteditorField;
	 @FindBy(id= "output")WebElement outputField;
	 @FindBy(xpath ="//a[@href='overview-of-trees']") WebElement overviewButton;
	 @FindBy(linkText ="Terminologies")WebElement terminologiesButton;
	 @FindBy(linkText ="Types of Trees")WebElement typesoftreesButton;
	 @FindBy(linkText ="Tree Traversals")WebElement treetraversalsButton;
	 @FindBy(linkText ="Traversals-Illustration")WebElement traverillusButton;
	 @FindBy(linkText ="Binary Trees")WebElement binarytreeButton;
	 @FindBy(linkText ="Binary Search Trees")WebElement binarysearchtreeButton;
	 @FindBy(linkText ="Types of Binary Trees")WebElement typesofbtButton;
	 @FindBy(linkText ="Implementation in Python")WebElement impofpythonButton;
	 @FindBy(linkText ="Binary Tree Traversals")WebElement bintreetravButton;
	 @FindBy(linkText ="Implementation of Binary Trees")WebElement impofbtButton;
	 @FindBy(linkText ="Applications of Binary trees")WebElement abtButton;
	 @FindBy(linkText ="Implementation Of BST")WebElement impbstButton;
	 @FindBy(linkText ="Practice Questions")WebElement pracquesButton;
	 @FindBy(linkText ="Sign out")WebElement signoutButton;

	 @FindBy(xpath = "//div[@class ='alert alert-primary']") public WebElement LoggedOutAlert;
	 
	 public Tree_Page(WebDriver driver) {
		 
		this.driver = driver;
	    this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    PageFactory.initElements(driver, this);
			
		}
	 
	 public void OverviewBtn() {
	
	 overviewButton.click();
	 }
	 public void TryhereBtn() {
		 tryhereButton.click();
		
	 }
		 
	 public void RunBtn() {
		 wait.until(ExpectedConditions.elementToBeClickable(runButton));
		 runButton.click();
	 }
//**************************************************************************************************************************
	/* public void RunBtn() {
	 try {
		    // Code that might trigger the alert
		    runButton.click();
		} catch (UnhandledAlertException e) {
		    // Handle the alert
		    Alert alert = driver.switchTo().alert();
		    System.out.println("Unexpected alert detected: " + alert.getText());
		    alert.dismiss(); // or alert.accept();
		} catch (Exception e) {
		    // Handle other exceptions
		    e.printStackTrace();
		}

	 }*/

	 
	 
//****************************************************************************************************************************	 
	 
	 
    public void GetStdButton() {
    	getstdButton.click();
    }
    
    public  boolean IsAlertPresent() {
    	try {
    	wait.until(ExpectedConditions.alertIsPresent());
    	return true;
    }catch (NoAlertPresentException e) {
    	return false;
    }
    }
    public String AlertText() {
    	if(IsAlertPresent()) {
    		wait.until(ExpectedConditions.alertIsPresent());
    		Alert alert = driver.switchTo().alert();
    		return alert.getText();
    	}else {
    		System.out.println("Alert is not present");
    	}
		return null;
    }
//---------------------------------------------------------------------------------------------------------------------------------     
 /*   public void AcceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }*/
//----------------------------------------------------------------------------------------------------------------------------------
   public void AcceptAlert() {
	   Alert alert = driver.switchTo().alert();
    try {
    	wait.until(ExpectedConditions.alertIsPresent());
      //  Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Alert accepted successfully.");
    } catch (NoAlertPresentException e) {
    	alert.accept();
        System.out.println("No alert present. Exception: " + e.getMessage());
    } catch (UnhandledAlertException  e) {
    	alert.accept();
        System.out.println("An unexpected exception occurred: " + e.getMessage());
    }
}
    
    
//---------------------------------------------------------------------------------------------------------------------------------    
    public void TextEditor(String code)
    {String text=code;
    ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','"+text+"')", txteditorField);
    txteditorField.sendKeys(code);
 
    	}
    
    public String OutputTxtEditorField() {
    	String output = Login.get(0).get("output");
        wait.until(ExpectedConditions.textToBePresentInElement(outputField,output));
    	return outputField.getText();
    	
    }
    public void TerminologiesBtn() {
    	terminologiesButton.click();
    }
    public void TypesOfTreesBtn() {
    	typesoftreesButton.click();
    }
    public void TreeTraversalsBtn() {
    	treetraversalsButton.click();
    }
    public void TraversalsIllusBtn() {
    	traverillusButton.click();
    }
    public void BinaryTreeBtn() {
    	binarytreeButton.click();
    }
    public void TypesBTBtn() {
    	typesofbtButton.click();
    }
    public void ImpPythonBtn() {
    	impofpythonButton.click();
    }
    public void BinTreeTravBtn() {
    	bintreetravButton.click();
    	
    }
    public void IBTBtn() {
    	impofbtButton.click();
    }
    public void ABTBtn() {
    	abtButton.click();
    }
    public void IBSTBtn() {
    	impbstButton.click();
    }
    public void PractQuesBtn() {
    	pracquesButton.click();
    }
    public void BSTbtn() {
    	binarysearchtreeButton.click();
    }
    
    public void SignOut() {
    	signoutButton.click();
    }
    
    public String LoggedOutAlert() {
		return LoggedOutAlert.getText();
	}
    public void DriverNavigation() {
    	driver.navigate().back();  	
    }

}















//((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute()", overviewButton);
//	 overviewButton.click();
//	Actions actions = new Actions(driver); 
//	actions.scrollToElement(overviewButton);



//public static boolean isrunButtonEnabled() {
//	return runButton.isEnabled();

