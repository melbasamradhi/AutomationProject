package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   https://sso.teachable.com/secure/9521/identity/login
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.get("https://sso.teachable.com/secure/9521/identity/login");


driver.findElement(By.id("email")).sendKeys("radhika");
driver.findElement(By.id("password")).sendKeys("r32145hg");
//driver.findElement(By.name("commit")).click();
driver.findElement(By.className("btn-primary")).click();
String s =driver.findElement(By.cssSelector("div.bodySmall")).getText();
System.out.println(s);
Assert.assertEquals(s,"Your email or password is incorrect.");
WebElement f = driver.findElement(By.linkText("Forgot Password"));
System.out.println(f.getText());
f.click();
f.click();

//   <a class="bodySmall form-footer" href="/secure/9521/identity/forgot_password">Forgot Password</a>
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rrt@gmail.com");
driver.findElement(By.xpath("//input[@type='email']")).clear();
driver.findElement(By.cssSelector("input[autocomplete='email']")).sendKeys("htee@gmail");
	}
}
