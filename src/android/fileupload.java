package android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP\\Downloads\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://staging.faballey.com");

}
}