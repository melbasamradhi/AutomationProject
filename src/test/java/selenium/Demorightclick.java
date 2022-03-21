package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demorightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
	WebElement ele =	driver.findElement(By.id("fname"));
	Actions a = new Actions(driver);
	a.contextClick(ele).perform();
	driver.close();
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
//   //*[@id="authentication"]/button;
	WebElement dou = driver.findElement(By.xpath("//*[@id='authentication']/button"));
	Actions b = new Actions(driver);
b.doubleClick(dou).perform();

	}

}
