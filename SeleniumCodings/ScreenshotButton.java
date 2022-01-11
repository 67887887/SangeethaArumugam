package week4.weekdayassignment;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotButton {public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement clickMe = driver.findElement(By.id("Click"));
	File srcFile = clickMe.getScreenshotAs(OutputType.FILE);
	File desFile = new File("./CLICKME.png");
	FileUtils.copyFile(srcFile, desFile);
	clickMe.click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	driver.findElement(By.id("Click1")).click();
	driver.switchTo().defaultContent();
	List<WebElement> framesCount = driver.findElements(By.tagName("iframe"));
	int count = framesCount.size();
	for (int i = 0; i < framesCount.size(); i++) {
		driver.switchTo().frame(i);
		count = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().defaultContent();
	}
	System.out.println("Total Number of Frames : "+count);
}}

