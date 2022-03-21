package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
	WebElement w =	driver.findElement(By.id("oldSelectMenu"));
		//Select s = new Select(w);
	Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
	List<WebElement> r  = s.getOptions();
	for(WebElement we:r)
	{
		System.out.println(we.getText());
	}
	
	s.selectByIndex(4);
	System.out.println(s.getFirstSelectedOption().getText());
	
	s.selectByValue("3");
	System.out.println(s.getFirstSelectedOption().getText());
	
	s.selectByVisibleText("White");
	System.out.println(s.getFirstSelectedOption().getText());
	//   /html/body/div/div/div/div[2]/div[2]/div[1]/div[7]/div/div/div/div[1]/div[1]
	
	driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]/div[1]")).click();
	}

}
