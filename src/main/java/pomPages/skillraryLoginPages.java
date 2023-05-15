/**
 * 
 */
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Tamilvanan
 *
 */
public class skillraryLoginPages {
@FindBy (xpath="//a[text()=' GEARS '] ")
private WebElement Gearbtn;
@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement skillrarydemobtn;

public skillraryLoginPages (WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void gearButton() {
	Gearbtn.click();
}
public void skillraryDemoButton() {
	skillrarydemobtn.click();
} }


