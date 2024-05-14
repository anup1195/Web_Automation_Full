/*
package android;

//import java.net.URL;s.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
      
public class AndroidApp {

  public static void main(String[] args) throws MalformedURLException, InterruptedException {
    
      DesiredCapabilities caps = new DesiredCapabilities();
      
      // Set your access credentials
      caps.setCapability("browserstack.user", "anupkumar23");
      caps.setCapability("browserstack.key", "sXjjDsB7BSX7v8xjDTDr");
      
      // Set URL of the application under test
      caps.setCapability("app", "bs://bd12b1eb81e2c9ebb7509ac855c522f7b11826d4");
      
      // Specify device and os_version for testing
      caps.setCapability("device", "
\bjpgfhp0987-09r783zxcbhklxcvxc  x   Pixel 3");
      caps.setCapability("os_version", "9.0");
        
      // Set other BrowserStack capabilities
      caps.setCapability("project", "First Java Project");
      caps.setCapability("build", "Java Android");
      caps.setCapability("name", "first_test");
        
      
      // Initialise the remote Webdriver using BrowserStack remote URL
      // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
            new URL("http://hub.browserstack.com/wd/hub"), caps);
        

      /* Write your Custom code here */
        
        
      // Invoke driver.quit() after the test is done to indicate that the test is completed.
 /*     driver.quit();
    
    }
      
  }

 <dependency>
<groupId>io.appium</groupId>
<artifactId>java-client</artifactId>
<version>7.0.0</version>
</dependency>   
 */
