package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queue_Page {
WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']") public WebElement ImpQue;	
	@FindBy(xpath = "//a[text()='Implementation using collections.deque']") public WebElement ImpColl;	
	@FindBy(xpath = "//a[text()='Implementation using array']") public WebElement ImpArry;	
	@FindBy(xpath = "//a[text()='Queue Operations']") public WebElement QueOpr;	
	@FindBy(xpath = "//a[text()='Practice Questions']") public  WebElement PracticeQues;
	@FindBy(xpath = "//a[text()='Try here>>>']") public WebElement TryHere;
	
	public Queue_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public String PageTitle() {
		return driver.getTitle();	
	}
	
	public void ImpQueueLink() {
		ImpQue.click();
	}
	
	public void ImpCollLink() {
		ImpColl.click();
	}
	
	public void ImpArryLink() {
		ImpArry.click();
	}
	
	public void QueueOprLink() {
		QueOpr.click();
	}
	
	public void PracticeQuestion() {
		PracticeQues.click();
	}
	
	public void Tryhere() {
		TryHere.click();
	}
	
	public void BrowserBack() {
		driver.navigate().back();
	}
	

}
