package com.fab_alley.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.mail.EmailException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/*
 * 
 * @author ANUP KUMAR
 * @project FABALLEY_WEB
 * @DATE 18/09/2021
 * @Program Description- This the first file in which respective browser, URL both are defined in before method, script pass or fail , screenshot and browser close defined in after method
 *
 */

public class BaseLib {
	public WebDriver driver;  

	@BeforeMethod
	//@BeforeClass
	@Parameters("browser")
	
	public void setUp(String browserName){
	

		if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",".\\ExeFiles\\geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("Firefox Launched",true);
			driver.manage().window().maximize();		    
		}

		else if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",".\\ExFiles\\chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("Chrome Launched",true);
			driver.manage().window().maximize();
		}

		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver",".\\ExeFiles\\IEDriverserver.exe");
			driver=new InternetExplorerDriver();
			Reporter.log("IE Launched",true);
		}

		driver.manage().window().maximize();

		driver.get(GetPropertiesValue.getValue("fablive"));
//		driver.get(VConstants.liveUrl);
		//driver.get(GetPropertiesValue.getValue("fabstaging"));
		WaitStatementLib.implicitWaitForSeconds(driver,10);


		if (driver.findElement(By.id("header1pnlloadPopupemail")).isDisplayed()) {
		
				//if (driver.findElement(By.id("submitheader1pnlloadPopup")).isDisplayed()) {
					System.out.println("popup is displayed");
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					driver.findElement(By.xpath("//a[@class='btnNoThanks']")).click();
					System.out.println("popup is closed");

				}


		else {

			// NewIn menu
			
			//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			
			WebElement NewIn = driver.findElement(By.xpath("//a[contains(text(),'New In')]"));

			Actions NewInAction = new Actions(driver);
			
//			Actions 
//
//			NewInAction.moveToElement(NewIn).build().perform();
//		}
		}
		}
		}

	//@AfterMethod
//	public void testDown(ITestResult result) throws EmailException, InvalidFormatException, IOException{
//		if (result.isSuccess()){
//			Reporter.log("Script passed",true);
//			//	Extentreport.newreport();
//			SendEmail.sendEmail(true);
//		}
//		else{
//			String fileName=result.getMethod().getMethodName();
//			ScreenshotLib slib=new ScreenshotLib();
//			slib.getScreenshot(driver, fileName);
//			System.out.println("Script is failed");
//			Reporter.log("Screenshot has been taken",true);	
//			//Extentreport.newreport();
//			SendEmail.sendEmail(false);
//		}
//		//driver.close();
//		driver.quit();
//		Reporter.log("browser closed",true); 
//	}
//	


	//@AfterSuite

//	public void sendemail() throws InvalidFormatException, EmailException, IOException {
//			//Reporter.log("Script passed",true);
//			ExtentsReports.FA_ExtentReport();
//	//		SendEmail.sendEmail(true);
//		}
//		else{
//			String fileName=result.getMethod().getMethodName();
//			ScreenshotLib slib=new ScreenshotLib();
//			slib.getScreenshot(driver, fileName);
//			System.out.println("Script is failed");
//			Reporter.log("Screenshot has been taken",true);	
//			ExtentsReports.FA_ExtentReport();
//			SendEmail.sendEmail(false);
		//}


	//}

