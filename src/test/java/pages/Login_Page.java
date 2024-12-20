package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import appHook.Hooks;

public class Login_Page {
	
	WebDriver driver;
	
	List<Map<String, String>> Login = Hooks.Login; 
   
	
	@FindBy(className ="btn") WebElement getStdButton;
	@FindBy(linkText="Sign in") WebElement signInButton;
	@FindBy(id="id_username")public WebElement usernameField;
	@FindBy(id="id_password")public WebElement passwordField;
	@FindBy(xpath="//input[@type='submit']") WebElement loginButton;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement invalidcredAlert;
	@FindBy(xpath="//div[contains(text(),'You are logged in')]") WebElement loginalert;
	@FindBy(linkText ="Sign out") WebElement logoutButton;
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginButton() {
		
		loginButton.click();
	}
	
	public void getstdButton() {
		getStdButton.click();	
	}
	
	public String PageTitle() {
		return driver.getTitle();	
	}
	
	public String errmsg(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
    return (String)js.executeScript("return arguments[0].validationMessage;",element);
    }
	
   public void emptyPassword(String username) {
	usernameField.sendKeys(username);
   }
   
   public void emptyUsername(String username ,String password) {
	  usernameField.sendKeys(username);
	passwordField.sendKeys(password);
   }	
   
   public void Credentials(String username, String password) {
	usernameField.sendKeys(username);
	passwordField.sendKeys(password);


   }
    public void CurrentUrl() {
    	String url = common.ConfigReader.getProperty("URL");
    	String curUrl =driver.getCurrentUrl();
    	System.out.println("Current URL :" +curUrl);
    	Assert.assertEquals(url, curUrl);
    }
   public void GetstdButton() {
	   getStdButton.click();
   }
   public void SigninButton() {
	   signInButton.click();
   }
   
   
   public String InvalidcredAlert() {
	   return invalidcredAlert.getText();
	   
   }
   public String LoginAlert()
   {
	   return loginalert.getText();
   }
   
   public void LoginwithvalidCred() {
	   String username = Login.get(0).get("username");  
		String password = Login.get(0).get("password");
		usernameField.sendKeys(username);
    	passwordField.sendKeys(password);
    	loginButton.click();
	 
   }
}




















/* public  String url() {
String url = PropertyFileReader.getProperty("dsAlgoSign.URL");
String currenturl = driver.getCurrentUrl();
if(!currenturl.equals(url))
{
throw new AssertionError("User is not in sign in page");						
}
return currenturl;		
} 

public String gturrentUrl() {
return driver.getCurrentUrl();
}
public String alert() {
Alert alert =driver.switchTo().alert();
String alertmsg =alert.getText();

return alertmsg;
}*/


//String username = ConfigReader.getProperty("Username");  
	 //String password = ConfigReader.getProperty("Password");



