package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
	/*Boolean a =	driver.findElement(By.xpath("/html/body/div/header/a/img")).isDisplayed();
	System.out.println(a);*/
	
	//img[@src='/images/Toolsqa.jpg']
	Boolean a =	driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
	System.out.println(a);
	}

}
