package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	By chooseLang =By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[3]/a/i");
	By lang =By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[3]/ul/li[1]/a");
	//WebElement chooseLang = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[3]/a/i"));
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void chooselang()
	{
		try{
			/*
			 * if(chooseLang.isDisplayed()) {
			 * System.out.println("choose lang is displayed"); } else {
			 * System.out.println("choose lang not displayed"); } if(chooseLang.isEnabled())
			 * { System.out.println("choose lan is enabled"); } else {
			 * System.out.println("choose lan not enabled"); } Select dropdown =new
			 * Select(chooseLang); dropdown.selectByVisibleText("English");
			 */
			driver.findElement(chooseLang).click();
			System.out.println("chooselang passed");
			Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Exception caught chooselang"+e.getMessage());
			}
		
	}
	
	  public void clickonlang()
	   { try{ 
	  //driver.findElement(lang).click();
	  Thread.sleep(2000);
	   }
	   catch(Exception e) {
	  System.out.println("Exception caught clickonlang"+e.getMessage()); }
	  
	  }
	 
}


