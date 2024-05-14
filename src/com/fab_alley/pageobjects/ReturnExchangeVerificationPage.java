//package com.fab_alley.pageobjects;
//
//import java.io.IOException;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.Reporter;
//
//import com.fab_alley.generic.ExcelUtils;
//import com.fab_alley.generic.Extentreport;
//
//public class ReturnExchangeVerificationPage {
//
//	
//		public void TCRE001(WebDriver driver) throws InvalidFormatException, IOException{
//			
//			Reporter.log("Home page url is verified",true);	
//			String Actualmsg=driver.getCurrentUrl();	
//			String Expectedmsg=ExcelUtils.readData("Login", 1, 3);		
//			Assert.assertEquals(Actualmsg, Expectedmsg);		
//////			String Invalidloginmsg=driver.findElement(By.xpath("//span[contains(text(),'Mobile/Email is required!')]")).getText();
//////			String Expectedinvalidloginmsg=ExcelUtils.readData("Login", 1, 5);
//////			Assert.assertEquals(Invalidloginmsg, Expectedinvalidloginmsg);
////			System.out.println(ExcelUtils.readData("Login", 1, 0) + " is verified");
//			Reporter.log(ExcelUtils.readData("Login", 1, 0) + " is verified",true);	
//			//Extentreport.newreport("return echange is ok");
//			
//	
//			
//		}
//
//}
