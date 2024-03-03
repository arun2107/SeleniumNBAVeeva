package com.veeva.nba.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.veeva.nba.utils.Base;

public class WarriorsNewsPage {
	
	 public static List<WebElement> videosFoundNow;
	 
	 
	 
	 Base obj = new Base();
	 
	 List<WebElement> vidoesFoundNow = obj.getElementsByXpath("//h3[text()='VIDEOS']/parent::div/following-sibling::div/div/ul/li");
	 
	 List<WebElement> vidoesFoundTotal;

	 
	
	public WarriorsNewsPage checkVidoesFoundNow()
	{
		
		System.out.println("The size of the vidoes found now is" + vidoesFoundNow.size());
		
		return this;
	}
	
	public WarriorsNewsPage checkTotalVidoesFound()

	{
		  videosFoundNow = obj.driver.findElements(By.xpath("//h3[text()='VIDEOS']/parent::div/following-sibling::div/div/ul/li"));
		
          while(vidoesFoundNow.get(vidoesFoundNow.size()-1).isDisplayed())
          {
    		  videosFoundNow = obj.driver.findElements(By.xpath("//h3[text()='VIDEOS']/parent::div/following-sibling::div/div/ul/li"));

    		  vidoesFoundTotal.addAll(videosFoundNow);
    		  
          }
          
  		System.out.println("The size of the total vidoes found is" + vidoesFoundTotal.size());

		  
		  return this;
		  
	} 

}
