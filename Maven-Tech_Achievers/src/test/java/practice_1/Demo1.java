package practice_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo1 {

			public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
				// to disable notification window.
				
				ChromeOptions options = new ChromeOptions();
				//options.addArguments("start-maximized");
				options.addArguments("disable-notifications");
				String user_id = "khedkar.sneha@ymail.com";
				String pwd = "amoha@18";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				WebElement UserName = driver.findElement(By.xpath("// input[@ id = 'email']"));
				UserName.sendKeys(user_id);
				WebElement Password = driver.findElement(By.xpath("//input[@ name = 'pass']"));
				Password.sendKeys(pwd);
				WebElement LogIn_button = driver.findElement(By.xpath("// button[@ type ='submit']"));
				Thread.sleep(3000);
				LogIn_button.click();
				//Thread.sleep(3000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,3000)");
				Thread.sleep(3000);
				Thread.sleep(12000);
				driver.close();
				String path ="C:\\Users\\Dell\\OneDrive\\Desktop\\Selenium_Practice.xlsx";
				FileInputStream file = new FileInputStream(path);
				String str=WorkbookFactory.create(file).getSheet("Test_case").getRow(0).getCell(0).getStringCellValue();
				System.out.println(str);
				Workbook w=WorkbookFactory.create(file);
				 Sheet s=w.getSheet("Test_case");
				 int last_row_no= s.getLastRowNum();
				 System.out.println(last_row_no);
				 for( int i=0;i<=last_row_no;i++) { 
					 Row row = s.getRow(i);
					 int last_cell_no=row.getLastCellNum();
					 for( int j=0;j<last_cell_no;j++) {
						 String str1 =row.getCell(j).getStringCellValue();
						 System.out.print(str1+"  ");
						
					 }
					 System.out.println();
				
				 }
				
				
				
				

			}

		}



