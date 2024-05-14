package com.fab_alley.generic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.mail.EmailException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLibLambdaTest {
	
   public String username = "anupfaballey";
   public String accesskey = "NA4LHmNHOsSUIkK4O96JbuQ8IX5lzq7AOSYoEC5fHFRj7FdPAu";
   public static RemoteWebDriver driver = null;
   public String gridURL = "@hub.lambdatest.com/wd/hub";
	
	@BeforeMethod
	@BeforeClass
	
	public void setUp() throws Exception {
	       DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", "chrome");
	        capabilities.setCapability("version", "70.0");
	        capabilities.setCapability("platform", "win10"); 
	        capabilities.setCapability("build", "Faballey");
	        capabilities.setCapability("name", "FabAlley Automation");
	        try {
	            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
	        } catch (MalformedURLException e) {
	            System.out.println("Invalid grid URL");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	            
	        }
	       // driver.get(GetPropertiesValue.getValue("fablive"));
	        driver.get("https://www.faballey.com/");
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    


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

//			Actions NewInAction = new Actions(driver);
//
//			NewInAction.moveToElement(NewIn).build().perform();



	}
	}
	
	//@AfterClass
	@AfterMethod
//	public void testDown(ITestResult result) throws EmailException, InvalidFormatException, IOException{
//		if (result.isSuccess()){
//			Reporter.log("Script passed",true);
//			//Extentreport.newreport();
//			SendEmail.sendEmail(true);
//		
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
//	    driver.close();
//	    Reporter.log("browser closed",true);
}
	
	}
	
