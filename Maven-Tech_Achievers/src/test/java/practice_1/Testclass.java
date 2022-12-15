package practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import amazonLoginPage.LoginPage;
import amazonLoginPage.UserName;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		String Actual_url =driver.getCurrentUrl();
		String expected_url ="https://www.amazon.in/";
		//String title = driver.getTitle();
//		if(url.equals("https://www.amazon.in/") )
//		{
//			System.out.println("url is matched"+"\nTest Case : Pass");
//		}else {
//			System.out.println("url didn't matched"+"\nTest Case : Fail");
//		}
		
		Assert.assertEquals(Actual_url,expected_url);
		//Assert.assertEquals(title,"Online Shopping site in India :");
		
		LoginPage loginpg = new LoginPage(driver);
		loginpg.signinbutton();
		UserName username = new UserName(driver);
		username.userid();

	}

}
