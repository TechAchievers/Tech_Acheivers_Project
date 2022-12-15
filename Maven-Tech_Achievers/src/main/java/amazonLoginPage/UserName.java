package amazonLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserName {
	// WebDriver driver;
	    //@FindBy(xpath = "//a[@data-nav-ref='nav_ya_signin']")private WebElement singInButton;
		@FindBy (xpath="//input[@type ='email']") private WebElement userName;
		@FindBy (xpath = "//input[@id='continue']") private WebElement continue_button;
	
	public UserName(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this.driver=driver;
		
	}
	public void userid() {
		
		userName.sendKeys("89835 43745");
		continue_button.click();
		
	}
	
}
