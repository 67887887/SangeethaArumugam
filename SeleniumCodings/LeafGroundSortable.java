package week4.weekdayassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundSortable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/sorttable.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		int size = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();
		System.out.println(size);
		List<String> names = new ArrayList<String>();

		for (int i = 1; i < size; i++) {

			String tableNames = driver.findElement(By.xpath("//table[@id='table_id']//tr[" + i + "]/td[2]")).getText();
			names.add(tableNames);

		}
		Collections.sort(names);
		System.out.println(names);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='table_id']/thead[1]/tr[1]/th[2]")).click();
		List<String> secondNames = new ArrayList<String>();

		for (int i = 1; i < size; i++) {

			String secondtableNames = driver.findElement(By.xpath("//table[@id='table_id']//tr[" + i + "]/td[2]"))
					.getText();
			secondNames.add(secondtableNames);

		}
		System.out.println(secondNames);

		if (names.equals(secondNames)) {

			System.out.println("The Names in table are same");

		} else {
			System.out.println("The Names are different");
		}

	}

}
