package com.fab_alley.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author ANUP
 *
 */

public class FA_Signuppage {
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	private WebElement Signuplink;
	
	@FindBy(id="cust-FirstName")
	private WebElement frstname;
	
	@FindBy(id="cust-mobileno")
	private WebElement mobileno;
	
	@FindBy(id="cust-email")
	private WebElement emailid;
	
	@FindBy(id="cust-pass")
	private WebElement pswd;
	
	@FindBy(id="btn-register")
	private WebElement rgstrbtn;
	
	public  FA_Signuppage(WebDriver driver) {
	   PageFactory.initElements(driver,this);
	}
	public void signup(String firstname,String Mobilenumber, String Emailid,String Password)
	{
		Signuplink.click();
		frstname.sendKeys(firstname);
		//mobileno.sendKeys("9716830901");
		mobileno.sendKeys(Mobilenumber);
		emailid.sendKeys(Emailid);
		pswd.sendKeys(Password);
		rgstrbtn.click();
	}

}
