package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import utilities.CaptureScreenshot;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestCase extends BaseTest{
	
	@SuppressWarnings("deprecation")
	@Test(dataProvider="testdata")
	public static void LoginTest(String username, String password ) throws IOException  
	{
		CaptureScreenshot ScreenShot= new CaptureScreenshot();
		System.out.println("RUN TEST");
		driver.findElement(By.linkText("Sign in")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("login_id")).sendKeys(username);
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys(password);
	    driver.findElement(By.id("nextbtn")).click();
	    ScreenShot.clickscreenshot(driver);
	}
	
	@DataProvider(name="testdata")
	public Object[][] testDate()
	{
		return new Object[][]
				{
					{"neeti5.kaushik@gmail.com","Selenium@12"},
					//{"neeti5aushik@gmail.com","wlenium@12"},	
				};
	}

}
