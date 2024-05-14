package com.fab_alley.script;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FA_NewUser {
	
		public static void main(String[] args) throws InterruptedException {

//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tanuj Aggarwal\\Desktop\\automation\\Drivers\\geckodriver.exe");
//			
//			WebDriver driver=new FirefoxDriver();

			System.setProperty("webdriver.chrome.driver",".\\ExeFiles\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.faballey.com/");

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

			driver.findElement(By.xpath("//input[@id='txtloginSignupUsername']")).sendKeys("newuser@faballey.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@class='logincntn']")).click();
			
			//driver.findElement(By.xpath("//input[@id='txtloginSignupPassword']")).sendKeys("Anup1234");

			//driver.findElement(By.xpath("//a[@class='logincntn']")).click();

			String HomePage = "https://www.faballey.com/#";

			String ExpHomepage = driver.getCurrentUrl();

			//Assert.assertEquals(HomePage, ExpHomepage);

			System.out.println("Home Page is verified");

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[5]/a[1]")).click();
			
			String SortURL="https://www.faballey.com/whats-new/cat?depth=1&label=New%20In";
			
			driver.findElement(By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[2]/div[2]/div[5]/ul[1]/li[1]/a[1]/div[1]/img[1]")).click();

			Set<String> tab = driver.getWindowHandles();

			Iterator<String> it = tab.iterator();

			while (it.hasNext())

			{
				driver.switchTo().window(it.next());

				System.out.println(driver.getTitle());

			}

			//Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//body/div[@id='wrapper']/div[4]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();

			//driver.findElement(By.xpath("//a[contains(text(),'S')]")).click();

			driver.findElement(By.xpath("//a[@class='addbagBtn addtobag']")).click();

			System.out.println("Item is successfully added to the bag");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//a[@class='addbagBtn gotobag']")).click();
			
// ====================Edit Bag==============================

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println("edit");
			
			driver.findElement(By.xpath("//li[@class='showEdit']")).click();
			
			System.out.println("edit clicked");
			
			driver.findElement(By.xpath("//body/div[@id='ulbagDesk']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")).sendKeys(Keys.DOWN);
			
			driver.findElement(By.xpath("//a[@class='saveEdit']")).click();


//		======================= Coupon start====================================================
			
//			driver.findElement(By.xpath("//span[@class='applyCoupan']")).click();
//			
//			driver.findElement(By.xpath("//input[@id='Ef3+Cj2iRbU=']")).click();
//			
//			driver.findElement(By.xpath("//a[@id='applyCpn']")).click();
			
//			=====================coupon end======================================================

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//a[contains(text(),'Place Order')]")).click();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
//           ================================ Add new Adderess ===================================
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			driver.findElement(By.xpath("//p[contains(text(),'Add New Address')]")).click();
			//
			driver.findElement(By.xpath("//input[@id='add-pincode']")).sendKeys("201301");
			
			driver.findElement(By.xpath("//textarea[@id='addaddress']")).sendKeys("c 11 test");
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			
			js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			driver.findElement(By.xpath("//input[@id='addnewAdd']")).click();
			
			
//========================== OutOfIndia ============================
			
			driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[3]/div[2]/input[1]")).click();		

//======================== Credit or debit card =================================

//			driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("4111111111111111");
//			
//			driver.findElement(By.xpath("//input[@id='card_name']")).sendKeys("anup kumar");
//			
//			driver.findElement(By.xpath("//input[@id='card_expiry']")).sendKeys("0422");
//			
//			driver.findElement(By.xpath("//input[@id='card_cvv']")).sendKeys("123");
//			
//			System.out.println("going to click payment link");
//			
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//			
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			
//			//driver.findElement(By.xpath("//article[1]//div[1]//button[1]")).click();
//			
//			System.out.println("order is placed");
			

//          ================================ COD ===========================================

			driver.findElement(By.xpath("//a[contains(text(),'Cash on Delivery')]")).click();
				
			driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[2]/div[2]/article[5]/div[1]/button[1]")).click();
			
//          ============================= PAYPAL ==================================================
			
			driver.findElement(By.xpath("//a[contains(text(),'Paypal')]")).click();		
			
//          =============================== Cancel ===========================================
		
			driver.findElement(By.xpath("//a[contains(text(),'TRACK ORDER')]")).click();
			
			driver.findElement(By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/form[1]/input[1]")).click();
			
			driver.findElement(By.xpath("//select[@id='reasonLst']")).sendKeys(Keys.DOWN);
			
			//driver.findElement(By.xpath("//a[contains(text(),'Ordered by mistake')]\")")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Cancel Order')]")).click();

}
			}
