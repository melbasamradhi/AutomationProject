package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoalert3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	confirmButton
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		/*driver.switchTo().alert().accept();
		String s = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(s);*/
		driver.switchTo().alert().dismiss();
		String s = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(s);
	}

}
