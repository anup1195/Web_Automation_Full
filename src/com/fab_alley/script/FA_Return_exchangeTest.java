package com.fab_alley.script;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.fab_alley.generic.BaseLib;
import com.fab_alley.generic.ExcelUtils;
//import com.fab_alley.generic.Extentreport;
import com.fab_alley.pageobjects.FA_MyAccountPage;
import com.fab_alley.pageobjects.FA_ReturnPage;

public class FA_Return_exchangeTest extends BaseLib {

	@Test(priority=1,enabled=true)
		public void TCRE001() throws InvalidFormatException, InterruptedException{
		FA_ReturnPage RE=new FA_ReturnPage(driver);
		String username=ExcelUtils.readData("Login", 4, 1);
		String password=ExcelUtils.readData("Login", 4,  2);
		RE.TCRE001(username,password,driver, null);
//		Verificationpage ettp=new Verificationpage();
//		ettp.TCLP001(driver);
}
	@Test(priority=2,enabled=true)
	public void TCRE002() throws InvalidFormatException, InterruptedException, IOException{
	FA_ReturnPage RE=new FA_ReturnPage(driver);
	RE.TCRE002( driver);
//	Verificationpage ettp=new Verificationpage();
//	ettp.TCLP001(driver);
	
}
	
	@Test(priority=3,enabled=false)
	public void TCRE003() throws InvalidFormatException, InterruptedException{
	FA_ReturnPage RE=new FA_ReturnPage(driver);
	String username=ExcelUtils.readData("ReturnExchange",1,1);
	String password=ExcelUtils.readData("ReturnExchange", 1, 2);
	RE.TCRE001(username,password,driver, null);
//	Verificationpage ettp=new Verificationpage();
//	ettp.TCLP001(driver);
}
	}