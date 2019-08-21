package Tester.Testeruse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {

	public void createAccount() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sandeep.Tiwari/Downloads/selenium/chromedriver_win32/chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
		String url ="https://qbptest.azurewebsites.net/adminLogin";
		
		driver.manage().window().maximize();
		
		driver.get(url);
		System.out.println("Oepn Browser");
		
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
		
		WebElement createAccount;
		createAccount = driver.findElement(By.xpath(".//a[contains(.,' Create Account')]"));
		Helper.highLightElement(driver,createAccount);
		createAccount.click();
		System.out.println("Click to create Account button");
		
		
		// Account Name
		driver.findElement(By.id("name")).sendKeys("Test Account 1");
		System.out.println("Enter Account name");
		
		// Group Administrator Email
		driver.findElement(By.id("email")).sendKeys("");
		System.out.println("Enter Group Administrator Email");
		
		// Domain
		driver.findElement(By.id("domain")).sendKeys("st23");
		System.out.println("Enter domain name");
		
		// Payroll Frequency
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Frequency
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Group
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Payroll Options
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Status
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Enroll By Date
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Invoice Recipient Email
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Address 1
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		// Address 2
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Zip
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// City
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// State
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Administrator Phone Number
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Check box
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Batch Run Date
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
		
		// Special Instructions
		driver.findElement(By.xpath("")).sendKeys("");
		System.out.println("");
	}
	
	public static void main(String arg[]) throws Exception {
		
		CreateAccount com_obj = new CreateAccount();
		com_obj.createAccount();
		
		
	}
	
	
}
