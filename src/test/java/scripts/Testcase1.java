package scripts;

import org.testng.annotations.Test;

import genericLib.Baseclass;
import pomPages.addtocart;
import pomPages.skillraryDemoLogin;
import pomPages.skillraryLoginPages;

public class Testcase1 extends Baseclass {
@Test
public void tc1() {
	
	skillraryLoginPages s=new skillraryLoginPages(driver);
	s.gearButton();
	s.skillraryDemoButton();
	
	skillraryDemoLogin sd=new skillraryDemoLogin(driver);
	driverutilities.switchTabs(driver);
	driverutilities.mouseHover(driver, sd.getCoursebtn());
	sd.selenium();
	
	addtocart a=new addtocart(driver);
	driverutilities.doubleclick(driver, a.getAddbtn());
	a.addtocart();
	driverutilities.alterpopup(driver);
	
}

}
