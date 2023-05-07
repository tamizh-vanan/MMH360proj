package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void CloseApp() {
		driver.quit();
	}
	
}
