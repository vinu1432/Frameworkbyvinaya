package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoLogin 
{
  @FindBy (id="course")
  
  private WebElement coursetab;
  
  
  @FindBy (xpath= "//a[text()=\"Selenium Training\"]")
  
  private WebElement seleniumtraining;
  
  
  @FindBy (name = "addresstype")
  private WebElement coursedd;
  
  
  
  public WebElement getCoursedd() {
	return coursedd;
}


public SkillaryDemoLogin (WebDriver driver)
  
  {
	  PageFactory.initElements(driver,this);
	  
  }


    public WebElement getCoursetab() 
    
    {
	
    	return coursetab;
    	
    }
  
  public void seleniumtraining()
  
  {
	  seleniumtraining.click();
  }
  
	
}
