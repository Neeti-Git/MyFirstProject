package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions act= new Actions(driver);
		
		WebElement element= driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[1]/a"));
		
		//act.scrollToElement(element);
		act.scrollByAmount(0,1381)b;
		
		System.out.println(element.getRect().y);
		
		element.click();
		
	}

}
