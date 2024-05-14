package com.fab_alley.pageobjects;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class FA_Regressionpage  {
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginlink;

	@FindBy(id="txtloginSignupUsername")
	private WebElement unTxtBx;

	@FindBy(xpath="//a[@class='logincntn']")
	private WebElement contbtn;

	@FindBy(id="txtloginSignupPassword")
	private WebElement pwdTxtBx;

	@FindBy(xpath="//a[@class='logincntn']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//header/nav[1]/div[1]/ul[1]/li[5]/a[1]")
	private WebElement categorypage;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[3]/div[1]/div[2]/div[2]/div[5]/ul[1]/li[1]/a[1]/div[1]/img[1]")
	private WebElement Productpage;

	@FindBy(xpath="//a[@class='proSize']")
	private WebElement selectsize;
	
	
	@FindBy(xpath="//a[@class='addbagBtn addtobag']")
	private WebElement addtobag;
	
	@FindBy(xpath="//a[@class='addbagBtn gotobag']")
	private WebElement gotobag;
	
	@FindBy(xpath="//a[contains(text(),'Place Order')]")
	private WebElement placeorder_bagpage;
	
	@FindBy(xpath="//body//div[2]//div[2]//input[1]")
	private WebElement selectaddress;
	
	//@FindBy(xpath="//input[@id='ApplyCredit']")
	@FindBy(xpath="//body/div[7]/div[1]/div[2]/div[1]/div[1]/label[1]/dd[1]")
	private WebElement creditchkbx;
	
	@FindBy(xpath="//a[contains(text(),'Cash on Delivery')]")
	private WebElement CODButton;
	
	@FindBy(xpath="//a[contains(text(),'Net Banking')]")
	private WebElement NBbtn;
	
	@FindBy(xpath="//span[@class='icici bankActive']")
	private WebElement bankbutton;
	
	@FindBy(xpath="//body/div[7]/div[1]/div[1]/div[2]/div[2]/article[5]/div[1]/button[1]")
	private WebElement PlaceBtn;
	
	@FindBy(xpath="//body/div[7]/div[1]/div[1]/div[2]/div[2]/article[5]/div[1]/button[1]")
	private WebElement orderplacebtn;
	
	@FindBy(xpath="//a[contains(text(),'TRACK ORDER')]")
	private WebElement trackorderbtn;
	
	@FindBy(xpath="//input[@class='btn_CancelOrder cancelRtn']")
	private WebElement cancelorderbtn;
	
	@FindBy(xpath="//select[@id='reasonLst']")
	private WebElement reasonselectbtn;
	
	@FindBy(xpath="//a[contains(text(),'Cancel Order')]")
	private WebElement cancelordersubmitbtn;
	
	@FindBy(xpath="//a[contains(text(),'Track Order')]")
	private WebElement trorderbtn;
	
	@FindBy(xpath="//h3[contains(text(),'Login or Signup')]")
	private WebElement Loginpagevmsg;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")
	private WebElement Topcategorypage;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")
	private WebElement Sizeguidebtn;
	
	@FindBy(xpath="//div[@class='addNotify']")
	private WebElement addedmsg;
	
	@FindBy(xpath="//p[contains(text(),'My Shopping Bag')]")
	private WebElement Bagbagvmsg;
	
	@FindBy(xpath="//div[@class='prizeDetail'][1]")
	private WebElement subtotal;
	
	@FindBy(xpath="//div[@class='orderTotal'][1]")
	private WebElement ordertotal;
	
	@FindBy(xpath="//p[contains(text(),'Where do you want us to deliver?')]")
	private WebElement shippingpageverification;
	
	@FindBy(xpath="//p[contains(text(),'Add New Address')]")
	private WebElement addaddressbtn;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='add-phone']")
	private WebElement addphone;
	
	@FindBy(xpath="//input[@id='add-pincode']")
	private WebElement addpincode;
	
	@FindBy(xpath="//select[@id='Country']")
	private WebElement addaddress;
	
	@FindBy(xpath="//option[@value='7']")
	private WebElement australiaadd;
	
	@FindBy(xpath="//p[contains(text(),'Your order has been cancelled.')]")
	private WebElement cancelconfiramtion;
	
	@FindBy(xpath="//a[contains(text(),'Continue Shopping')]")
	private WebElement continueShopping;
	
	@FindBy(xpath="//i[@class='fa fa-caret-down']")
	private WebElement myaccountbtn;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/div[4]/ul[1]/li[3]/div[1]/a[1]/i[1]")
	private WebElement myaccount;
	
	@FindBy(xpath="//a[contains(text(),'My Orders')]")
	private WebElement myordersbtn;
	
	@FindBy(xpath="(//a[@class='orderdtlBtn'])")
	private WebElement orderdetailbtn;
	
	@FindBy(xpath="//a[@href='/account/myorderdetails?OrderId=1206794']")
	private WebElement Specificorderdetailsbtn;
	
	@FindBy(xpath="(//a[@class='rtnexcngBtn'])[1]")
	private WebElement Exchangebtn;
	
	@FindBy(xpath="(//a[@class='rtnexcngBtn'])[2]")
	private WebElement returntbn;
	
	@FindBy(xpath="(//a[@class='rtnexcngBtn'])[3]")
	private WebElement seconditemexchange;
	
	@FindBy(xpath="(//a[@class='rtnexcngBtn'])[4]")
	private WebElement seconditemreturn;
	
	
	
	public FA_Regressionpage(WebDriver driver){
		
		 PageFactory.initElements(driver,this);
		 
	 }
	
	 public void ExistingUserCOD(String username, String password,WebDriver driver) throws InterruptedException
	 {
		 
		 	loginlink.click();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			myaccount.click();
//			myordersbtn.click();
//			orderdetailbtn.click();
			
			
			categorypage.click();
			Thread.sleep(5000);
			Productpage.click();
			
			Set<String> tab = driver.getWindowHandles();

			Iterator<String> it = tab.iterator();

			while (it.hasNext())

			{
				driver.switchTo().window(it.next());

				System.out.println(driver.getTitle());

			}			
			Thread.sleep(5000);

			selectsize.click();
			System.out.println(driver.getTitle());
			addtobag.click();
			System.out.println(driver.getTitle());
			gotobag.click();
			System.out.println(driver.getTitle());
			placeorder_bagpage.click();
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			selectaddress.click();
			System.out.println(driver.getTitle());
			CODButton.click();
			System.out.println(driver.getTitle());
			creditchkbx.click();
			System.out.println("Credit is unchecked");
			Thread.sleep(5000);
			PlaceBtn.click();
			System.out.println(driver.getTitle());
			trackorderbtn.click();
			System.out.println(driver.getTitle());
//			cancelorderbtn.click();
//			System.out.println(driver.getTitle());
//			reasonselectbtn.sendKeys(Keys.DOWN);
//			cancelordersubmitbtn.click();
//			Thread.sleep(5000);
//		
//			for(int i=0;i<20;i++) {
//			if(continueShopping != null && continueShopping.isDisplayed()) {
//				continueShopping.click();
//			break;
//			}
//			else {
//				try {
//					
//				driver.switchTo().alert().accept();
//				cancelordersubmitbtn.click();
//				}catch(Exception ex) {}
//			}
//			}
//			driver.switchTo().alert().accept();
//			System.out.println(driver.getTitle());
	 }
	 

	
	 public void ExistingUserPrepaid(String username, String password, WebDriver driver) throws InterruptedException
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			
			Set<String> tab = driver.getWindowHandles();

			Iterator<String> it = tab.iterator();

			while (it.hasNext())

			{
				driver.switchTo().window(it.next());

				System.out.println(driver.getTitle());

			}	
			
			Thread.sleep(5000);
			
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			NBbtn.click();
			bankbutton.click();
			PlaceBtn.click();
	 }
	 
	 public void ExistingUserPaypal(String username, String password)
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			CODButton.click();
			PlaceBtn.click();
			orderplacebtn.click();
			trackorderbtn.click();
			cancelorderbtn.click();
			reasonselectbtn.sendKeys(Keys.DOWN);
			cancelordersubmitbtn.click();
	 }
 
	 public void NewUserCOD(String username, String password)
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			CODButton.click();
			PlaceBtn.click();
			orderplacebtn.click();
			trackorderbtn.click();
			cancelorderbtn.click();
			reasonselectbtn.sendKeys(Keys.DOWN);
			cancelordersubmitbtn.click();
	 }
	 
	 
	 public void NewUserPrepaid(String username, String password)
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			CODButton.click();
			PlaceBtn.click();
			orderplacebtn.click();
			trackorderbtn.click();
			cancelorderbtn.click();
			reasonselectbtn.sendKeys(Keys.DOWN);
			
			cancelordersubmitbtn.click();
	 }
	 
 
	 public void NewUserUserPaypal(String username, String password)
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			CODButton.click();
			PlaceBtn.click();
			orderplacebtn.click();
			trackorderbtn.click();
			cancelorderbtn.click();
			reasonselectbtn.sendKeys(Keys.DOWN);
			cancelordersubmitbtn.click();
	 }
	 
	 
	 public void GuestCheckoutCOD(String username, String password)
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			CODButton.click();
			PlaceBtn.click();
			orderplacebtn.click();
			trackorderbtn.click();
			cancelorderbtn.click();
			reasonselectbtn.sendKeys(Keys.DOWN);
			cancelordersubmitbtn.click();
	 }
	 
 
	 public void GuestCheckoutPrepaid(String username, String password)
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			CODButton.click();
			PlaceBtn.click();
			orderplacebtn.click();
			trackorderbtn.click();
			cancelorderbtn.click();
			reasonselectbtn.sendKeys(Keys.DOWN);
			cancelordersubmitbtn.click();
	 }
	
	 
	 public void GuestUserPaypal(String username, String password)
	 {
		 loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			selectaddress.click();
			CODButton.click();
			PlaceBtn.click();
			orderplacebtn.click();
			trackorderbtn.click();
			cancelorderbtn.click();
			reasonselectbtn.sendKeys(Keys.DOWN);
			cancelordersubmitbtn.click();
	 }
	 public void AddIndianAdress(String username, String password,WebDriver driver) throws InterruptedException
	 {
		 	loginlink.click();
			unTxtBx.sendKeys(username);
			contbtn.click();
			pwdTxtBx.sendKeys(password);
			loginBtn.click();
			categorypage.click();
			Productpage.click();
			Set<String> tab = driver.getWindowHandles();

			Iterator<String> it = tab.iterator();

			while (it.hasNext())

			{
				driver.switchTo().window(it.next());

				System.out.println(driver.getTitle());

			}			
			Thread.sleep(5000);
			selectsize.click();
			addtobag.click();
			gotobag.click();
			placeorder_bagpage.click();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Add New Address')]"));
			 js.executeScript("arguments[0].scrollIntoView();", element);
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addnewadress);
			 addaddressbtn.click();
			
	 }
}

