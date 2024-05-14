package com.fab_alley.generic;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author ANUP
 *
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


/**
 * 
 * @author ANUP KUMAR
 * @project FABALLEY_WEB
 * @DATE 18/09/2021
 * 
 *
 */


public class ScreenshotLib {
     public void getScreenshot(WebDriver driver ,String fileName){
    	 EventFiringWebDriver efw=new EventFiringWebDriver(driver);
    	 File srcFile = efw.getScreenshotAs(OutputType.FILE);
    	 File destFile=new File(".\\Screenshots\\"+fileName+".png");
    	 try{
    	 FileUtils.copyFile(srcFile, destFile);
    	 }
    	 catch (IOException e){
    		 e.printStackTrace();
    	 }
    	 
	}
}
