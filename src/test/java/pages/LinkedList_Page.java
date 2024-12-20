package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList_Page {

	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Introduction']") public WebElement LLIntro;	
	@FindBy(xpath = "//a[text()='Creating Linked LIst']") public WebElement LLCreateLL;	
	@FindBy(xpath = "//a[text()='Types of Linked List']") public WebElement TypeOfLL;	
	@FindBy(xpath = "//a[text()='Implement Linked List in Python']") public WebElement ImpLL;	
	@FindBy(xpath = "//a[text()='Traversal']") public WebElement LLTraversal;	
	@FindBy(xpath = "//a[text()='Insertion']") public WebElement LLInsertion;	
	@FindBy(xpath = "//a[text()='Deletion']") public WebElement LLDeletion;	
	@FindBy(xpath = "//a[text()='Practice Questions']") public WebElement PracticeQues;	
	@FindBy(xpath = "//a[text()='Try here>>>']")public WebElement TryHere;
	@FindBy(xpath = "//a[text()='Sign out']")public WebElement SignOut;
	
	
	public LinkedList_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public String PageTitle() {
		return driver.getTitle();	
	}
	
	public void LLIntroLink() {
		LLIntro.click();
	}
	
	public void LLCreateLLlink() {
		LLCreateLL.click();
	}
	
	public void TypeOfLLlink() {
		TypeOfLL.click();
	}
	
	public void ImpLLlink() {
		ImpLL.click();
	}
	
	public void LLTraversallink() {
		LLTraversal.click();
	}
	public void LLInsertionlink() {
		LLInsertion.click();
	}
	
	public void LLDeletionlink() {
		LLDeletion.click();
	}
	
	public void LLPracticeQues() {
		PracticeQues.click();
	}
	
	public void TryHereButton() {
		TryHere.click();
	}
	public void SignOut() {
		SignOut.click();	
	}
}
