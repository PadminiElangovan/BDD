package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Page {
	WebDriver driver;
	WebDriverWait wait;
		 
	 @FindBy(linkText="Register") WebElement regmainButton;
	 @FindBy(id="id_username")public WebElement usernameField;  
	 @FindBy(id ="id_password1")public WebElement passwordField;
	 @FindBy(id= "id_password2")public WebElement confirmpassField;
	 @FindBy(xpath ="//input[@type='submit']") WebElement regButton;
	 @FindBy(xpath ="//div[@class='alert alert-primary']") WebElement regAlert;
	 @FindBy(xpath ="//div[contains(text(),'Account Created.')]") WebElement regsuccessAlert;
	 @FindBy(xpath="//a[@href='/login' and text()='Login ']") WebElement loginLink;
	 
	 public Register_Page(WebDriver driver) {
		 
			this.driver = driver;
		   this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		    PageFactory.initElements(driver, this);		
			}
	 public void RegMainBtn() {
	 regmainButton.click();
	 }
	 public void UsernameField(String username) {
		 usernameField.sendKeys(username);
	 }
	 public void PasswordField(String password) {
		 passwordField.sendKeys(password);
	 }
	 public void ConfPassField(String confpass) {
		 confirmpassField.sendKeys(confpass);
	 }
	 public void RegisterBtn() {
		 regButton.click();
	 }
	 public String RegAlert() {
		 return regAlert.getText();
	 }
	 public String RegSuccessAlert() {
		return regsuccessAlert.getText();
	 }
	public void LoginLinkBtn() {
		loginLink.click();
	}
	
	 
	 
	 
	 
	 
}
