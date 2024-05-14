package com.faballey.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.fab_alley.generic.BaseLib;
import com.fab_alley.generic.BaseLibLambdaTest;
import com.fab_alley.generic.VConstants;

//public class FA_BrokenLinksTest extends BaseLibLambdaTest {
	public class FA_BrokenLinksTest{
//	private static WebDriver driver = null;
//	  public String username = "anupfaballey";
//	   public String accesskey = "NA4LHmNHOsSUIkK4O96JbuQ8IX5lzq7AOSYoEC5fHFRj7FdPAu";
//	   public static RemoteWebDriver driver1 = null;
//	   public String gridURL = "@hub.lambdatest.com/wd/hub";

	/**
	 * 
	 * @author ANUP
	 *
	 */

	@Test()
	public  void brokenlinks() throws FileNotFoundException {
//	    DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("version", "70.0");
//        capabilities.setCapability("platform", "win10"); 
//        capabilities.setCapability("build", "Faballey");
//        capabilities.setCapability("name", "LambdaTestJavaSample");
//        try {
//            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
//        } catch (MalformedURLException e) {
//            System.out.println("Invalid grid URL");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
            
  //      }
		String homePage = "https://www.faballey.com";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		//System.setProperty("webdriver.chrome.driver",
			//	VConstants.webdriver);
		System.setProperty("webdriver.chrome.driver",".\\ExFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
//		String homePage = VConstants.liveUrl;
//		String url = "";
//		HttpURLConnection huc = null;
//		int respCode = 200;

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

//			System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println("URL is not available");
				continue;
			}

			if (!url.startsWith(homePage)) {
				//System.out.println("URL belongs to another domain");
				continue;
			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} 
//				else {
//					System.out.println(url + " is a valid link");
//				}

			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		//driver.quit();
	}
}
