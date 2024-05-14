package com.fab_alley.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FA_MyAccountPage {

	

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
	
	@FindBy(xpath="//i[@class='fa fa-caret-down']")
	private WebElement myaccountbtn;
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	private WebElement myaccount;
	
	@FindBy(xpath="//a[contains(text(),'My Orders')]")
	private WebElement myordersbtn;
	
	@FindBy(xpath="//a[@id='_l_ot']")
	private WebElement logoutBtn;
	
	@FindBy(xpath="//i[@class='fal fa-bags-shopping']")
	private WebElement actmyorder;
	
	@FindBy(xpath="//i[@class='fal fa-heart']")
	private WebElement wishlistlink;
	
	@FindBy(xpath="//i[@class='fal fa-wallet']")
	private WebElement mycredit;
	
	@FindBy(xpath="//i[@class='fal fa-gift-card']")
	private WebElement myvouchers;
	
	@FindBy(xpath="//i[@class='fal fa-address-book']")
	private WebElement Myaddresses;
	
	@FindBy(xpath="//i[@class='fal fa-headset']")
	private WebElement ContactUs;
	
	
	@FindBy(xpath="//i[@class='fal fa-sign-out']")
	private WebElement Logout;
	
	
 public FA_MyAccountPage(WebDriver driver){
	 PageFactory.initElements(driver,this);
	 
 }
 
 public void TCMA001(String username,String password)
 {
 	loginlink.click();
 	unTxtBx.sendKeys(username);
 	contbtn.click();
 	pwdTxtBx.sendKeys(password);
 	loginBtn.click();
 	myaccountbtn.click();
 	myaccount.click();
 	actmyorder.click();
 	wishlistlink.click();
 	mycredit.click();
 	myvouchers.click();
 	Myaddresses.click();
 	ContactUs.click();
 	Logout.click();
 	
 	
 }
 
}
