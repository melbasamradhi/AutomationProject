package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

driver.findElement(By.id("email")).click();
	}

}
