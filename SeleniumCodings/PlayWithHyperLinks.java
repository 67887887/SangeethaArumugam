package week2.weekdayass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperLinks {
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		if (driver.getTitle().equals("HTTP Status 404 – Not Found")) {							
            System.out.println("Say i am break");					
        } else {			
            System.out.println("We are NOT broken");					
        }	
	
		driver.navigate().to("http://leafground.com/pages/Link.html");
		List<WebElement> findElement = driver.findElements(By.tagName("a"));
		System.out.println("The number of Links in page:" +findElement.size());
	}

}
