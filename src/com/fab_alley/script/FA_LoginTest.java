package com.fab_alley.script;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import com.fab_alley.generic.BaseLib;
import com.fab_alley.generic.BaseLibLambdaTest;
import com.fab_alley.generic.VConstants;
import com.fab_alley.generic.ExcelUtils;
import com.fab_alley.generic.ExtentsReports;
import com.fab_alley.pageobjects.FA_Loginpage;
import com.fab_alley.verification.FA_Login_Verificationpage;


//public class FA_LoginTest extends BaseLibLambdaTest{
public class FA_LoginTest extends BaseLib{

	@Test(priority=1,enabled=false)
	public void FA_TCLP001() throws InvalidFormatException, IOException{
		FA_Loginpage lp=new FA_Loginpage(driver);
		lp.FA_TCLP001();
//		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
//		ettp.FA_TCLP001(driver);
//		ExtentsReports ER=new ExtentsReports();
//		ExtentsReports.FA_ExtentReport();
	}

	@Test (priority=2,enabled=false)
	public void FA_TCLP002() throws InvalidFormatException{
		FA_Loginpage lp=new FA_Loginpage(driver);
//	String username=ExcelUtils.readData("Login",2,1);
	//	lp.FA_TCLP002(username);
		lp.FA_TCLP002(VConstants.FA_TCLP002_username);
//		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
//		ettp.FA_TCLP002(driver);			
	}

	@Test(priority=3,enabled=false)
	public void FA_TCLP003() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
//		String username=ExcelUtils.readData("Login", 3, 1);
//		String password=ExcelUtils.readData("Login", 3, 2);
		lp.FA_TCLP003(VConstants.FA_TCLP003_username, VConstants.FA_TCLP003_password);
//		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
//		ettp.FA_TCLP003(driver);	

	}

	@Test(priority=4,enabled=true)
	public void FA_TCLP004() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
//		String username=ExcelUtils.readData("Login", 4, 1);
//		String password=ExcelUtils.readData("Login", 4, 2);
		lp.FA_TCLP004(VConstants.usermail, VConstants.password);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP004(driver);	

	}

	@Test(priority=5,enabled=false)
	public void FA_TCLP005() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 5, 1);
		String password=ExcelUtils.readData("Login", 5, 2);
		lp.FA_TCLP005(username , password);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP004(driver);	

	}
	@Test(priority=6,enabled=false)
	public void FA_TCLP006() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 6, 1);
		lp.FA_TCLP006(username);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP006(driver);	

	}
	@Test(priority=7,enabled=false)
	public void FA_TCLP007() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 7, 1);
		String password=ExcelUtils.readData("Login", 7, 2);
		lp.FA_TCLP007(username,password);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP007(driver);	

	}
	@Test(priority=8,enabled=false)
	public void FA_TCLP008() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 8, 1);
		String newusername=ExcelUtils.readData("Login", 8, 4);
		String password=ExcelUtils.readData("Login", 8, 2);
		lp.FA_TCLP008(username, newusername, password);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP008(driver);	

	}

	@Test(priority=9,enabled=false)
	public void FA_TCLP009() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 9, 1);
		lp.FA_TCLP009(username);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP009(driver);	

	}

	@Test(priority=10,enabled=false)
	public void FA_TCLP0010() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 10, 1);
		lp.FA_TCLP0010(username);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP0010(driver);
	}

	@Test(priority=11,enabled=false)
	public void FA_TCLP0011() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 11, 1);
		String password=ExcelUtils.readData("Login", 11, 2);
		lp.FA_TCLP0011(username,password);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP0011(driver);	

	}
	
	@Test(priority=11,enabled=false)
	public void FA_TCLP0012() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 11, 1);
		String password=ExcelUtils.readData("Login", 11, 2);
		lp.FA_TCLP0011(username,password);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP0011(driver);	

	}
	
	@Test(priority=11,enabled=false)
	public void FA_TCLP0013() throws InvalidFormatException {
		FA_Loginpage lp=new FA_Loginpage(driver);
		String username=ExcelUtils.readData("Login", 11, 1);
		String password=ExcelUtils.readData("Login", 11, 2);
		lp.FA_TCLP0011(username,password);
		FA_Login_Verificationpage ettp=new FA_Login_Verificationpage();
		ettp.FA_TCLP0011(driver);	

	}

}
