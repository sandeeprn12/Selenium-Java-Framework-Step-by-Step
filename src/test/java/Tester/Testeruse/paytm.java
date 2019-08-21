package Tester.Testeruse;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paytm {

	
	public static void main(String[] args) throws Exception, NoSuchElementException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sandeep.Tiwari/Downloads/selenium/chromedriver_win32/chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	
		 //JavascriptExecutor js = (JavascriptExecutor)driver;	
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com");
	    	System.out.println("oepn browser");
	    
	    	WebElement users = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.className("_3ac-")));
	    	users.click();
	    	
	   // driver.findElement(By.className("_3ac-")).click(); 
	    System.out.println("Click Log In/Sign Up button and oepn popup");
	      
//		Thread.sleep(15000);
//		WebElement LoginButton;
//		LoginButton = driver.findElement(By.className("_3ac-")); 
//	    Helper.highLightElement(driver,LoginButton);
//	    LoginButton.click();
	    //System.out.println("Click Log In/Sign Up button and oepn popup");
		
			
		//driver.switchTo().frame("authiframe");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='qrcode-footer-text']//following-sibling::span\"))")).click(); 
	    //	System.out.println("click Step 2");
		
		
		
	}
	
	
}
