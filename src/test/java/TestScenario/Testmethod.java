package TestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.AdditionLesson;
import Objects.HomePage;
import Objects.SearchLessons;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmethod {
WebDriver driver;
	
	@BeforeTest
	
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage();
		driver.get("https://www.nagwa.com/en/");
	}
	@Test
	public void chooselanguage() throws InterruptedException {
		HomePage home=new HomePage(driver);	
		home.chooselang();
		home.clickonlang();
		
		} 
	@Test
	public void searchoperation() throws InterruptedException {
		SearchLessons page=new SearchLessons(driver);	
		page.clickSearchbtn();
		page.enterSearchItem("addition");
		page.SubmitSearchbtn();

		} 
	@Test
	public void accesslesson() throws InterruptedException {
		SearchLessons lesson= new SearchLessons(driver);
		lesson.clickonlesson();
	}
	@Test
	public void worksheetSection() throws InterruptedException
	{
		AdditionLesson page = new AdditionLesson (driver);
		page.clickonWorksheet();
	}
	
	@AfterTest
	public void aftertst() 
	{
		driver.quit();
	}
	


}
