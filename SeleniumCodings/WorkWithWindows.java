package week4.weekdayassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithWindows {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listHandles.get(1));
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(listHandles.get(0));
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		
		driver.switchTo().window(listHandles.get(0));
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		
		windowHandles.clear();
		windowHandles.addAll(driver.getWindowHandles());
		listHandles.clear();
		listHandles.addAll(windowHandles);

		for (int i = 1; i < listHandles.size(); i++) {
			driver.switchTo().window(listHandles.get(i));
			driver.close();
		}
		
		driver.switchTo().window(listHandles.get(0));
		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
		driver.quit();
	}
	
		
		
		
        
	}
		
		
		

	

