package Tester.Testeruse; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EGPLogin {
	
	
	public void login() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sandeep.Tiwari/Downloads/selenium/chromedriver_win32/chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
		String url ="https://qbptest.azurewebsites.net/adminLogin";
		
		driver.manage().window().maximize();
		
		driver.get(url);
		System.out.println("Oepn Browser");
		
		//Get page title
		String actualPageTitlte=driver.getTitle();
		System.out.println(actualPageTitlte); 
		
		// Use of Implicit Wait
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;   
		
		// Use of Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		WebElement username;
		username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@placeholder='username']")));
		Helper.highLightElement(driver,username);
		username.sendKeys("admin@qualbe.com");
		
		//driver.findElement(By.xpath(".//input[@placeholder='username']")).sendKeys("admin@qualbe.com");
		System.out.println("Enter user name");
		
		driver.findElement(By.xpath(".//input[@placeholder='password']")).sendKeys("AdminPassword");
		System.out.println("Enter password");
		
		driver.findElement(By.xpath("(.//div[contains(.,'Login')]//button)[2]")).click();
		System.out.println("Click login button");
		System.out.println("Login successful");
		Thread.sleep(5000);
		
		//Get page title
				String actualPageTitlte1=driver.getTitle();
				System.out.println(" after login " + actualPageTitlte1); 
		
		driver.findElement(By.xpath(".//a[contains(.,'Logout')]")).click();
		System.out.println("Open logout popup");
		
		driver.findElement(By.xpath(".//span[.='Yes']/..")).click();
		System.out.println("Logout successful");
		
		
	}
	
	
	
	
	public static void main(String arg[]) throws Exception {
	
		
		EGPLogin login_obj = new EGPLogin();
		login_obj.login();
		
		
	}
	

}
