package week4.weekdayassignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextChangesExplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/TextChange.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement textToappear = driver.findElement(By.id("btn"));
		WebDriverWait waitTime=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		waitTime.until(ExpectedConditions.textToBePresentInElement(textToappear,"Click ME!"));
		driver.findElement(By.id("btn")).click();
		driver.switchTo().alert();
		
		

	}

}
