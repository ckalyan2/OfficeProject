package erecruitAutomation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;
	public By uploadfile = By.xpath("//input[@id=\"ctl00_cphMain_radUploadTextBox0\"]");
	public By usethisfile = By.xpath("//a[@id=\"toolsUploadUseFileAsIs\"]");
	
	public void LoginPage()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Test\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://preview.erecruit.com");
		//driver.get("https://spicejet.com");
		driver.get("https://preview.erecruit.com/");
	}
	
	public void AppLoin() 
	{
		
		driver.findElement(By.xpath("//input[@name=\"ctl00$cphMain$logIn$UserName\"]")).sendKeys("test@erecruit.com");
		driver.findElement(By.xpath("//input[@name=\"ctl00$cphMain$logIn$Password\"]")).sendKeys("Danko117");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		String title = driver.findElement(By.xpath("//h1[@title=\"Dashboard\"]")).getText();
		System.out.println(title);
		if (title.equals("Dashboard"))
			System.out.println("Test Passed");
		else 
			System.out.println("Test Failed"); 	
	}
	
	public void AddCandidatewithoutResume()
	{
		driver.findElement(By.xpath("//img[@src=\"/App_Themes/Default/images/logos/logo.png\"]")).click();
		driver.findElement(By.xpath("//li[@class=\"new\"]//span[@data-bind=\"text: Title\"]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		//driver.findElement(By.xpath("//div/ul/li[contains(text(),\"Mr.\")]")).click();
// Implementation of Bootstrap & JavaScript Executor.
		List<WebElement> lists = driver.findElements(By.xpath("//div[@id=\"ctl00_cphMain_Address_ddlPrefix_DropDown\"]//div[@class=\"rcbScroll rcbWidth\"]//ul[@class=\"rcbList\" and @style=\"list-style:none;margin:0;padding:0;zoom:1;\"]/li"));
		System.out.println(lists.size());
		for (int i=1; i<=lists.size(); i++)
		{
			System.out.println(lists.get(i).getText());
			If(lists.get(i).getText().equals("Mr."));
			{
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				jse2.executeScript("arguments[0].click()", lists.get(i));
				break;
			}
		}
//Bootstrap implementation ends.
		driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_txtFName\"]")).sendKeys("KalSelfrstTest17");
		driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_txtLName\"]")).sendKeys("KalSellastTest17");
		driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_Address_txtAddr1\"]")).sendKeys("Miyapur,HYDERABAD");
		driver.findElement(By.xpath("//input[@id=\"AdSourceDropdown_ddladsource\"]")).click();
		driver.findElement(By.xpath("//ul/li/a[text()=\"Broadlook\"]")).click();
		WebElement element2 = driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_ddlFolderGroup_Input\"]"));
		element2.sendKeys("Acct/Finance | Acct/ Finance | A/P - A/R");
		driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_ucCommunicationMethods_rptEdit_ctl02_txtValue\"]")).sendKeys("9885630059");
		driver.findElement(By.xpath("//input[@id=\"ctl00_cphMain_btnNext_input\"]")).click();
		WebElement element3 = driver.findElement(By.xpath("//h1[@title=\"Candidate\"]"));
//		WebElement element3 = driver.findElement(By.xpath("//h1[@title="Candidate"]"));
		String tooltip = element3.getText();
		tooltip = tooltip.replaceAll("\\D", "");
		System.out.println("Generated tooltip: "+ tooltip.substring(4,11));
		
		
	}
	private void If(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	public void CloseApp()
	{
		driver.close();
	}
	
	public void AddCandidatewithResume()
	{
		driver.findElement(By.xpath("//img[@src=\"/App_Themes/Default/images/logos/logo.png\"]")).click();
		driver.findElement(By.xpath("//li[@class=\"new\"]//span[@data-bind=\"text: Title\"]")).click();
		driver.findElement(By.xpath("//li[@class=\"candidate\"]//span[@title=\"Keyboard Shortcut: Shift+N, C\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(By.xpath("//iframe[contains(@id,'candidate_new')]"));
		driver.switchTo().frame(element3);
		WebElement uploadElement = driver.findElement(uploadfile);
		uploadElement.sendKeys("C:\\Selenium\\KalyanTest\\Pham_word.docx");
		driver.findElement(usethisfile).click();
	}
	
}
