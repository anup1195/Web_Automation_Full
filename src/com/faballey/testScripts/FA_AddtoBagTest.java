package com.faballey.testScripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;import org.openqa.selenium.WebElement;

/**
 * 
 * @author ANUP
 *
 */

public class FA_AddtoBagTest {

	@Test()
	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tanuj Aggarwal\\Desktop\\automation\\Drivers\\geckodriver.exe");
//		
//		WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver",".\\ExeFiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://newuistaging.faballey.com/");

		String homeurl = "https://www.faballey.com/";

		String ExpHomeurl = driver.getCurrentUrl();

		//Assert.assertEquals(homeurl, ExpHomeurl);

		System.out.println("Url is verified");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (driver.findElement(By.id("header1pnlloadPopupemail")).isDisplayed()) {

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//a[@class='btnNoThanks']")).click();

			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		}

		else {

			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String Loginurl = "https://www.faballey.com/";

		String ExpLoginurl = driver.getCurrentUrl();

		//Assert.assertEquals(Loginurl, ExpLoginurl);

		System.out.println("Login Page Url is verified");

		driver.findElement(By.xpath("//input[@id='txtloginSignupUsername']")).sendKeys("anup@faballey.com");
		
		driver.findElement(By.xpath("//a[@class='logincntn']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtloginSignupPassword']")).sendKeys("Anup123");

		driver.findElement(By.xpath("//a[@class='logincntn']")).click();

		String HomePage = "https://www.faballey.com/#";

		String ExpHomepage = driver.getCurrentUrl();

		//Assert.assertEquals(HomePage, ExpHomepage);

		System.out.println("Home Page is verified");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[5]/a[1]")).click();
		
		String SortURL="https://www.faballey.com/whats-new/cat?depth=1&label=New%20In";
		
//		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[2]/div[2]/div[4]/div[1]/ul[1]/li[4]/a[1]/i[1]")).click();
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Price: Low to High')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[2]/div[2]/div[5]/ul[1]/li[1]/a[1]/div[1]/img[1]")).click();
		
		//driver.findElement(By.xpath("//li[1]//a[1]//div[1]//img[1]")).click();

		Set<String> tab = driver.getWindowHandles();

		Iterator<String> it = tab.iterator();

		while (it.hasNext())

		{
			driver.switchTo().window(it.next());

			System.out.println(driver.getTitle());

		}

		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[4]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();

		//driver.findElement(By.xpath("//a[contains(text(),'S')]")).click();

		driver.findElement(By.xpath("//a[@class='addbagBtn addtobag']")).click();

		System.out.println("Item is successfully added to the bag");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='addbagBtn gotobag']")).click();

		// Coupon
		
//		driver.findElement(By.xpath("//span[@class='applyCoupan']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='Ef3+Cj2iRbU=']")).click();
//		
//		driver.findElement(By.xpath("//a[@id='applyCpn']")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Place Order')]")).click();

		driver.findElement(By.xpath("//body//div[2]//div[2]//input[1]")).click();

		// body//div[2]//div[2]//input[1]

		// driver.findElement(By.xpath("//div[3]//div[2]//input[1]")).click();

		System.out.println("Address is selected");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Credit or debit card

//		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("4111111111111111");
//		
//		driver.findElement(By.xpath("//input[@id='card_name']")).sendKeys("anup kumar");
//		
//		driver.findElement(By.xpath("//input[@id='card_expiry']")).sendKeys("0422");
//		
//		driver.findElement(By.xpath("//input[@id='card_cvv']")).sendKeys("123");
//		
//		System.out.println("going to click payment link");
//		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		//driver.findElement(By.xpath("//article[1]//div[1]//button[1]")).click();
//		
//		System.out.println("order is placed");

		// COD

		driver.findElement(By.xpath("//a[contains(text(),'Cash on Delivery')]")).click();
			
		driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[2]/div[2]/article[5]/div[1]/button[1]")).click();
		
		//Cancel
		
		driver.findElement(By.xpath("//a[contains(text(),'TRACK ORDER')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/form[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//select[@id='reasonLst']")).sendKeys(Keys.DOWN);
		
		//driver.findElement(By.xpath("//a[contains(text(),'Ordered by mistake')]\")")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Cancel Order')]")).click();
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("txtotp")).sendKeys("");
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='divotpverify']")));
//		element1.click();

//		
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		Thread.sleep(30000);
//		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		//wait.until(ExpectedConditions.visibilityOf(By.xpath("//div[@class='divotpverify']")); 
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='divotpverify']"));
//		
//		
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		wait2.until(ExpectedConditions.elementToBeClickable(By.id("btnotpverify")));
//		
//		WebElement element = driver.findElement(By.id("btnotpverify"));
//		
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(element).click().build().perform();
//		
//		//driver.findElement(By.xpath("//div[@class='divotpverify']")).click();
//		
//		driver.findElement(By.id("btnotpverify")).click();
//		
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		Thread.sleep(30000);
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.razorPy")));
//		element.click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		// #Paypal

//		driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();
//
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		driver.findElement(By.xpath("//input[@id='subBtn']")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		WebElement element = driver.findElement(By.id("email"));
//		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		element.sendKeys("virendertest@faballey.com");
//		driver.findElement(By.id("password")).sendKeys("test1234");
//		driver.findElement(By.id("btnLogin")).click();
//
//		Thread.sleep(30000);
//
//		driver.findElement(By.id("payment-submit-btn")).click();
//
//		Thread.sleep(10000);
//
//		String ExpectedCnfmURL = "http://staging.faballey.com/checkout/confirmation";
//		System.out.println(ExpectedCnfmURL);
//		String ActualCfnmUrl = driver.getCurrentUrl();
//		System.out.println(ActualCfnmUrl);
//		//Assert.assertEquals(ExpectedCnfmURL, ActualCfnmUrl);
//		System.out.println("Order is placed");

	}

}