package erecruitAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CandidateCreation extends BaseClass{
	
	public By AddOn = By.xpath("//ul/li/a[text()='Add-Ons']");
	public By StdDiscount = By.xpath("//ul/li/a[text()=\"Student Discount\"]");
	public By DepCity = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	//public By DepCity = By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	public By ArrCity = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
	//public By ArrCity = By.xpath("//input[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]");
	public By SearchButton =  By.name("ctl00$mainContent$btn_FindFlights");
	//public By SearchButton =  By.xpath("//div[@id=\"Div6\"]/span/input[@id=\"ctl00_mainContent_btn_FindFlights\"]");
	public By passangers = By.xpath("//div[@id=\"divpaxinfo\"]");
	
	public void StudentDiscount()
	{
	
	/*	WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\KalyanTest\\chromedriver");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://spicejet.com"); */
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(AddOn)).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(StdDiscount).click();
		
	}
	
	public void FlightSearch() throws InterruptedException
	{
			
		WebElement element2 = driver.findElement(DepCity);
		element2.sendKeys("Hyderabad");
		Thread.sleep(20);
		
		WebElement element3 = driver.findElement(ArrCity);
		element3.sendKeys("Chennai");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//td[@data-month=\"10\"]//a[text()='30']")).click();
				
		//Java Script Executor to perform click operations:
		WebElement element4 = driver.findElement(SearchButton);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", element4);
		
	}
}