package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillaryLoginPage;
import pomPages.WishlistPage;

public class TestCase3  extends BaseClass
{

	@Test 
	
	public void tc3() throws IOException, InterruptedException
	
	{
		SkillaryLoginPage s1 = new SkillaryLoginPage (driver);
		
	    s1.searchtextbox(pdata.getData("coursename"));
	    
	    s1.searchbtn();
	    
	    CoreJavaPage cp = new CoreJavaPage(driver);
	    
	    cp.java();
	    
	    WishlistPage wp = new WishlistPage (driver);
	    		
	  	driverutilities.switchFrame(driver);
	  	
	  	wp.playbutton();
	  	
	  	Thread.sleep(10000);
	    
		wp.pausebutton();
		
		driverutilities.switchbackframe(driver);
		
		wp.addtowishlist();
		
		
	}
}
