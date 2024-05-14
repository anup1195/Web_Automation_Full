package com.faballey.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class FA_BasicAuthenticationPopUp {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",".\\ExeFiles\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tanuj Aggarwal\\Desktop\\automation\\Drivers\\geckodriver.exe");
//			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://newuistaging.faballey.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
				if(driver.findElement(By.id("submitheader1pnlloadPopup")).isDisplayed()){
					
					driver.findElement(By.xpath("//a[@class='btnNoThanks regsbtm']")).click();
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					
					
					driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
				}
					
				else {
					
					driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
					
				}
				
				
////				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//				
////		        String Loginurl="http://staging.faballey.com/account/login";
////				
////				String ExpLoginurl=driver.getCurrentUrl();
////				
//				//Assert.assertEquals(Loginurl, ExpLoginurl);
//				
//				System.out.println("Login Page Url is verified");
//				
//				driver.findElement(By.xpath("//input[@id='cust-email']")).sendKeys("9025092760");
//				
//				driver.findElement(By.id("verifyEmail")).click();
//				
//				driver.findElement(By.id("cust-pass")).sendKeys("Anup13");
//				
//				for(int i =0; i<100; i++)
//				{
//					if(driver.findElement(By.id("btn-login")).isDisplayed()){
//						
//						driver.findElement(By.id("btn-login")).click();
//					}
//						
//					else {
//						driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//						driver.findElement(By.id("btn-login")).click();
//					}
//						System.out.println(driver.getTitle());
//				
////				driver.findElement(By.xpath("//div[@class='shwlgndrpdwn']")).click();
////				driver.findElement(By.xpath("//a[@id='_l_ot']")).click();
//			}
		}
	}



