package FirstPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	WebDriver driver;
	
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
		TestClass  LaunchBrowser = new TestClass();
		LaunchBrowser.Setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@class='nav-logo']")).click();
		Thread.sleep(1000);
		
		String ActualTitle = driver.getTitle();
		
		String ExpectedTitle = "OrangeHRM HR Software | Free HR Software | HRMS | HRIS";
		
		if (ActualTitle.equals(ExpectedTitle)) 
		{
            System.out.println("Test Passed!");
            
		}
          else 
          {
            System.out.println("Test Failed");
          }
		
		Thread.sleep(1000);
		// CHECK THE ALL HEADER LINKS
		driver.findElement(By.linkText("Platform")).click();

	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Why OrangeHRM")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Resources")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Company")).click();
	    
	    Thread.sleep(2000);
	    
	    //CHECK THE PARTAIAL LINKS
	    
	    driver.findElement(By.linkText("Platform")).click();
	    
	    driver.findElement(By.linkText("HR Administration")).click();
	    
	    /*String t = "HR Administration";
	    
	    if ( driver.getPageSource().contains("HR Administration"))
	    {
	         System.out.println("Text: " + t + " is present. ");
	      }
	    else 
	    {
	         System.out.println("Text: " + t + " is not present. ");
	      }*/
	  
	    // Verify The Text
	    
	    String text = driver.findElement(By.xpath ("//h3[contains (text(),'HR Administration')]")).getText();
	    System.out.println(text);
	    
	    // Check Inner Link of HR Administration Page
	    
	    Thread.sleep(5000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,3000)");
	    driver.findElement(By.xpath("//a[text()='Employee Management  ']")).click();
	    
	    // Verify the Text of Employee Management Page
	    Thread.sleep(2000);
	    String text1 = driver.findElement(By.xpath ("//h3[contains (text(),'Employee Management')]")).getText();
	    System.out.println(text1);
	    
	    // Scroll the page
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='feature-module-page']/div[3]/div[2]/div[2]/div[1]/div[2]/div/a")).click();
	    Thread.sleep(1000);
	    driver.close();
	  //div[@class='feature-module-page']/div[3]/div[2]/div[2]/div[1]/div[2]/div/a
	    //driver.findElement(By.xpath("//a[text()='HR Administration']"))	
		
	}

	}
