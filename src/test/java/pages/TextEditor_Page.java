package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextEditor_Page {
	
	  WebDriver driver;
	   WebDriverWait wait;
	   
	   @FindBy(xpath ="//div[@class='input']/div/div/textarea") WebElement txteditorField;
	   @FindBy(id= "output")WebElement outputField;
	   @FindBy(xpath="//button[text()='Run']") WebElement runButton; 
	   
	   
	   public TextEditor_Page(WebDriver driver) {
			 
			this.driver = driver;
		    this.wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		    PageFactory.initElements(driver, this);
			
		}
	   
	   public void RunBtn() {
			 wait.until(ExpectedConditions.elementToBeClickable(runButton));
			 runButton.click();
		 
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
	    		Alert alert = driver.switchTo().alert();
	    		return alert.getText();
	    	}else {
	    		System.out.println("Alert is not present");
	    	}
			return null;
	    }
	     
	    public void AcceptAlert() {
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    }
	    
	    public void TextEditor(String code)
	    {String text=code;
	    ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','"+text+"')", txteditorField);
	    txteditorField.sendKeys(code);
	 
	    	}
	    
	    public String OutputTxtEditorField() {
	    	return outputField.getText();
	    }


}
