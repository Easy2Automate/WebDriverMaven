package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest
{
 WebDriver Driver;
@BeforeSuite	
public void Setup()
{
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPractice\\chromedriver_79\\chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	
}
@Test
public void DoLogin()
{
	Driver.get("https://www.amazon.in/");
	Driver.findElement(By.xpath("//*[@id=\'nav-signin-tooltip\']/a/span")).click();
	Driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("testlogin");
	Driver.findElement(By.xpath("//*[@id=\"coninue\"]")).click();
	
}
@AfterSuite
public void TearDown()
{
	Driver.quit();
}
}
