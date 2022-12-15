package testclass.goibibo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import goibibo_pom.Goibibo_home;

public class Goibibo_testclass {
	WebDriver driver;
	Goibibo_home obj;
	@Parameters("browser") 
	@BeforeTest 
	public void openbrowser(String browserName) {
	
		if(browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     this.driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		if(browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		     this.driver = new EdgeDriver();
		     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			}
		
	}
	@BeforeClass
	public void objectcreation() {
		obj = new Goibibo_home(driver);
		
	}
	@BeforeMethod
	public void beforemethod() {
		driver.get("https://www.goibibo.com/");
		
	}
	@Test(priority=1)
	public void verify() {
		SoftAssert soft = new SoftAssert();
		String actual_url = driver.getCurrentUrl();
		String expected_url = "https://www.goibibo.com";
		soft.assertEquals(actual_url, expected_url,"url not matched : ");
		String actual_title = driver.getTitle();
		String expected_title = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
		soft.assertEquals(actual_title, expected_title,"Title  not matched :");
		WebElement flight = driver.findElement(By.xpath("//li[@class='active .']"));
		boolean result =flight.isDisplayed();
		soft.assertEquals(result, true,"Flight Button Not Displayed ");
		soft.assertAll();
				
	}
	@Test (priority =2)
	public void test() {
		
		obj.home();
	}
@AfterClass
public void clearobjects() {
	obj = null;
	
}
@AfterTest
public void closebrowser() {
	driver = null;
	System.gc();
	driver.close();
	
}
}
