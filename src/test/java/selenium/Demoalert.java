package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//alertButton
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);

		//driver.switchTo().alert().accept();
	}

}
