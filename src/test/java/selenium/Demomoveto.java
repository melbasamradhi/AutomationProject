package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demomoveto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
	WebElement w =	driver.findElement(By.id("idOfButton"));
Thread.sleep(2000);
	
	Actions a = new Actions(driver);
		a.moveToElement(w).perform();
	
		Thread.sleep(2000);
	}

}
//*[@id='header']/div[3]/div/div[2]/a/i
//*[@id="header"]/div[3]/div/div[2]/a/span
//*[@id="header"]/div[3]/div/div[2]/a
//*[@id="header"]/div[3]/div/div[2]/a
//span[text()='Jobs']