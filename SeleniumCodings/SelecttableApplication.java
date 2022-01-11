package week4.weekdayassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelecttableApplication {
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement itemSelected1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement itemSelected2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement itemSelected3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement itemSelected4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(itemSelected1).click(itemSelected2).click(itemSelected3).keyUp(Keys.CONTROL).perform();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
