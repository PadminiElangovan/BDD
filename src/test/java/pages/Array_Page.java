package pages;


import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import common.Util;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import appHook.Hooks;

public class Array_Page {

		WebDriver driver;
		WebDriverWait wait;
	Util util = new Util();
		List<Map<String, String>> Login = Hooks.Login;
		String excelPath = "src/test/resources/TestData/ExcelData.xlsx";
		
		//ArrayPage
		@FindBy (linkText = "Arrays in Python")WebElement arraysInPythonLink;
		@FindBy (linkText = "Arrays Using List")WebElement arraysUsingListLink;
		@FindBy (linkText ="Basic Operations in Lists")WebElement basicOpinListsLink;
		@FindBy (linkText ="Applications of Array")WebElement appOfArrayLink;
		@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
		@FindBy (linkText = "Practice Questions")WebElement practiceLink;
		@FindBy (linkText = "Search the array")WebElement searchthearraytLink;
		@FindBy (linkText = "Max Consecutive Ones")WebElement maxconsonesLink;
		@FindBy (linkText = "Find Numbers with Even Number of Digits")WebElement findevendigitsLink;
		@FindBy (xpath = "//a[text()='Squares of  a Sorted Array']")WebElement squaresofasortedLink;
		@FindBy (xpath ="//button[text()='Run']")public WebElement runBtn;
		@FindBy (xpath ="//input[@value='Submit']")WebElement submitBtn;;
		@FindBy (xpath = "//pre[@id='output']")WebElement output;
	     @FindBy(xpath ="//div[@class='input']/div/div/textarea") WebElement inputField;
		 		
			
		public Array_Page(WebDriver driver) {
			 this.driver = driver;
			 this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
		}
		public String Output() {
			String outputText = Login.get(1).get("output");
			wait.until(ExpectedConditions.textToBePresentInElement(output,outputText));
			return output.getText();
		}
		public String OutputPracticeQues() {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//pre[@id='output']")));	
			return output.getText();
			
			}
		public void RunBtn() {
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",runBtn );
			runBtn.click();
			
		}
		public void SubmitBtn() {
			submitBtn.click();
		}

		public String PageTitle() {
			return driver.getTitle();	
		}
		public void PracticeQues() {
			practiceLink.click();
			
		}
		public void SearchArray() {
			searchthearraytLink.click();
		}
		public void Maxconsones() {
			maxconsonesLink.click();
		}
		public void Findevendigits() {
			findevendigitsLink.click();
		}
		public void SquaresofSortredArray() {
			squaresofasortedLink.click();
		}

		public void clickOnarraysInPythonLink() {
			arraysInPythonLink.click();
		}
		public void clickArraysUsingList() {
			arraysUsingListLink.click();

		}
		public void clickBasicOpInLists() {
			basicOpinListsLink.click();

		}
		public void clickAppOfArray() {
			appOfArrayLink.click();

		}

		public void OnClickTryhere() {
			TryHereLink.click();
		}
		
		public void BrowserBack() {
			driver.navigate().back();
		}
		
		public String url() {
			String currenturl = driver.getCurrentUrl();
			return currenturl;
			
		}
		
	
		 public String getAlert() {
			 return driver.switchTo().alert().getText();
		 }
		 
	
		    public void enterCodeFromExcel(String sheetName, int rowIndex, String columnName) throws Exception {
		        String code = util.getCodeFromExcel(sheetName, rowIndex, columnName);  // Get code from Excel
		        util.enterCodePractice(code, inputField); 
		    }		
		    
		    public String getExpectedResultFromExcel(String sheetName, int rowIndex, String columnName) throws InvalidFormatException, IOException {
		            return util.getResultFromExcel(sheetName, rowIndex, columnName); 
		     }
		    
public void AlertDismiss(WebDriver driver) {
    try {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert detected: " + alert.getText());
        alert.dismiss();  
    } catch (NoAlertPresentException e) {
        System.out.println("No alert detected.");
    }
}
}
		    
		    
		    
		    
		    
		    
		    
		 




























		    
		    // Method to click the "Run" button
		//    public void clickRunButton() {
		//        util.clickWhenReady(runBtn);  // Click on the Run button
		  //  }
		    
		  
		    
		    
		    
		    
		 			




		
		
		
		
	/*	public String Readandaccept() {
			String alertText = null;
			try { 
				runBtn.click();
				Alert alert = driver.switchTo().alert();
				 alertText = alert.getText();
				 driver.switchTo().alert().dismiss();
			}catch(UnhandledAlertException e) {
				try {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				}catch(NoAlertPresentException n) {
					n.printStackTrace();
				}	
}
			System.out.println("000000000000000000000000000000000000000000"  +alertText );
		//	driver.switchTo().alert().accept();
			return alertText;
			
		}
		
		public void AlertAccept() {
		
			driver.switchTo().alert().accept();
		}
		
}
		
		
	
		/*
		public void clickOnRunButton() {
			runButton.click();

		}

		public String getErrorText() {
			String errorMsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return errorMsg;

		}
		public void clickPracticeQue() {
			practiceQueLink.click();

		}

		public void SearcharrayLink() {
			searchArrayLink.click();

		}

		public void clickOnSubmitButton() {
			submitButton.click();
		}


		public void navigateTo(String pagename) {
			String urlName = ConfigReader.getProperty(pagename);
			driver.get(urlName);
		}

		public void maxConsOnes() {
			mostConOnesLink.click();

		}
		public void findNumbers() {
			findEvenNumLink.click();

		}

		public void squaresSortedArray() {
			sqOfSortedArrayLink.click();
		}
		
		*/
		
	
/*			try {
//	Alert alert = driver.switchTo().alert();
//	String Text = alert.getText();
//	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" +Text);
	//alert.accept();
}catch(NoAlertPresentException n) {
	n.printStackTrace();
}*/			 
/*	 public void Input(String code)
{String text=code;
((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','"+text+"')",inputField );
inputField.sendKeys(Keys.CONTROL+"a");
inputField.sendKeys(Keys.DELETE);
//  inputField.sendKeys(code);

	}*/


/*   try {
WebElement outputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//pre[@id='output']")));
String o= outputElement.getText();
System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
return outputElement.getText();

} catch(NoSuchElementException e) {
return null;
}*/


