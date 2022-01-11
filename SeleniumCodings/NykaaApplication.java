package week4.weekdayassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaApplication {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		Actions builder = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath(("//a[text()='brands']")));
		WebElement brandName = driver.findElement(By.xpath("//div[@id='scroller-container']//div[7]/a[1]"));
		builder.moveToElement(brands).pause(1000).click(brandName).perform();
		String brandNameText = driver.findElement(By.xpath("//div[@id='title']/h1")).getText();
		System.out.println("The BrandName Selected is:" + brandNameText);

		// Selecting SortBy
		driver.findElement(By.xpath("//div[@class='css-0']//button[1]")).click();
		WebElement radioBotton = driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]"));
		radioBotton.click();

		// Clicking Category

		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'control-indicator checkbox')]")).click();
		// String
		// selectedValue=driver.findElement(By.xpath("//div[contains(@class,'control-indicator
		// checkbox')]")).getText();
		// String filterValue =
		// driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		// if(selectedValue.equals(filterValue)) {
		// System.out.println("The Value Filtered is same"); }
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
		// Switching to new window
		Set<String> windowsHandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowsHandle);
		driver.switchTo().window(handles.get(1));

		String productMRP = driver.findElement(By.className("css-12x6n3h")).getText();
		System.out.println("The MRP of product is :" + productMRP);

		driver.findElement(By.xpath("//div[@class='css-1rn9gza']//button[1]")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();

		Set<String> cartWindow = driver.getWindowHandles();
		List<String> shippingCartWindow = new ArrayList<String>(cartWindow);
		driver.switchTo().window(shippingCartWindow.get(1));
		driver.switchTo().frame(0);

		String grandTotal = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
		System.out.println("The Grand Total is:" + grandTotal);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();

		Set<String> guestWindow = driver.getWindowHandles();
		List<String> shippingGuestWindow = new ArrayList<String>(guestWindow);
		driver.switchTo().window(shippingGuestWindow.get(1));

		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		String totalAmount = driver.findElement(By.xpath("(//div[@class='value']//span)[2]")).getText();

		if (totalAmount.equals(grandTotal)) {
			System.out.println("The Amount is correct");
		} else {
			System.out.println("The Amount is not same");
		}

		driver.quit();

	}

}
