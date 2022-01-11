package week4.weekdayassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUniqueTrainName {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("ms", Keys.TAB);
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("mdu", Keys.TAB);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		int rowcount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"))
				.size();
		List<String> trainNames = new ArrayList<String>();
		for (int i = 1; i <= rowcount; i++) {
			String trainName = driver
					.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]"))
					.getText();
			trainNames.add(trainName);

		}

		Collections.sort(trainNames);
		Set<String> uniquetrainNames = new LinkedHashSet<String>(trainNames);
		for (String unquieNmames : uniquetrainNames) {
			System.out.println(unquieNmames);

		}
	}

}
