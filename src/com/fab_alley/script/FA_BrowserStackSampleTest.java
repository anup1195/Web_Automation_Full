package com.fab_alley.script;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class FA_BrowserStackSampleTest {
  public static final String USERNAME = "anupkumar23";
  public static final String AUTOMATE_KEY = "sXjjDsB7BSX7v8xjDTDr";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  public static void main(String[] args) throws Exception {
    DesiredCapabilities caps = new DesiredCapabilities();
    
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "80");
    
    caps.setCapability("name", "anupkumar23's First Test");
    
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("https://www.faballey.com/");
    WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
    element.click();
    WebElement element1=driver.findElement(By.xpath("//input[@id='txtloginSignupUsername']"));
    element1.sendKeys("anup@faballey.com");    
    WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
    element2.click();
    WebElement element3=driver.findElement(By.xpath("//input[@id='txtloginSignupPassword']"));
    element3.sendKeys("Anup123");
    WebElement element4= driver.findElement(By.xpath("//body/div[@id='wpapper']/div[1]/div[1]/a[1]"));
    element4.click();
    
    //element.sendKeys("BrowserStack");
   // element.submit();

    System.out.println(driver.getTitle());
    driver.quit();
  }
}