	
	package com.fab_alley.pageobjects;
	
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.Reporter;
	
	import com.fab_alley.generic.ExcelUtils;
	
	public class FA_RegressionVerificationPage {
	
		
			public void ExistingUserCOD(WebDriver driver) throws InvalidFormatException{
				
				Reporter.log("Home page url is verified",true);	
				String Actualmsg=driver.getCurrentUrl();	
				String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
				Assert.assertEquals(Actualmsg, Expectedmsg);		
				String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
				String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
				Assert.assertEquals(categorypage, expcategorypage);
				System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
				Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
				
			}
			
			public void ExistingUserPrepaid(WebDriver driver) throws InvalidFormatException{
				
				Reporter.log("Home page url is verified",true);	
				String Actualmsg=driver.getCurrentUrl();	
				String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
				Assert.assertEquals(Actualmsg, Expectedmsg);		
				String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
				String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
				Assert.assertEquals(categorypage, expcategorypage);
				System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
				Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
				
			}
			
			public void ExistingUserPaypal(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
			String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
			Assert.assertEquals(categorypage, expcategorypage);
			System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
			
		}
		
			public void NewUserCOD(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
			String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
			Assert.assertEquals(categorypage, expcategorypage);
			System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
			
		}
		
			public void NewUserPrepaid(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
			String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
			Assert.assertEquals(categorypage, expcategorypage);
			System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
			
		}
		
			public void NewUserUserPaypal(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
			String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
			Assert.assertEquals(categorypage, expcategorypage);
			System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
			
		}
		
			public void GuestCheckoutCOD(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
			String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
			Assert.assertEquals(categorypage, expcategorypage);
			System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
			
		}
		
			public void GuestCheckoutPrepaid(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
			String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
			Assert.assertEquals(categorypage, expcategorypage);
			System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
			
		}
		
			public void GuestUserPaypal(WebDriver driver) throws InvalidFormatException{
			
			Reporter.log("Home page url is verified",true);	
			String Actualmsg=driver.getCurrentUrl();	
			String Expectedmsg=ExcelUtils.readData("ExistingUser", 2, 3);		
			Assert.assertEquals(Actualmsg, Expectedmsg);		
			String categorypage=driver.findElement(By.partialLinkText("Home")).getText();
			String expcategorypage=ExcelUtils.readData("ExistingUser", 3, 3);
			Assert.assertEquals(categorypage, expcategorypage);
			System.out.println(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified");
			Reporter.log(ExcelUtils.readData("ExistingUser", 1, 0) + " is verified",true);	
			
		}
		
	}