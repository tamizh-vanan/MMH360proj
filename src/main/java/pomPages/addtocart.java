package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
@FindBy(id="add")
private WebElement addbtn;
@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement addtocart;

public addtocart(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddbtn() {
	return addbtn;
}
public void addtocart(){
	addtocart.click();
}
}
