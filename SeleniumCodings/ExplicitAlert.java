package week4.weekdayassignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitAlert {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/alertappear.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("alert")).click();
		
		//Creating Explicit Wait
		WebDriverWait waitTime=new WebDriverWait(driver,Duration.ofSeconds(10));
		waitTime.until(ExpectedConditions.alertIsPresent());
		
	 driver.switchTo().alert().accept();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
