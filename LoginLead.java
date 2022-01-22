package week5.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLead {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	
	public void beforeMethod() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	
	public void afterMethod()
	{
		driver.close();
	}

}

