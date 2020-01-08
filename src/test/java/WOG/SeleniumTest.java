package WOG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void OpenPEMC()
	{
		System.out.println("Open PEMC");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://178.128.105.73/");
	}
	
	@Test
	public void LoginToPEMC()
	{
		
		System.out.println("Login to PEMC");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("dropdownlogin")).click();
		driver.findElement(By.id("uname")).sendKeys("aronpaul");
		driver.findElement(By.id("pass")).sendKeys("Wog12345!");
		driver.findElement(By.id("login-btn")).click();
	
		
	}

}
