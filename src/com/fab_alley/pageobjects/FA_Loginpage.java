package com.fab_alley.pageobjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class FA_Loginpage {

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

	@FindBy(className="errormsg")
	private WebElement invalidLoginMsg;

	@FindBy(xpath="(//a[contains(text(),'change')])[2]")
	private WebElement changeEmail;

	@FindBy(id="passError")
	private WebElement pswderr;

	@FindBy(xpath="//span[contains(text(),'Please enter your registered email ID')]")
	private WebElement invalidemailmsg;
	
	@FindBy(xpath="//div[@id='currencyBox']")
	private WebElement currencydropdown;
	
	@FindBy(xpath="//li[@data-value='USD']")
	private WebElement usdcurrency;
	
	@FindBy(xpath="//li[@data-value='CAD']")
	private WebElement cadcurrency;
	
	@FindBy(xpath="//li[@data-value='GBP']")
	private WebElement gbpcurrency;
	
	@FindBy(xpath="//li[@data-value='AUD']")
	private WebElement audcurrency;
	
	@FindBy(xpath="//li[@data-value='SGD']")
	private WebElement sgdcurrency;
	
	@FindBy(xpath="//li[@data-value='EUR']")
	private WebElement eurcurrency;
	
//	@FindBy(xpath="//li[@data-value='USD']")
//	private WebElement usdcurrency;


	public FA_Loginpage(WebDriver driver){
		PageFactory.initElements(driver,this);

	}

	public void FA_TCLP001()
	{
		loginlink.click();
		contbtn.click();

	}

	public void FA_TCLP002(String username)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
		loginBtn.click();
	}

	public void FA_TCLP003(String username, String password)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
	}

	public void FA_TCLP004(String username, String password)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
	}

	public void FA_TCLP005(String username ,String password)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
	}

	public void FA_TCLP006(String username)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
		//pwdTxtBx.sendKeys(password);
		loginBtn.click();
	}
	public void FA_TCLP007(String username,String password)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
	}
	public void FA_TCLP008(String username,String password,String newusername)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
		changeEmail.click();
		unTxtBx.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		unTxtBx.sendKeys(newusername);
		contbtn.click();
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
		//	loginBtn.sendKeys(Keys.ENTER);
	}

	public void FA_TCLP009(String username)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
//		pwdTxtBx.sendKeys(password);
//		loginBtn.click();
	}
	public void FA_TCLP0010(String username)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
//		changeEmail.click();
//		unTxtBx.sendKeys(Keys.chord(Keys.CONTROL+"a"));
//		unTxtBx.sendKeys(newusername);
//		pwdTxtBx.sendKeys(password);
//		pwdTxtBx.sendKeys(Keys.ENTER);
		//	loginBtn.sendKeys(Keys.ENTER);
	}
	public void FA_TCLP0011(String username,String password)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
//		pwdTxtBx.sendKeys(password);
//		loginBtn.click();
	}
	
	public void FA_TCLP0012(String username,String password)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
	}
	
	public void FA_TCLP0013(String username,String password)
	{
		loginlink.click();
		unTxtBx.sendKeys(username);
		contbtn.click();
	}
	public void verifyInvalidLoginMsg(){
		String exp="Username or Password is invalid. Please try again.";
		String act= invalidLoginMsg.getText();
		Assert.assertEquals(act,exp);
		Reporter.log("invalid login msg is verified",true);


	}
}
