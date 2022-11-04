package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillaryDemoLogin;
import pomPages.SkillaryLoginPage;

public class TestCase1 extends BaseClass

{
    @Test
    
    public void tc1()
    
    {
    	SkillaryLoginPage s1 = new SkillaryLoginPage (driver);
    	
    	s1.gearsbutton();
    	
    	s1.skillrarydemoapp();
    	
    	
    	driverutilities.switchtabs(driver);
    	
    	
    	SkillaryDemoLogin sd = new SkillaryDemoLogin (driver);
    	
    	driverutilities.mouseHover(driver, sd.getCoursetab());
    	
    	sd.seleniumtraining();
    	
    	AddToCart ad = new AddToCart (driver);
    	
    	driverutilities.doubleclick(driver, ad.getPlus());
    	
    	ad.cartbutton();
    	
    	driverutilities.alertpopup(driver);
    	
    }
    
	
}