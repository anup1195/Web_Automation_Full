package com.fab_alley.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FA_ReturnPage {

		
		@FindBy(xpath="//a[contains(text(),'Login')]")
		private WebElement loginlink;

		@FindBy(id="txtloginSignupUsername")
		private WebElement untxtbx;

		@FindBy(xpath="//a[@class='logincntn']")
		private WebElement contbtn;

		@FindBy(id="txtloginSignupPassword")
		private WebElement pwdtxtbx;

		@FindBy(xpath="//a[@class='logincntn']")
		private WebElement loginBtn;
		
		@FindBy(xpath="//i[@class='fa fa-caret-down']")
		private WebElement myaccountbtn;
		
		@FindBy(xpath="//a[contains(text(),'My Account')]")
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
		
		
		
		@FindBy(xpath="(//select[@class='seletedReasonList'])")
		private WebElement reasonlistbtn;
		
		@FindBy(xpath="//option[@id='res_5']")
		private WebElement reason1btn;
		
		@FindBy(xpath="//option[@id='res_27']")
		private WebElement exchangebtn;
		
		@FindBy(xpath="//li[@class='Exsizes']")
		private WebElement exchangesizebtn;
		
		@FindBy(xpath="//a[@id='confirmAfterSelectedAddress']")
		private WebElement confirmaddress;
		
		@FindBy(xpath="//a[@id='ContinueAfterSelectedItem']")
		private WebElement twoitemsubmit;
		
		@FindBy(xpath="//a[@id='btnConfirm']")
		private WebElement finalsubmit;
		
		@FindBy(xpath="//textarea[@id='armk_comments']")
		private WebElement addcommentbtn;
		
		@FindBy(xpath="//a[@id='submitret']")
		private WebElement returnsubmitbtn;
		
		//a[@id='submitret']
		
		@FindBy(xpath="(//input[@class='itemChecked confirmBfreAddrs'])")
		private WebElement selectanotheritembtn;
		
		@FindBy(xpath="//a[@href='/account/returnexchange?orderid=1206790&Detailid=2131086&return=2']")
		private WebElement anotheritembtn;
		
		@FindBy(linkText="Exchange")
		private WebElement anotheritems;
//		
//		@FindBy(xpath="//a[contains(text(),'My Orders')]")
//		private WebElement 998;
//		
//		
		
		 public FA_ReturnPage(WebDriver driver){
			 PageFactory.initElements(driver,this);
			 
		 }
		 
		 public void TCRE001(String username,String password,WebDriver driver, WebElement Element) throws InterruptedException
		 {
			 	loginlink.click();
			 	untxtbx.sendKeys(username);
			 	contbtn.click();
			 	pwdtxtbx.sendKeys(password);
			 	loginBtn.click();
			 	myaccountbtn.click();
			 	myordersbtn.click();
			 	
			 	//Specificorderdetailsbtn.click();
//			 	JavascriptExecutor js = (JavascriptExecutor) driver;
//			 	//WebElement Element1 = driver.findElement(By.linkText("Delivered on %"));
//			 	js.executeScript("	arguments[0].scrollIntoView();", driver.findElement(By.partialLinkText("Delivered")));
			 	
			 	orderdetailbtn.click();
			 	returntbn.click();
			 	Thread.sleep(2000);
			 	reasonlistbtn.click();
			 	reason1btn.click();
			 	addcommentbtn.sendKeys("Test");
			 	returnsubmitbtn.click();
//			 	anotheritembtn.click();
//			 	reasonlistbtn.click();
//			 	exchangebtn.click();
//			 	addcommentbtn.sendKeys("Test");
//			 	exchangesizebtn.click();
			 	twoitemsubmit.click();
			 	Thread.sleep(2000);
			 	confirmaddress.click();
			 	finalsubmit.click();
			 	driver.switchTo().alert().accept();
			 	
			 	
	}
		 public void TCRE002(WebDriver driver) throws InterruptedException
		 {
			 	

			 	myaccountbtn.click();
			 	myordersbtn.click();
			 	
			 	//Specificorderdetailsbtn.click();
//			 	JavascriptExecutor js = (JavascriptExecutor) driver;
//			 	//WebElement Element1 = driver.findElement(By.linkText("Delivered on %"));
//			 	js.executeScript("	arguments[0].scrollIntoView();", driver.findElement(By.partialLinkText("Delivered")));
			 	
			 	orderdetailbtn.click();
			 	Thread.sleep(500); 
			 	WebElement element = driver.findElement(By.xpath("(//a[@class='rtnexcngBtn'])[1]"));
			 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			 	Thread.sleep(500); 
//			 	WebElement element = driver.findElement(By.xpath("//a[@class='rtnexcngBtn'])[1]"));
//			 	Actions actions = new Actions(driver);
//			 	actions.moveToElement(element);
//			 	actions.perform();
			 	Exchangebtn.click();
			 	Thread.sleep(2000);
			 	reasonlistbtn.click();
			 	reason1btn.click();
			 	addcommentbtn.sendKeys("Test");
//			 	returnsubmitbtn.click();
//			 	anotheritembtn.click();
//			 	reasonlistbtn.click();
//			 	exchangebtn.click();
//			 	addcommentbtn.sendKeys("Test");
			 	exchangesizebtn.click();
			 	twoitemsubmit.click();
			 	Thread.sleep(2000);
			 	confirmaddress.click();
			 	finalsubmit.click();
			 	driver.switchTo().alert().accept();
			 	
			 	
	}
		 public void TCRE003(String username,String password,WebDriver driver, WebElement Element) throws InterruptedException
		 {
			 	loginlink.click();
			 	untxtbx.sendKeys(username);
			 	contbtn.click();
			 	pwdtxtbx.sendKeys(password);
			 	loginBtn.click();
			 	myaccountbtn.click();
			 	myordersbtn.click();
			 	
			 	//Specificorderdetailsbtn.click();
//			 	JavascriptExecutor js = (JavascriptExecutor) driver;
//			 	//WebElement Element1 = driver.findElement(By.linkText("Delivered on %"));
//			 	js.executeScript("	arguments[0].scrollIntoView();", driver.findElement(By.partialLinkText("Delivered")));
			 	
			 	orderdetailbtn.click();
			 	returntbn.click();
			 	Thread.sleep(2000);
			 	reasonlistbtn.click();
			 	reason1btn.click();
			 	addcommentbtn.sendKeys("Test");
			 	returnsubmitbtn.click();
			 	anotheritembtn.click();
			 	reasonlistbtn.click();
			 	exchangebtn.click();
			 	addcommentbtn.sendKeys("Test");
			 	exchangesizebtn.click();
			 	twoitemsubmit.click();
			 	Thread.sleep(2000);
			 	confirmaddress.click();
			 	finalsubmit.click();
			 	driver.switchTo().alert().accept();
			 	
			 	
	}
}
		 
