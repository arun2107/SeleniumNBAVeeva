package com.veeva.nba.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.veeva.nba.utils.Base;
import com.veeva.nba.utils.ExcelDriver;

public class WarriorsHomePage {
	
	 Base obj = new Base();
	    
	    ExcelDriver exl = new ExcelDriver();
	    
	    WebElement footerElement;
	    
	    List<WebElement> hyperLinks;
	    
		List<String> hrefduplicateList = new ArrayList<>();

		Map<String,Integer> hrefMap = new HashMap<>();
		
		WebElement close = obj.getElementByXpath("//div[@class='p-2 absolute right-3 hover:cursor-pointer']");
    	WebElement accept = obj.getElementByXpath("//button[text()='I Accept']");
	    WebElement newsFeatures = obj.getRelativeElementbelow("//a[@title='News & Features']","//span[text()='Shop']/parent::a[@rel='noreferrer']/../../../following-sibling::nav[@aria-label='header-secondary-menu']/ul/li/a");
    	

	    public WarriorsHomePage launchWarriors(String browser)
	    {
	    	obj.launchBrowser("https://www.nba.com/warriors",browser);
			return this;
	    }
	    
	    public WarriorsHomePage acceptCaptcha()
	    {
	    	close.click();
	    	accept.click();
	    	return this;
	    }
	    
	    public WarriorsHomePage hoverToMenu()
	    {
	    	obj.moveToElement("//span[text()='Shop']/parent::a[@rel='noreferrer']/../../../following-sibling::nav[@aria-label='header-secondary-menu']/ul/li/a");
			return this;
	    }
	    
	    public WarriorsHomePage clickOnNews()
	    {
	    	newsFeatures.click();
	    	return this;
	    }
	    
	    
}
