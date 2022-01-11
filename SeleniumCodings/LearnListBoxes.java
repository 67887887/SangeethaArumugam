package week2.weekdayass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// DropDown for Training Program

		WebElement trainingProgram = driver.findElement(By.id("dropdown1"));
		Select training = new Select(trainingProgram);
		training.selectByIndex(2);

		// Selecting bt Visible text
		WebElement trainingProgramByText = driver.findElement(By.name("dropdown2"));
		Select training1 = new Select(trainingProgramByText);
		//training1.selectByIndex(training1.getOptions().size()-1);
		training1.selectByVisibleText("Selenium");

		// Selecting by Value
		WebElement trainingProgramByValue = driver.findElement(By.name("dropdown3"));
		Select training2 = new Select(trainingProgramByValue);
		training2.selectByValue("1");

		WebElement listSize = driver.findElement(By.className("dropdown"));
		Select list = new Select(listSize);
		list.selectByVisibleText("Selenium");
		
		int droplistSize = list.getOptions().size();
		System.out.println("List size: " + droplistSize);
		
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
		
	}

}
