package FirstPackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demoproject {
	WebDriver driver;
	
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	
	{
		Demoproject demo = new Demoproject();
		demo.Setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// 1. First Test Case Login Section
		
		WebElement EMAIL = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		Thread.sleep(3000);
		EMAIL.click();
		Thread.sleep(3000);
		EMAIL.sendKeys("user@phptravels.com");
		Thread.sleep(2000);
		WebElement PASSWORD = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		PASSWORD.click();
		PASSWORD.sendKeys("demouser");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(1000);
		WebElement LOGINBUTTON = driver.findElement(By.xpath("//span[text()='Login']"));
		
		LOGINBUTTON.click();
		
		
		// Redirect on Home Page from Dashboard Page
		 WebElement Home = driver.findElement(By.xpath("//a[text()='Home']"));
		 
		 Thread.sleep(1000);
		 Home.click();
		
		
		// 2. Second Test Case  Verify the Title of Home Page 
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "PHPTRAVELS - PHPTRAVELS";
		
		if (ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		Thread.sleep(1000);
		
		
		
		// 3. Third Test Case  Verify the booking
		 
		// 1.  ENTER THE CITY NAME
		
		WebElement searchBox = driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']"));
		Thread.sleep(2000);
		searchBox.click();
		Thread.sleep(2000);
		
		WebElement inputSearchBox = driver.findElement(By.xpath("//input[@role='searchbox']"));
		Thread.sleep(2000);
		inputSearchBox.click();
		Thread.sleep(3000);
		String io = "Chandigarh";
		inputSearchBox.sendKeys(io);
		Thread.sleep(1000);
		inputSearchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		// 2. ENTER THE DATE CHECK IN
		
		 // CLICK ON CHECK IN
		WebElement ChkIN = driver.findElement(By.xpath("//input[@id='checkin']"));
		Thread.sleep(1000);
		ChkIN.click();
		Thread.sleep(2000);
		
		// CHOOSE THE DATE
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//input[@id='checkin']//table/tbody/tr[3]/td[3]")).click();
		Thread.sleep(9000);
		
		
		
		Thread.sleep(2000);
		
		
	     }
}
