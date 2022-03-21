package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demokeys {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		//driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Melsa");
	
		driver.findElement(By.id("userEmail")).sendKeys("Melsa@mail.com");	
	WebElement c =	driver.findElement(By.id("currentAddress"));
	c.sendKeys("123,  AAA apartment, Bangalore");	
	c.sendKeys(Keys.CONTROL,"a");
	
	c.sendKeys(Keys.CONTROL,"c");
	
	WebElement p =	driver.findElement(By.id("permanentAddress"));
	p.sendKeys(Keys.CONTROL,"v");
	
	File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(s, new File("C:\\Users\\melbasam\\radhika\\test.png"));
	
	}

}
