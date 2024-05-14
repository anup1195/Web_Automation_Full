//package com.fab_alley.generic;
//
//import java.io.IOException;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.fab_alley.pageobjects.FA_Verificationpage;
//
//public class Extentreport extends FA_Verificationpage  {
//
//	public static void newreport  () throws IOException, InvalidFormatException {
//		
//		
//			// Define the extent report path where you want to save the report
//		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(".\\test-output\\extentreport.html");
//		 
//		// create ExtentReports and attach reporter(s)
//	        ExtentReports extent = new ExtentReports();
//	        extent.attachReporter(htmlReporter);
//
//	        // creates a toggle for the given test, adds all log events under it    
//	        ExtentTest test = extent.createTest("Return Exchange", "Showing return exchange");
//
//	        // log(Status, details)
//	        String emailto=ExcelUtils.readData("Mail",1,3);
//	        test.log(Status.INFO, "Process");
//	        
//	        test.log(Status.PASS, "Return Exchange is verified");
//	        
//	        test.log(Status.FAIL, "Return Exchange is having some problems");
//
//	        // info(details)
//	        test.info("This step shows usage of info(details)");
//	        
////	        // log with snapshot
////	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(".\\\\test-output\\\\result.jpeg").build());
////	        
////	        // test with snapshot
////	        test.addScreenCaptureFromPath(".\\test-output\\result.jpeg");
////	        
//	        // calling flush writes everything to the log file
//	        extent.flush();
//	    }
//}
