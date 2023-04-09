package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchLessons {
	WebDriver driver;
	By search_btn=By.xpath("//button[@type='button']//i[@class='f-icon search-icon']");
	By search_box=By.xpath("//input[@id=\"txt_search_query\"]");
	By search_submit =By.xpath("//button[@type=\'submit\']");
	By Lesson_link=By.xpath("/html/body/div/div/div/div/main/div[3]/ul/li[2]/div/a");
	
	public SearchLessons(WebDriver driver) {
		this.driver=driver;
	}
	public void clickSearchbtn() throws InterruptedException
	{
		try{
			driver.findElement(search_btn).click();
			Thread.sleep(1000);

		}
		catch(Exception e) {
			System.out.println("Exception caught clicksearchbtn"+e.getMessage());
		}
	}
	public void enterSearchItem(String SearchInput) throws InterruptedException
	{
		try{
	    
		driver.findElement(search_box).sendKeys(SearchInput);
		Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Exception caught entersearchitem"+e.getMessage());
		}
	}
	public void SubmitSearchbtn() throws InterruptedException
	{
		try{
			driver.findElement(search_submit).click();
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception caught clicksearchbtn"+e.getMessage());
		}}
	
	public void clickonlesson() throws InterruptedException
	{
		try{
			driver.findElement(Lesson_link).click();
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Exception caught clicklesson "+e.getMessage());
		}
	}
	

}
