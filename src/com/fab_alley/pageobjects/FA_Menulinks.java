package com.fab_alley.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FA_Menulinks {
	
	@FindBy(xpath="//a[contains(text(),'New In')]")
	private WebElement NewIn;
	
	@FindBy(xpath="//header[@class='headBox']//li[1]//div[1]//div[1]")
	private WebElement NewIn_Links;

	@FindBy(xpath="//a[contains(text(),'The Edit')]")
	private WebElement TheEdit;
	
	@FindBy(xpath="//li[2]//div[1]//div[1]//ul[1]")
	private WebElement TheEdit_Links1;
	
	@FindBy(xpath="//li[2]//div[1]//div[1]//ul[2]")
	private WebElement TheEdit_Links2;
	
	@FindBy(xpath="//a[@href='/clothing/cat?depth=1&label=Clothing']")
	private WebElement Clothing;
	
	@FindBy(xpath="//li[3]//div[1]//div[1]//ul[1]")
	private WebElement Clothing_Links1;
	
	@FindBy(xpath="//li[3]//div[1]//div[1]//ul[2]")
	private WebElement Clothing_Links2;
	
	@FindBy(xpath="//a[@href='/clothing/women-tops/cat?depth=1&label=Tops']")
	private WebElement Tops;
	
	@FindBy(xpath="//li[4]//div[1]//div[1]//ul[1]")
	private WebElement Tops_Links1;
	
	@FindBy(xpath="//li[4]//div[1]//div[1]//ul[2]")
	private WebElement Tops_Links2;
	
	@FindBy(xpath="//li[4]//div[1]//div[1]//ul[3]")
	private WebElement Tops_Links3;
	
	@FindBy(xpath="//li[4]//div[1]//div[1]//ul[4]")
	private WebElement Tops_Links4;
	
	@FindBy(xpath="//a[@href='/clothing/women-dresses/cat?depth=1&label=Dresses']")
	private WebElement Dresses;
	
	@FindBy(xpath="//li[5]//div[1]//div[1]//ul[1]")
	private WebElement Dresses_Links1;
	
	@FindBy(xpath="//li[5]//div[1]//div[1]//ul[2]")
	private WebElement Dresses_Links2;
	
	@FindBy(xpath="//li[5]//div[1]//div[1]//ul[3]")
	private WebElement Dresses_Links3;
	
	@FindBy(xpath="//li[5]//div[1]//div[1]//ul[4]")
	private WebElement Dresses_Links4;
	
	@FindBy(xpath="//a[@href='/curve/cat?depth=1&label=Curve']")
	private WebElement Curve;
	
	@FindBy(xpath="//li[6]//div[1]//div[1]//ul[1]")
	private WebElement Curve_Links1;
	
	@FindBy(xpath="//li[6]//div[1]//div[1]//ul[2]")
	private WebElement Curve_Links2;
	
	@FindBy(xpath="//li[6]//div[1]//div[1]//ul[3]")
	private WebElement Curve_Links3;
	
	@FindBy(xpath="/clothing/women-winter-wear/cat?depth=1&label=Winter wear")
	private WebElement WinterWear;
	
	@FindBy(xpath="//li[7]//div[1]//div[1]//ul[1]")
	private WebElement WinterWear_Links1;
	
	@FindBy(xpath="/accessories/cat?depth=1&label=Accessories")
	private WebElement Accessories;
	
	@FindBy(xpath="//li[8]//div[1]//div[1]//ul[1]")
	private WebElement Accessories_Links1;
	
	@FindBy(xpath="//li[8]//div[1]//div[1]//ul[2]")
	private WebElement Accessories_Links2;
	
	@FindBy(xpath="//li[8]//div[1]//div[1]//ul[3]")
	private WebElement Accessories_Links3;
	
	@FindBy(xpath="//li[8]//div[1]//div[1]//ul[4]")
	private WebElement Accessories_Links4;

	@FindBy(xpath="javascript:void(0)?depth=1&label=Lookbooks")
	private WebElement LookBook;
		
	@FindBy(xpath="//li[@class='level-1-tab has-submenu']//ul[@class='menu-vertical sub-menu']//li[1]")
	private WebElement LookBook_Links;
		
	@FindBy(xpath="/sale/end-of-season-sale/cat?depth=1&label=SALE")
	private WebElement Sale;
	
	@FindBy(xpath="/valentines-day-women-clothing/cat?depth=1&label=Valentine's Collection")
	private WebElement Valentine;
	
	
	public FA_Menulinks(WebDriver driver){
		 PageFactory.initElements(driver,this);
		 
	 }
	
	 public void TCLP001() throws InterruptedException {
		 WebElement ele = NewIn;
			
			Actions action = new Actions(null, null);
			
			action.moveToElement(ele).build().perform();
			WebElement columndriver=NewIn_Links;
			System.out.println(columndriver.findElements(By.tagName("a")).size());
			
			
			
			for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
			{
				
				String clicklinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklinkTab);
				Thread.sleep(5000);
			}
				
			
				
	

		 
		 
	 }
	
	

}

		



