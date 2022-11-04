package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage 
{

	@FindBy (xpath = "//a[text()='core java For Selenium Trainin']")
	private WebElement corejava;
	
	public CoreJavaPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void java()
	
	{
		corejava.click();
	}
	
}




