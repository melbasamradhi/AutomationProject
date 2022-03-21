package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melbasam\\radhika\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement w = driver.findElement(By.id("cars"));
		Select s = new Select(w);
	Boolean b =	s.isMultiple();
	System.out.println(b);
	List<WebElement> op = s.getOptions();
	for(WebElement opt:op)
	{
		System.out.println(opt.getText());
	}
	s.selectByIndex(0);
	s.selectByVisibleText("Audi");
	List<WebElement> sel = s.getAllSelectedOptions();
	for(WebElement sele:sel)
	{
		System.out.println(sele.getText());
	}
	
	s.deselectByIndex(0);
	System.out.println(s.getFirstSelectedOption().getText());
	
//   //*[@id="app"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]
	
	// //*[@id="userName"]
	
	}

}
