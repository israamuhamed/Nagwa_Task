package Objects;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class AdditionLesson {
	WebDriver driver;
	By worksheet =By.xpath("/html/body/div[1]/div/div/div/main/section[3]/div/div[2]/div/a");
	//List<WebElement> Questions = driver.findElements(By.xpath("/html/body/div/div/div/div/main/div[2]"));

	public AdditionLesson(WebDriver driver) {
		this.driver=driver;	
	}
	public void clickonWorksheet() throws InterruptedException
	{
		try{
			driver.findElement(worksheet).click();
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception caught worksheet"+e.getMessage());
		}
	}
	

}
