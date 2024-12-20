package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Stack_Page {

	WebDriver driver;
	
	//@FindBy(xpath = "//a[@href ='stack']") public WebElement stackgetStartedBtn;
	
	@FindBy(linkText ="Operations in Stack") public WebElement operationsinStack;
	//@FindBy(xpath = "//a[@href='/stack/operations-in-stack/']") public WebElement stackOperationsinStack;
	
	@FindBy(xpath ="//a[text()='Implementation']") public  WebElement implementation;
	//@FindBy(xpath = " //a[ @href= '/stack/implementation/']") public WebElement stackImplementation;
	
	@FindBy(xpath = "//a[text()='Applications']") public  WebElement applications;
	//@FindBy(xpath = "//a[@href = '/stack/stack-applications/']") public WebElement stackStackApplications;
	@FindBy(xpath = "//a[ @href='/tryEditor']") public  WebElement tryhere;
	
	@FindBy(xpath ="//a[@href='/stack/practice']" ) public WebElement practiceQuestions;
	

public Stack_Page(WebDriver driver)
{
	this.driver = driver;
    PageFactory.initElements(driver, this);
}

public String PageTitle()
{
	return driver.getTitle();
}

public void operationsinStack()
{
	operationsinStack.click();
}

public void implementation()
{
	implementation.click();
}

public void applications()
{
	applications.click();
}

public void practiceQuestions()
{
	practiceQuestions.click();
}
public void TryHere() {
	
	tryhere.click();
}

}

	
	
