package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTravel {
	
	WebDriver driver;
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		DemoTravel  DMT = new DemoTravel();
		DMT.Setup();
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(3000);
		WebElement small = driver.findElement(By.xpath("//section[@class='grey-box']/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small"));
		Thread.sleep(2000);
		small.click();
		
		Thread.sleep(2000);
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
	    Thread.sleep(2000);
		WebElement LOGINBUTTON = driver.findElement(By.xpath("//span[text()='Login']"));
		LOGINBUTTON.click();
		
		

	}

}
