package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datastructure_Page {
	
		WebDriver driver;
		
		@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement dataStrucIntroLink;
		@FindBy (xpath="//a[@href='time-complexity']")WebElement timeComplexitylink;
		@FindBy(xpath = "//a[text()='Practice Questions']") public  WebElement PracticeQues;
		@FindBy(xpath = "//a[text()='Try here>>>']") public WebElement TryHere;

		public Datastructure_Page(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
		
		public String PageTitle() {
			return driver.getTitle();	
		}
		public  void TimeComplexityLink()
		{
			timeComplexitylink.click();
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