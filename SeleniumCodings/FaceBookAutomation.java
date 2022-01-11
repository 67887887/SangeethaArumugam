package week2.weekdayass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAutomation {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sangeetha");
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		driver.findElement(By.name("reg_email__")).sendKeys("sang@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Lakshanaa");
		WebElement dateDropDown=driver.findElement(By.name("birthday_day"));
		Select birthdate=new Select(dateDropDown);
		birthdate.selectByValue("26");
		
		WebElement monthDropDown=driver.findElement(By.name("birthday_month"));
		Select birthMonth=new Select(monthDropDown);
		birthMonth.selectByValue("12");
		
		WebElement yearDropDown=driver.findElement(By.name("birthday_year"));
		Select birthYear=new Select(yearDropDown);
		birthYear.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
		
		
		
	}

}
