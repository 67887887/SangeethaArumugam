package week4.weekdayassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraApplication {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		Actions builder = new Actions(driver);

		WebElement mens = driver.findElement(By.xpath("//a[text()='Men']"));
		WebElement jackets = driver.findElement(By.xpath("//a[text()='Jackets']"));

		builder.moveToElement(mens).click(jackets).perform();
		String jacketTotalCount = driver.findElement(By.className("title-count")).getText();
		System.out.println("The Total Number of jackets:" + jacketTotalCount);

		// Valiating the count
		String jacketCount = jacketTotalCount.replaceAll("\\D", "");

		int parseIntJacketCount = Integer.parseInt(jacketCount);

		String jacket = driver.findElement(By.xpath("//span[@class='categories-num']")).getText();
		String rainJackets = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();

		String jacketsValue = jacket.replaceAll("\\D", "");
		int jacketCountValue = Integer.parseInt(jacketsValue);

		String rainJacketCount = rainJackets.replaceAll("\\D", "");

		int parseIntRainJacketCount = Integer.parseInt(rainJacketCount);
		int totalValue = jacketCountValue + parseIntRainJacketCount;
		// System.out.println(totalValue);
		if (parseIntJacketCount == totalValue) {
			System.out.println("The combined Values are same");
		} else {
			System.out.println("The vales are not same");
		}

		driver.findElement(By.xpath("//span[@class='categories-num']")).click();
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("Duke");
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']//div")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		Set<String> sortedProductNmae=new HashSet<String>();
		for (WebElement string : productName) {
			sortedProductNmae.add(string.getText());
			
		}
		System.out.println(sortedProductNmae);
		if(sortedProductNmae.size()==1) {
			System.out.println("All coats of brandname" +sortedProductNmae);
		}
		
		WebElement sortBy = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		Thread.sleep(1000);
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement sortByOptions = driver.findElement(By.xpath("//label[text()='Better Discount']"));
		builder.moveToElement(sortBy).perform();
		builder.click(sortByOptions).perform();

		String priceOfItem = driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		System.out.println("The Price of first Item:" + priceOfItem);
		WebElement sourceElemnt = driver.findElement(By.xpath("//img[@class='img-responsive']"));
		driver.findElement(By.xpath("//img[@class='img-responsive']")).click();

		File srcFile = sourceElemnt.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./CLICK.png");
		FileUtils.copyFile(srcFile, desFile);

		Set<String> windowsHandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowsHandle);
		driver.switchTo().window(handles.get(1));

		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		driver.quit();

	}

}
