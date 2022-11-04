package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage
{
	@FindBy (xpath="(//a[text()=\"Selenium Training\"])[2]")
	private WebElement seleniumtraning;
	
	public WebElement getSeleniumtraning() {
		return seleniumtraning;
	}

	public void setSeleniumtraning(WebElement seleniumtraning) {
		this.seleniumtraning = seleniumtraning;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	public WebElement getTwitter() {
		return twitter;
	}

	public void setTwitter(WebElement twitter) {
		this.twitter = twitter;
	}

	@FindBy (id="cartArea")
	private WebElement cart;
	
	@FindBy (xpath = "(//i[@class=\"fa fa-twitter\"])[2]")
	private WebElement twitter;
	
	public void TestingPage (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
   public void twitterlogo()
   
   {
	   twitter.click();
   }
   
   
	
}
