package com.fab_alley.script;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import com.fab_alley.generic.BaseLib;
import com.fab_alley.generic.BaseLibLambdaTest;
import com.fab_alley.generic.ExcelUtils;
import com.fab_alley.generic.VConstants;
import com.fab_alley.generic.WaitStatementLib;
import com.fab_alley.pageobjects.FA_Regressionpage;
import com.fab_alley.pageobjects.FA_RegressionVerificationPage;
import com.fab_alley.pageobjects.FA_Verificationpage;

//public class FA_RegressionTest extends BaseLib{
	public class FA_RegressionTest extends BaseLibLambdaTest{
	
	@Test(priority=1,enabled=true)
	
		public void ExistingUserCOD() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
//		String username=ExcelUtils.readData("ExistingUser", 1, 1);
//		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.ExistingUserCOD(VConstants.usermail, VConstants.password, driver);
		//EU.ExistingUserCOD(username,password, driver);
		//WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=2,enabled=false)
		public void ExistingUserPrepaid() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.ExistingUserPrepaid(username, password, driver);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=3,enabled=false)
		public void ExistingUserPaypal() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.ExistingUserPaypal(username, password);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	
	}
	@Test(priority=4,enabled=false)
		public void NewUserCOD() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.NewUserCOD(username, password);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=5,enabled=false)
		public void NewUserPrepaid() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.NewUserPrepaid(username, password);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=6,enabled=false)
		public void NewUserUserPaypal() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.NewUserUserPaypal(username, password);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=7,enabled=false)
		public void GuestCheckoutCOD() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.GuestCheckoutCOD(username, password);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=8,enabled=false)
		public void GuestCheckoutPrepaid() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.GuestCheckoutPrepaid(username, password);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=9,enabled=false)
		public void GuestUserPaypal() throws InvalidFormatException, InterruptedException {
		FA_Regressionpage EU=new FA_Regressionpage(driver);
		String username=ExcelUtils.readData("ExistingUser", 1, 1);
		String password=ExcelUtils.readData("ExistingUser", 1, 2);
		EU.GuestUserPaypal(username, password);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);	
		FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
		rvp.ExistingUserCOD(driver);	
	}
	
	@Test(priority=9,enabled=false)
	public void AddIndianAdress() throws InvalidFormatException, InterruptedException {
	FA_Regressionpage EU=new FA_Regressionpage(driver);
	String username=ExcelUtils.readData("ExistingUser", 1, 1);
	String password=ExcelUtils.readData("ExistingUser", 1, 2);
	EU.AddIndianAdress(username, password,driver);
	WaitStatementLib.implicitWaitForSeconds(driver, 10);	
//	FA_RegressionVerificationPage rvp=new FA_RegressionVerificationPage();
//	rvp.ExistingUserCOD(driver);	
}
}
	