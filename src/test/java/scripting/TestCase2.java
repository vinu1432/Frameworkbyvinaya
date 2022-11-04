package scripting;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillaryDemoLogin;
import pomPages.SkillaryLoginPage;
import pomPages.TestingPage;


public class TestCase2 extends BaseClass

{
  @Test
  
  public void tc2 () throws IOException
  {
	  SkillaryLoginPage s = new SkillaryLoginPage (driver);
 
       s.gearsbutton();
       s.skillrarydemoapp();
       
       driverutilities.switchtabs(driver);
       
       SkillaryDemoLogin sd = new SkillaryDemoLogin (driver);
       
      driverutilities.dropdown(sd.getCoursedd() ,pdata.getData("dropdown"));
       
       TestingPage tp = new TestingPage ();
       driverutilities.dragnddrop(driver, tp.getSeleniumtraning(), tp.getCart());
       
       
     Point loc = tp.getTwitter().getLocation();
     
     int x= loc.getX();
     
     int y= loc.getY();
       
     driverutilities.scrollbar(driver, x, y);
  
    tp.twitterlogo();
  
 
  
  }
  
  
	
}
