package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demokeysup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/how-to-hold-key-down-with-selenium");
		 WebElement l = driver.findElement(By.id("gsc-i-id1"));
	      // Actions class
	      Actions a = new Actions(driver);
	      // moveToElement() and then click()
	      a.moveToElement(l).click();
	      //enter text with keyDown() SHIFT key ,keyUp() then build() ,perform()
	      a.keyDown(Keys.SHIFT);
	      a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
	      driver.quit();
	}

}
