package com.fab_alley.script;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import com.fab_alley.generic.BaseLib;
import com.fab_alley.generic.ExcelUtils;
import com.fab_alley.pageobjects.FA_MyAccountPage;
import com.fab_alley.pageobjects.FA_Verificationpage;

public class FA_MyAccountTest extends BaseLib {
	
	@Test(priority=1,enabled=true)
		public void TCMA001() throws InvalidFormatException{
		FA_MyAccountPage MAP=new FA_MyAccountPage(driver);
		String username=ExcelUtils.readData("MyAccount",1,1);
		String password=ExcelUtils.readData("MyAccount", 1, 2);
		MAP.TCMA001(username,password);
//		Verificationpage ettp=new Verificationpage();
//		ettp.TCLP001(driver);
}
	}

