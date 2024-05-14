package com.fab_alley.generic;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReports {
	@Test

	public static void FA_ExtentReport  () throws IOException, InvalidFormatException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\test-output\\FinalReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("FabAlley Automation Report");
		extent.attachReporter(spark);
		
		ExtentTest test=extent.createTest(ExcelUtils.readData("Login", 1, 0));
		test.pass("Browser is opened");
		test.info("URL is redirected");
		test.info("test is passed");
		
		ExtentTest test1=extent.createTest(ExcelUtils.readData("Login", 2, 0));
		test1.pass("another is opened");
		test1.info("URL is redirected");
		test1.fail("test is fail");
		
		extent.flush();
	}
}