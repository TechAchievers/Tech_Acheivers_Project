package goibibo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_home {
	@FindBy(xpath="//li[@class='active .']") private WebElement flight;
	@FindBy(xpath="//span[text()='One-way']") private WebElement Oneway_button;
	@FindBy(xpath="//p[@class='sc-17gtelb-81 bIYRTA']") private WebElement popup_window;
	@FindBy(xpath="//span[text()='From'][1]") private WebElement from;
	@FindBy(xpath="//input[@type='text']") private WebElement from_text;
	@FindBy(xpath="//span[text()='Mumbai, India']") private WebElement from_City;
	@FindBy(xpath="//span[text()='To']") private WebElement to;
	@FindBy(xpath="//input[@type='text']") private WebElement to_text;
	@FindBy(xpath="//span[text()='Dubai, United Arab Emirates']") private WebElement to_City;
	@FindBy(xpath="//span[@aria-label='Next Month']") private WebElement next_month;
	@FindBy(xpath="//div[text()='December 2022']") private WebElement departure;
	@FindBy(xpath="//div[@aria-label='Tue Dec 06 2022']") private WebElement departure_date;
	@FindBy(xpath="//span[text()='Done']") private WebElement done_button;
	@FindBy(xpath="//*[@id=\"root\"]//div[3]//span[3]") private WebElement traveller;
	@FindBy(xpath="//a[text()='Done']") private WebElement done;
	@FindBy(xpath="//span[text()='SEARCH FLIGHTS']") private WebElement search_flights;
	
	
public Goibibo_home(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void home() {
	int no_traveller = 3;
	flight.click();
	Oneway_button.click();
	popup_window.click();
	from.click();
	from_text.sendKeys("BOM");
	from_text.click();
	from_City.click();;
	to_text.click();
	to_text.sendKeys("Dubai, United Arab Emirates");
	to_text.click();
	to_City.click();
	next_month.click();
	departure.click();
	departure_date.click();
	done_button.click();
	for(int i =1 ; i<no_traveller;i++) {
	traveller.click();
	}
	done.click();
	search_flights.click();
}

}
