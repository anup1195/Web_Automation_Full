package com.fab_alley.script;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.fab_alley.generic.BaseLib;

public class FA_MenuLinksTest extends BaseLib {
	//public class FA_MenuLinksTest{
	
	/**
	 * 
	 * @author ANUP
	 *
	 */

	@Test(priority = 1, enabled = true)
	public void NewIn() throws InterruptedException {

		// NewIn menu
		WebElement NewIn = driver.findElement(By.xpath("//a[contains(text(),'New In')]"));

		Actions NewInAction = new Actions(driver);

		NewInAction.moveToElement(NewIn).build().perform();

		// NewIn box
		WebElement NewIndriver = driver.findElement(By.xpath("//header[@class='headBox']//li[1]//div[1]//div[1]"));

		System.out.println("Total Links in NewIn Menu is " + NewIndriver.findElements(By.tagName("a")).size());

		for (int i = 0; i < NewIndriver.findElements(By.tagName("a")).size(); i++) {

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			NewIndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}
		// It will return the parent window name as a String
		String mainWindow = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
//				if (!childWindow.equals(mainWindow)) {
//					driver.switchTo().window(mainWindow);
//					System.out.println(driver.switchTo().window(mainWindow).getTitle());
//			}
			
		}}
		System.out.println("New in is clicked");
		//driver.quit();
		
		
	}
	

	@Test(priority = 2, enabled = false)
	public void TheEdit() throws InterruptedException {
		int TheEdit1;
		int TheEdit2;

		// TheEdit Menu
		WebElement TheEdit = driver.findElement(By.xpath("//a[contains(text(),'The Edit')]"));

		Actions TheEditaction = new Actions(driver);

		TheEditaction.moveToElement(TheEdit).build().perform();

		// TheEdit Menu 1st box
		WebElement TheEdit11 = driver.findElement(By.xpath("(//ul[@class='menu-vertical sub-menu'])[2]"));

		System.out.println(TheEdit11.findElements(By.tagName("a")).size());
		TheEdit1 = TheEdit11.findElements(By.tagName("a")).size();

		for (int i = 0; i < TheEdit11.findElements(By.tagName("a")).size(); i++) {

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			TheEdit11.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// TheEdit Menu 2nd box
		WebElement TheEdit21 = driver.findElement(By.xpath("(//ul[@class='menu-vertical sub-menu'])[3]"));

		System.out.println(TheEdit21.findElements(By.tagName("a")).size());
		TheEdit2 = TheEdit21.findElements(By.tagName("a")).size();

		for (int i = 0; i < TheEdit21.findElements(By.tagName("a")).size(); i++) {

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			TheEdit21.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);

		}

		System.out.println("Total links in TheEdit menu is " + (TheEdit1 + TheEdit2 + 1 + 1));

		// It will return the parent window name as a String
		String mainWindow = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}

		// This is to switch to the main window
		driver.switchTo().window(mainWindow);

		// TheEdit image 1
		WebElement Editimg1 = driver.findElement(By.xpath("//a[contains(text(),'The Edit')]"));

		Actions TheEditaction2 = new Actions(driver);

		TheEditaction2.moveToElement(Editimg1).build().perform();

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[4]/li[1]/a[1]"))
				.click();

		System.out.println(driver.getCurrentUrl());

		// TheEdit image2
		WebElement Editimg2 = driver.findElement(By.xpath("//a[contains(text(),'The Edit')]"));

		Actions TheEditaction3 = new Actions(driver);

		TheEditaction3.moveToElement(Editimg2).build().perform();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[4]/li[1]/a[2]/img[1]"))
				.click();

		System.out.println(driver.getCurrentUrl());
	}

	@Test(priority = 2, enabled = true)
	public void Clothing() throws InterruptedException {
		int clothing1, clothing2;
		
		System.out.println("clothing is seen");
		// Clothing menu
		WebElement TheClothing = driver.findElement(By.xpath("//a[@href='/clothing/cat?depth=1&label=Clothing']"));

		Actions TheClothingaction1 = new Actions(driver);

		TheClothingaction1.moveToElement(TheClothing).build().perform();

		// Clothing menu 1st Box
		WebElement ClothingBox1 = driver.findElement(By.xpath("//li[3]//div[1]//div[1]//ul[1]"));

		System.out.println(ClothingBox1.findElements(By.tagName("a")).size());

		clothing1 = ClothingBox1.findElements(By.tagName("a")).size();

		for (int i = 0; i < ClothingBox1.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			ClothingBox1.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// Clothing menu 2nd Box
		WebElement ClothingBox2 = driver.findElement(By.xpath("//li[3]//div[1]//div[1]//ul[2]"));

		System.out.println(ClothingBox2.findElements(By.tagName("a")).size());

		clothing2 = ClothingBox2.findElements(By.tagName("a")).size();

		for (int i = 0; i < ClothingBox2.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			ClothingBox2.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		System.out.println("Total links in Clothing menu is " + (clothing1 + clothing2));

		// It will return the parent window name as a String
		String mainWindowClothing = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> setclothing = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itrclothing = setclothing.iterator();
		while (itrclothing.hasNext()) {
			String childWindowclothing = itrclothing.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindowClothing.equals(childWindowclothing)) {
				driver.switchTo().window(childWindowclothing);
				System.out.println(driver.switchTo().window(childWindowclothing).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.quit();
	}

	@Test(priority = 4, enabled = true)
	public void Tops() throws InterruptedException {
		int Tops1, Tops2, Tops3, Tops4;
		// Tops menu

		WebElement Tops = driver.findElement(By.xpath("//a[@href='/clothing/women-tops/cat?depth=1&label=Tops']"));

		Actions TopsAction = new Actions(driver);

		TopsAction.moveToElement(Tops).build().perform();

		// Tops menu 1st Box
		WebElement TopBox1 = driver.findElement(By.xpath("//li[4]//div[1]//div[1]//ul[1]"));

		System.out.println(TopBox1.findElements(By.tagName("a")).size());

		Tops1 = TopBox1.findElements(By.tagName("a")).size();

		for (int i = 0; i < TopBox1.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			TopBox1.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// Tops menu 2nd Box
		WebElement TopBox2 = driver.findElement(By.xpath("//li[4]//div[1]//div[1]//ul[2]"));

		System.out.println(TopBox2.findElements(By.tagName("a")).size());

		Tops2 = TopBox2.findElements(By.tagName("a")).size();

		for (int i = 0; i < TopBox2.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			TopBox2.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// Tops menu 3rd Box
		WebElement TopBox3 = driver.findElement(By.xpath("//li[4]//div[1]//div[1]//ul[3]"));

		System.out.println(TopBox3.findElements(By.tagName("a")).size());

		Tops3 = TopBox3.findElements(By.tagName("a")).size();

		for (int i = 0; i < TopBox3.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			TopBox3.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// Tops menu 4th Box
		WebElement TopBox4 = driver.findElement(By.xpath("//li[4]//div[1]//div[1]//ul[4]"));

		System.out.println(TopBox4.findElements(By.tagName("a")).size());

		Tops4 = TopBox4.findElements(By.tagName("a")).size();

		for (int i = 0; i < TopBox4.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			TopBox4.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}
//						
		System.out.println("Total links in Tops menu is " + (Tops1 + Tops2 + Tops3 + Tops4));

		// It will return the parent window name as a String
		String mainWindowtop = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> settop = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itrtop = settop.iterator();
		while (itrtop.hasNext()) {
			String childWindowtop = itrtop.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindowtop.equals(childWindowtop)) {
				driver.switchTo().window(childWindowtop);
				System.out.println(driver.switchTo().window(childWindowtop).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.quit();
	}

	@Test(priority = 5, enabled = true)
	public void DressesMenu() throws InterruptedException {
		int dresses1, dresses2, dresses3, dresses4;

		// Dresses menu
		WebElement Dresses = driver
				.findElement(By.xpath("//a[@href='/clothing/women-dresses/cat?depth=1&label=Dresses']"));

		Actions DressesAction = new Actions(driver);

		DressesAction.moveToElement(Dresses).build().perform();
//						

		// Dresses menu 1st Box
		WebElement DressesBox1 = driver.findElement(By.xpath("//li[5]//div[1]//div[1]//ul[1]"));

		System.out.println(DressesBox1.findElements(By.tagName("a")).size());

		dresses1 = DressesBox1.findElements(By.tagName("a")).size();

		for (int i = 0; i < DressesBox1.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			DressesBox1.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}
//						
		// Dresses menu 2nd Box
		WebElement DressesBox2 = driver.findElement(By.xpath("//li[5]//div[1]//div[1]//ul[2]"));

		System.out.println(DressesBox2.findElements(By.tagName("a")).size());

		dresses2 = DressesBox2.findElements(By.tagName("a")).size();

		for (int i = 0; i < DressesBox2.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			DressesBox2.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// Dresses menu 3rd Box
		WebElement DressesBox3 = driver.findElement(By.xpath("//li[5]//div[1]//div[1]//ul[3]"));

		System.out.println(DressesBox3.findElements(By.tagName("a")).size());

		dresses3 = DressesBox3.findElements(By.tagName("a")).size();

		for (int i = 0; i < DressesBox3.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			DressesBox3.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}
//						
		// Dresses menu 4th Box
		WebElement DressesBox4 = driver.findElement(By.xpath("//li[5]//div[1]//div[1]//ul[4]"));

		System.out.println(DressesBox4.findElements(By.tagName("a")).size());

		dresses4 = DressesBox4.findElements(By.tagName("a")).size();

		for (int i = 0; i < DressesBox4.findElements(By.tagName("a")).size(); i++)

		{
//							
			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			DressesBox4.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		System.out.println("The Total links in dress menu is" + (dresses1 + dresses2 + dresses3 + dresses4));

		// It will return the parent window name as a String
		String mainWindowdresses = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> setdresses = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itrdresses = setdresses.iterator();
		while (itrdresses.hasNext()) {
			String childWindowdresses = itrdresses.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindowdresses.equals(childWindowdresses)) {
				driver.switchTo().window(childWindowdresses);
				System.out.println(driver.switchTo().window(childWindowdresses).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.quit();
	}

	@Test(priority = 6, enabled = false)
	public void curvemenu() throws InterruptedException {

		int curvebox;
		// Curve menu
		WebElement Curve = driver.findElement(By.xpath("//a[@href='/curve/cat?depth=1&label=Curve']"));

		Actions CurveAction = new Actions(driver);

		CurveAction.moveToElement(Curve).build().perform();

		// curve menu 1st Box
		WebElement CurveBox1 = driver.findElement(By.xpath("//li[6]//div[1]//div[1]//ul[1]"));

		System.out.println(CurveBox1.findElements(By.tagName("a")).size());

		curvebox = CurveBox1.findElements(By.tagName("a")).size();

		System.out.println("Total links in curve in " + (curvebox + 1 + 1));

		for (int i = 0; i < CurveBox1.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			CurveBox1.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		String mainWindowCurve = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> setcurve = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itrcurve = setcurve.iterator();
		while (itrcurve.hasNext()) {
			String childWindowcurve = itrcurve.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindowCurve.equals(childWindowcurve)) {
				driver.switchTo().window(childWindowcurve);
				System.out.println(driver.switchTo().window(childWindowcurve).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}

		driver.switchTo().window(mainWindowCurve);

		// curve menu 2nd Box

		WebElement Curve1 = driver.findElement(By.xpath("//a[@href='/curve/cat?depth=1&label=Curve']"));

		Actions CurveAction1 = new Actions(driver);

		CurveAction1.moveToElement(Curve1).build().perform();

		driver.findElement(By.xpath("//div[@class='level-2']//ul[2]//li[1]//a[1]//img[1]")).click();

		// Curve menu 3rd Box
		WebElement Curve2 = driver.findElement(By.xpath("//a[@href='/curve/cat?depth=1&label=Curve']"));

		Actions CurveAction2 = new Actions(driver);

		CurveAction2.moveToElement(Curve2).build().perform();

		driver.findElement(By.xpath("//div[@class='level-2']//ul[3]//li[1]//a[1]//img[1]")).click();
		driver.quit();
	}

	@Test(priority = 7, enabled = false)
	public void wintermenu() throws InterruptedException {

		int winterbox;
		// winter menu
		WebElement Winterwear = driver.findElement(By.xpath("//a[contains(text(),'Winter wear')]"));

		Actions WinterwearAction = new Actions(driver);

		WinterwearAction.moveToElement(Winterwear).build().perform();

		// Winter menu 1st Box
		WebElement Winterwear1 = driver.findElement(By.xpath("//li[7]//div[1]//div[1]//ul[1]"));

		System.out.println(Winterwear1.findElements(By.tagName("a")).size());

		winterbox = Winterwear1.findElements(By.tagName("a")).size();

		System.out.println("Total Links in winter is" + (winterbox));

		for (int i = 0; i < Winterwear1.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Winterwear1.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// It will return the parent window name as a String
		String mainWindowWinterwear = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> setwinterwear = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itrwinterwear = setwinterwear.iterator();
		while (itrwinterwear.hasNext()) {
			String childWindowwinterwear = itrwinterwear.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindowWinterwear.equals(childWindowwinterwear)) {
				driver.switchTo().window(childWindowwinterwear);
				System.out.println(driver.switchTo().window(childWindowwinterwear).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.quit();
	}

	@Test(priority = 8, enabled = false)
	public void Accessories() throws InterruptedException {

		int Accessories11;
		// Accessories menu
		WebElement Accessories = driver.findElement(By.xpath("(//a[@title='Accessories'])[2]"));

		Actions AccessoriesAction = new Actions(driver);

		AccessoriesAction.moveToElement(Accessories).build().perform();

		// Accessories menu 1st Box

		WebElement Accessories1 = driver.findElement(By.xpath("//li[8]//div[1]//div[1]//ul[1]"));

		System.out.println(Accessories1.findElements(By.tagName("a")).size());

		Accessories11 = Accessories1.findElements(By.tagName("a")).size();

		System.out.println("Total links in Accessories menu is" + (Accessories11 + 3));

		for (int i = 0; i < Accessories1.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Accessories1.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// It will return the parent window name as a String
		String mainWindowAccessories = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> setaccessories = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itraccessories = setaccessories.iterator();
		while (itraccessories.hasNext()) {
			String childWindowaccessories = itraccessories.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindowAccessories.equals(childWindowaccessories)) {
				driver.switchTo().window(childWindowaccessories);
				System.out.println(driver.switchTo().window(childWindowaccessories).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}

		// Accessories menu 2nd Box

		driver.switchTo().window(mainWindowAccessories);

		WebElement Accessories2 = driver.findElement(By.xpath("(//a[@title='Accessories'])[2]"));

		Actions AccessoriesAction2 = new Actions(driver);

		AccessoriesAction2.moveToElement(Accessories2).build().perform();

		driver.findElement(By.xpath("//div[@class='level-2 col-4']//ul[2]//li[1]//a[1]//img[1]")).click();

		driver.switchTo().window(mainWindowAccessories);

		// Accessories menu 3rd box

		WebElement Accessories3 = driver.findElement(By.xpath("(//a[@title='Accessories'])[2]"));

		Actions AccessoriesAction3 = new Actions(driver);

		AccessoriesAction3.moveToElement(Accessories3).build().perform();

		driver.findElement(By.xpath("//div[@class='level-2 col-4']//ul[3]//li[1]//a[1]//img[1]")).click();

		driver.switchTo().window(mainWindowAccessories);

		// Accessories menu 4th box

		WebElement Accessories4 = driver.findElement(By.xpath("(//a[@title='Accessories'])[2]"));

		Actions AccessoriesAction4 = new Actions(driver);

		AccessoriesAction4.moveToElement(Accessories4).build().perform();

		driver.findElement(By.xpath("//li[8]//div[1]//div[1]//ul[4]//li[1]//a[1]//img[1]")).click();
		driver.quit();
	}

	@Test(priority = 9, enabled = false)
	public void LookBook() throws InterruptedException {

		int Lookbook11;

		// Accessories menu
		WebElement LookBook = driver.findElement(By.xpath("//a[contains(text(),'Lookbooks')]"));

		Actions LookBookAction = new Actions(driver);

		LookBookAction.moveToElement(LookBook).build().perform();

		// LookBook menu 1st Box

		WebElement LookBook1 = driver
				.findElement(By.xpath("//li[@class='level-1-tab has-submenu']//ul[@class='menu-vertical sub-menu']"));

		System.out.println(LookBook1.findElements(By.tagName("a")).size());

		Lookbook11 = LookBook1.findElements(By.tagName("a")).size();

		System.out.println("total menu in Lookbook is" + (Lookbook11));

		for (int i = 0; i < LookBook1.findElements(By.tagName("a")).size(); i++)

		{

			String clicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			LookBook1.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
			Thread.sleep(1000);
		}

		// It will return the parent window name as a String
		String mainWindowLookBook = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> setlookbook = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itrlookbook = setlookbook.iterator();
		while (itrlookbook.hasNext()) {
			String childWindowlookbook = itrlookbook.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindowLookBook.equals(childWindowlookbook)) {
				driver.switchTo().window(childWindowlookbook);
				System.out.println(driver.switchTo().window(childWindowlookbook).getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
				driver.quit();

			}
		}
	}
}
