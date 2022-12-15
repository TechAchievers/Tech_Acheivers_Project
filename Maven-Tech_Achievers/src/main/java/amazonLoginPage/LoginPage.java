package amazonLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//a[@data-nav-ref='nav_ya_signin']")private WebElement singInButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void signinbutton() {
		//singInButton.click();
	}
	

}
  
