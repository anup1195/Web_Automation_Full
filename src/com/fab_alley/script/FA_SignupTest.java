package com.fab_alley.script;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.fab_alley.generic.BaseLib;
import com.fab_alley.generic.ExcelUtils;
import com.fab_alley.pageobjects.FA_Signuppage;

/**
 * 
 * @author ANUP
 *
 */

public class FA_SignupTest extends BaseLib{
	
	@Test()
	public void validSignupTest() throws InvalidFormatException {
	FA_Signuppage sp=new FA_Signuppage(driver);
	String firstname=ExcelUtils.readData("Signup", 1, 1);
	String Mobilenumber=ExcelUtils.readData("Signup", 1, 2);
	String Emailid=ExcelUtils.readData("Signup", 1, 3);
	String Password=ExcelUtils.readData("Signup", 1, 4);
	sp.signup(firstname,Mobilenumber,Emailid ,Password);
	String actual =driver.getCurrentUrl();
	System.out.println(actual);
	String expected=ExcelUtils.readData("Signup", 1, 5);
	System.out.println(expected);
	Assert.assertEquals(actual, expected);
	}
	
}