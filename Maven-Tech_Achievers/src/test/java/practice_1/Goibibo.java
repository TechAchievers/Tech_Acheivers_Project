package practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		//Thread.sleep(3000);
		String actual_url = driver.getCurrentUrl();
		String expected_url = "https://www.goibibo.com/";
		if (actual_url.equals(expected_url)) {
			System.out.println("Test Case : Pass");
		}else
		{
			System.out.println("Test Case : Fail");
		}
		Assert.assertEquals(actual_url, expected_url);
		String actual_title = driver.getTitle();
		String expected_title = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
		if (actual_url.equals(expected_url)) {
			System.out.println("Test Case : Pass");
		}else
		{
			System.out.println("Test Case : Fail");
		}
		Assert.assertEquals(actual_title, expected_title);
		WebElement flight = driver.findElement(By.xpath("//li[@class='active .']"));
		boolean result =flight.isDisplayed();
		if(result== false) {
			System.out.println("Test Case1 : Pass");
		}else
		{
			System.out.println("Test Case1 : Fail");
		}
		Assert.assertEquals(result, true);
		
		flight.click();
		WebElement Oneway_button = driver.findElement(By.xpath("//span[text()='One-way']"));
		Oneway_button.click();
		
		driver.findElement(By.xpath("//p[@class='sc-17gtelb-81 bIYRTA']")).click();
		WebElement from = driver.findElement(By.xpath("//span[text()='From'][1]"));
		from.click();
	WebElement from_text = driver.findElement(By.xpath("//input[@type='text']"));
	from_text.sendKeys("BOM");
		from_text.click();
		Thread.sleep(3000);
		WebElement from_City = driver.findElement(By.xpath("//span[text()='Mumbai, India']"));
		from_City.click();
		
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.xpath("//span[text()='To']"));
		
	WebElement to_text = driver.findElement(By.xpath("//input[@type='text']"));
	to_text.click();
	to_text.sendKeys("Dubai, United Arab Emirates");
	to_text.click();
	Thread.sleep(3000);
	WebElement to_City = driver.findElement(By.xpath("//span[text()='Dubai, United Arab Emirates']"));
	to_City.click();
		Thread.sleep(3000);
		WebElement next_month = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		next_month.click();
		Thread.sleep(3000);
		WebElement departure = driver.findElement(By.xpath("//div[text()='December 2022']"));
		departure.click();
		WebElement departure_date = driver.findElement(By.xpath("//div[@aria-label='Tue Dec 06 2022']"));
		departure_date.click();
		WebElement done_button = driver.findElement(By.xpath("//span[text()='Done']"));
		done_button.click();
		int no_adult = 2;
		for(int i=1;i<no_adult;i++) {
		Thread.sleep(3000);
		
WebElement traveller = driver.findElement(By.xpath("//*[@id=\"root\"]//div[3]//span[3]"
			));
traveller.click();
//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div[1]/div[1]/span[3]

		}
			driver.findElement(By.xpath("//a[text()='Done']")).click();
			driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
			//driver.close();
		}
		
	}

	

