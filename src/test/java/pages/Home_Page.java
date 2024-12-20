package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
WebDriver driver;
	
	@FindBy(xpath = "//a[@href='data-structures-introduction']") public WebElement DSIntroGetStartedButton;	
	@FindBy(xpath = "//a[@href='array']") public WebElement ArrayGetStartedButton;	
	@FindBy(xpath = "//a[@href='linked-list']") public WebElement LinkLstGetStartedButton;	
	@FindBy(xpath = "//a[@href='stack']") public WebElement StackGetStartedButton;	
	@FindBy(xpath = "//a[@href='queue']") public WebElement QueueGetStartedButton;	
	@FindBy(xpath = "//a[@href='tree']") public WebElement TreeGetStartedButton;	
	@FindBy(xpath = "//a[@href='graph']") public WebElement GraphGetStartedButton;	
	
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']") public WebElement dropdownmenu;
	@FindBy(xpath = "//a[text()='Arrays']") public WebElement Arraydrpdwn;
	@FindBy(xpath = "//a[text()='Linked List']") public WebElement LinkListdrpdwn;
	@FindBy(xpath = "//a[text()='Stack']") public WebElement Stackdrpdwn;
	@FindBy(xpath = "//a[text()='Queue']") public WebElement Queuedrpdwn;
	@FindBy(xpath = "//a[text()='Tree']") public WebElement Treedrpdwn;
	@FindBy(xpath = "//a[text()='Graph']") public WebElement Graphdrpdwn;
	
	@FindBy(xpath = "//div[@class ='alert alert-primary']") public WebElement LoggedOutAlert;
	
	
	public Home_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void HomePgTitle()
	{
		driver.getTitle();
	}
	public void DataStructureStrtBtn() {
		DSIntroGetStartedButton.click();
	}
	public void ArrayStrtBtn() {
		ArrayGetStartedButton.click();
	}
	public void LinkListStrtBtn() {
		LinkLstGetStartedButton.click();
	}
	public void StackStrtBtn() {
		StackGetStartedButton.click();
	}
	public void QueueStrtBtn() {
		QueueGetStartedButton.click();
	}
	public void TreeStrtBtn() {
		TreeGetStartedButton.click();
	}
	public void GraphStrtBtn() {
		GraphGetStartedButton.click();
	}
	
	public void OpenDropDown() {
		dropdownmenu.click();
	}
	public void Arraydrpdwn() {
		Arraydrpdwn.click();
	}
	public void LinkListdrpdwn() {
		LinkListdrpdwn.click();
	}
	public void Stackdrpdwn() {
		Stackdrpdwn.click();
	}
	public void Queuedrpdwn() {
		Queuedrpdwn.click();
	}
	public void Treedrpdwn() {
		Treedrpdwn.click();
	}
	public void Graphdrpdwn() {
		Graphdrpdwn.click();
	}
	public String LoggedOutAlert() {
		return LoggedOutAlert.getText();
	}
	
}
