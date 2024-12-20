package pages;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Graph_Page {

		WebDriver driver;

		@FindBy(xpath = "//a[@href='graph']") public WebElement GraphStrtBtn;
		@FindBy(xpath = "//a[@href='graph' and text()='Graph']") public WebElement GraphMainPgLink;
		@FindBy(xpath = "//a[@href='graph-representations']") public WebElement GraphRepMainPgLink;
		
		@FindBy(xpath = "//a[@href='/graph/graph/']") public WebElement GraphGraphLink;
		@FindBy(xpath = "//a[@href='/graph/graph-representations/']") public WebElement GraphGraphRepLink;
		
		@FindBy(xpath = "//a[text() ='Try here>>>']") public WebElement tryherebtn;
		@FindBy(xpath = "//a[@href='/graph/practice']") public WebElement practiceQuestions;
	
		
		public Graph_Page(WebDriver driver)
		{
			this.driver = driver;
	        PageFactory.initElements(driver, this);

		}
		
		public void StrtBtn() {
			GraphStrtBtn.click();
		}
		public String PageTitle()
		{
			return driver.getTitle();
		}
		
		public void graphMain() {
			GraphMainPgLink.click();
		}
		/*public void graphMain() {
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",GraphMainPgLink);
		}*/
		
		public void graphRepMain()
		{
			GraphRepMainPgLink.click();
		}
		public void Graphgraph()
		{
			GraphGraphLink.click();
		}
		public void GraphgraphRep()
		{
			GraphGraphRepLink.click();
		}
		
		public void tryherebtn()
		{
			tryherebtn.click();
		}
		
		public void navigate_back_btn()
		{
			driver.navigate().back();
		}
		public void practice_Questions()
		{
			practiceQuestions.click();
		}
		
		
	}
	
	
