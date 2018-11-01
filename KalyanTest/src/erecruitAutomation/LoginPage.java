package erecruitAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {
	public static void main(String[] args) {
		//public Login()
		//{
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\KalyanTest\\chromedriver");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://preview.erecruit.com");
			driver.findElement(By.xpath("//input[@name=\"ctl00$cphMain$logIn$UserName\"]")).sendKeys("test@erecruit.com");
			driver.findElement(By.xpath("//input[@name=\"ctl00$cphMain$logIn$Password\"]")).sendKeys("Danko117");
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			String title = driver.findElement(By.xpath("//h1[@title=\"Dashboard\"]")).getText();
			System.out.println(title);
			if (title.equals("Dashboard"))
				System.out.println("Test Passed");
			else 
				System.out.println("Test Failed"); 	
			//driver.close(); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			/*//input[@name="ctl00$cphMain$logIn$UserName"]  //input[@name="ctl00$cphMain$logIn$Password"] //input[@type="submit"] */
			driver.findElement(By.xpath("//img[@src=\"/App_Themes/Default/images/logos/logo.png\"]")).click();
			driver.findElement(By.xpath("//li[@class=\"new\"]//span[@data-bind=\"text: Title\"]")).click();
			
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//action.moveToElement(element).perform();
			WebElement element = driver.findElement(By.xpath("//li[@class=\"candidate\"]//span[@title=\"Keyboard Shortcut: Shift+N, C\"]"));
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			driver.findElement(By.xpath("//span[contains(text(),'Without')]")).click();
			//action.click();
			//action.perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String title1 = driver.findElement(By.xpath("//h1[@title=\"Add\"]")).getText();
			System.out.println(title1);
			if (title1.equals("Add New Candidate"))
				System.out.println("Test Passed");
			else 
				System.out.println("Test Failed"); 	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement element1 = driver.findElement(By.xpath("//iframe[contains(@id,'candidate_new')]"));
			driver.switchTo().frame(element1);
			driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_ddlPrefix_Input\"]")).click();
			driver.findElement(By.xpath("//div/ul/li[contains(text(),\"Mr.\")]")).click();
			driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_txtFName\"]")).sendKeys("KalSelfrstTest123");
			driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_txtLName\"]")).sendKeys("KalSellastTest123");
			driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_txtAddr1\"]")).sendKeys("Miyapur,HYDERABAD");
			driver.findElement(By.xpath("//input[@id=\"AdSourceDropdown_ddladsource\"]")).click();
			driver.findElement(By.xpath("//ul/li/a[text()=\"Broadlook\"]")).click();
			WebElement element2 = driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_ddlFolderGroup_Input\"]"));
			element2.sendKeys("Acct/Finance | Acct/ Finance | A/P - A/R");
			driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_ucCommunicationMethods_rptEdit_ctl02_txtValue\"]")).sendKeys("9885630059");
			driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_btnNext_input\"]")).click();
			WebElement element3 = driver.findElement(By.xpath("//h1[@title=\"Candidate\"]"));
//			WebElement element3 = driver.findElement(By.xpath("//h1[@title="Candidate"]"));
			String tooltip = element3.getAttribute("title");
		//	Utility utility = new Utility();
			
		//	int id = utility.getTitleID()
			
	//		driver.findElement(By.xpath("//div/ul/li[(text()=\"Acct/Finance | Acct/ Finance | A/P - A/R\")]")).click();;
		//	driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_btnNext_input\"]")).click();
			
			/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select PreFix = new Select(driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_ddlPrefix_Input\" and @name=\"ctl00$cphMain$Address$ddlPrefix\"]")));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PreFix.selectByValue("Mr.");*/
/*			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_ddlPrefix_Input\" and @type=\"text\"]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement element1 = driver.findElement(By.xpath("//div/ul/li[contains(text(),\"Mr.\")]"));
			element1.sendKeys("Mrs.");*/
	}
		
	/*	public void LogoMenu()
		{
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\KalyanTest\\chromedriver");
			
			driver.findElement(By.xpath("//img[@src=\"/App_Themes/Default/images/logos/logo.png\"]")).click();
			driver.findElement(By.xpath("//li[@class=\"new\"]//span[@data-bind=\"text: Title\"]")).click();
			driver.findElement(By.xpath("//li[@class=\"candidate\"]//span[@data-bind=\"click: Open, attr: { title: LongTitle }\"]")).click();
			String title1 = driver.findElement(By.xpath("//h1[@title=\"Add\"]")).getText();
			System.out.println(title1);
			if (title1.equals("Add New Candidate"))
				System.out.println("Test Passed");
			else 
				System.out.println("Test Failed"); 		
		}*/
		
		}
