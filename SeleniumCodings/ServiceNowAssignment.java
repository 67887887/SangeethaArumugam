package week4.weekdayassignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowAssignment {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev52631.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("Sangeetha");
		driver.findElement(By.id("user_password")).sendKeys("Lakshanaa@1234");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[text()='All'][@class='sn-widget-list-title'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//tbody[@class='list2_body']//td[3]/a)[1]")).click();
		driver.switchTo().window(listWindow.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys("Reset my password");
		String incidentNum = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.id("sysverb_insert")).click();
		driver.findElement(By.xpath("(//label[text()='Search'])[2]//following::input[1]")).sendKeys(incidentNum,Keys.ENTER);
		String text = driver.findElement(By.xpath("(//tbody[@class='list2_body']//td[3]/a)[1]")).getText();
		if(incidentNum.equals(text)) {
			System.out.println("Incident is successfully created");
			File src = driver.getScreenshotAs(OutputType.FILE);
			File des = new File("./Incident.png");
			FileUtils.copyFile(src, des);
			
		}
		else
		{
			System.out.println("Incident is not created");
		}
		
	}
		}


