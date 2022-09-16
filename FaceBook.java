package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver=new ChromeDriver();
         driver.get("https://en-gb.facebook.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.findElement(By.linkText("Create New Account")).click();
	     driver.findElement(By.name("firstname")).sendKeys("Vaishali");
	     driver.findElement(By.name("lastname")).sendKeys("Mathi");
	     driver.findElement(By.name("reg_email__")).sendKeys("8940279179");
	     driver.findElement(By.id("password_step_input")).sendKeys("crmsfa");     
	     WebElement Day = driver.findElement(By.id("day"));     
	     Select date=new Select(Day);
	     date.selectByValue("28");
	     WebElement Month = driver.findElement(By.id("month"));      
	     Select month=new Select(Month);
	     month.selectByValue("10");
	     WebElement Year = driver.findElement(By.id("year"));
	     Select year=new Select(Year);
	     year.selectByValue("1993");
	     driver.findElement(By.name("sex")).click();
	}
}
