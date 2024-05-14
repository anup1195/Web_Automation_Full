package com.fab_alley.pageobjects;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.fab_alley.generic.ExcelUtils;

public class FA_Verificationpage {

	
		public void FA_TCLP001(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("Login", 1, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String Invalidloginmsg=driver.findElement(By.xpath("//span[contains(text(),'Mobile/Email is required!')]")).getText();
			String Expectedinvalidloginmsg=ExcelUtils.readData("Login", 1, 5);
			Assert.assertEquals(Invalidloginmsg, Expectedinvalidloginmsg);
			System.out.println(ExcelUtils.readData("Login", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 1, 0) + " is verified",true);			
		}
				
		public void FA_TCLP002(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			String Actualmsg=driver.findElement(By.id("emailError")).getText();
			String Expectedmsg=ExcelUtils.readData("Login", 2, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			String Invalidloginmsg=driver.findElement(By.xpath("//span[contains(text(),'Please enter your registered email ID')]")).getText();
			String Expectedinvalidloginmsg=ExcelUtils.readData("Login", 2, 5);
			Assert.assertEquals(Invalidloginmsg, Expectedinvalidloginmsg);
			System.out.println(ExcelUtils.readData("Login", 2, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 2, 0) + " is verified",true);
		
		}
		
		public void FA_TCLP003(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			String Actualmsg=driver.getCurrentUrl();
//			String Actualmsg=driver.findElement(By.id("emailError")).getText();
			String Expectedmsg=ExcelUtils.readData("Login", 3, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 3, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 3, 0) + " is verified",true);
		
		}
		
		public void FA_TCLP004(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			String Actualmsg=driver.getCurrentUrl();
			String Expectedmsg=ExcelUtils.readData("Login", 4, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 4, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 4, 0) + " is verified",true);
		
		}
		public void FA_TCLP005(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			//String Actualmsg=driver.getCurrentUrl();
			String Actualmsg=driver.findElement(By.id("passError")).getText();
			String Expectedmsg=ExcelUtils.readData("Login", 5, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 5, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 5, 0) + " is verified",true);
		
		}
	
		public void FA_TCLP006(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			//String Actualmsg=driver.getCurrentUrl();
			String Actualmsg=driver.findElement(By.xpath("//div[@class='marError']")).getText();
			System.out.println(Actualmsg);
			String Expectedmsg=ExcelUtils.readData("Login", 6, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 6, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 6, 0) + " is verified",true);
		
		}
		
		public void FA_TCLP007(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			String Actualmsg=driver.getCurrentUrl();
			System.out.println(Actualmsg);
			String Expectedmsg=ExcelUtils.readData("Login", 7, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			Reporter.log("Login with email is successful",true);
			System.out.println(ExcelUtils.readData("Login", 7, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 7, 0) + " is verified",true);
		
		}
		public void FA_TCLP008(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			String Actualmsg=driver.getCurrentUrl();
			System.out.println(Actualmsg);
			String Expectedmsg=ExcelUtils.readData("Login", 8, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 8, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 8, 0) + " is verified",true);
		
		}
		
		public void FA_TCLP009(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
//			String Actualmsg=driver.getCurrentUrl();
			String Actualmsg=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
			System.out.println(Actualmsg);
			String Expectedmsg=ExcelUtils.readData("Login", 9, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 9, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 9, 0) + " is verified",true);
		
		}

		public void FA_TCLP0010(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			String Actualmsg=driver.getCurrentUrl();
			System.out.println(Actualmsg);
			String Expectedmsg=ExcelUtils.readData("Login", 10, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 10, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 10, 0) + " is verified",true);
		
		}
		public void FA_TCLP0011(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);
			String Actualmsg=driver.getCurrentUrl();
			System.out.println(Actualmsg);
			String Expectedmsg=ExcelUtils.readData("Login", 11, 3);
			Assert.assertEquals(Actualmsg, Expectedmsg);
			System.out.println(ExcelUtils.readData("Login", 11, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("Login", 11, 0) + " is verified",true);
		}
	
		
	}


