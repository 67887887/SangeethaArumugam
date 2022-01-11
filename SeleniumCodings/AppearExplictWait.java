package week4.weekdayassignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppearExplictWait {
	
	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://www.leafground.com/pages/appear.html");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement elemntToappear = driver.findElement(By.xpath("//b[text()='We are five friends here']"));
			WebDriverWait waitTime=new WebDriverWait(driver,Duration.ofSeconds(15));
			waitTime.until(ExpectedConditions.visibilityOf(elemntToappear));
			
			String apperaingText = driver.findElement(By.xpath("//b[text()='We are five friends here']")).getText();
			System.out.println(apperaingText);
		}

	
		
		
		
		
		
		
		
		
		
		
		
		
	

}
