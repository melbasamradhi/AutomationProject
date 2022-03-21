package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoalert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// promtButton
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().window().maximize();
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("eee");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
