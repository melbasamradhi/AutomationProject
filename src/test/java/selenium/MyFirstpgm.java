package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 



public class MyFirstpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("welcome to testing");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
//driver.findElement(By.linkText("some-file.txt")).click();;
//driver.quit();
		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("MELBAS");
		Thread.sleep(2000);
		a.sendKeys(Keys.BACK_SPACE);
		a.sendKeys(Keys.CONTROL + "a");
		a.sendKeys(Keys.CONTROL + "c");
		WebElement b = driver.findElement(By.id("password"));
		b.sendKeys(Keys.CONTROL + "v");
//System.out.println(b.getText());

	}

}
