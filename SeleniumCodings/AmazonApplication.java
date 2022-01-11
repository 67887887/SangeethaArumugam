package week4.weekdayassignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonApplication {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Actions builder = new Actions(driver);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String mobilePrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The price of FirstProduct is Rs:" + mobilePrice);

		driver.findElement(By.xpath("//img[@class='s-image']")).click();

		Set<String> windowsHandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowsHandle);
		driver.switchTo().window(handles.get(1));

		driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']//i")).click();
		String customerRating = driver.findElement(By.xpath("(//table[@id='histogramTable']/following::table)[4]")).getText();
		System.out.println("The customer Rating of the Product:" + customerRating);
		
		WebElement sourceImage = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']/img"));
		
		File src=sourceImage.getScreenshotAs(OutputType.FILE);
		File destination=new File ("./PhoneImage.png");
		FileUtils.copyFile(src, destination);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		String itemPrice = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println(itemPrice);
		
		if(mobilePrice.equals(itemPrice)) {
		
		System.out.println("The Price is same");
		}
		else {
			System.out.println("The Price is Different");
		}
		

		driver.quit();
		
		

	}

}
