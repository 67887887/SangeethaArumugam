package week3.weedayassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioApplication {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");

		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(1000);
		String fashionBagCount = driver.findElement(By.className("length")).getText();
		System.out.println(fashionBagCount);

		System.out.println("List of Products Found in List");
		List<WebElement> brandName = driver.findElements(By.className("brand"));
		List<String> bn = new ArrayList<String>();
		for (WebElement webElement : brandName) {
			String brandNameText = webElement.getText();
			bn.add(brandNameText);
		}
		System.out.println(bn);
		Thread.sleep(1000);
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		List<String> bgName = new ArrayList<String>();
		for (WebElement bagNameText : bagNameList) {
			String text = bagNameText.getText();
			bgName.add(text);
		}
		System.out.println(bgName);

	}

}
