package SeleniumJavaFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTestMultipleOS {
	
public static void main(String arg[]) {
		
		String os = System.getProperty("os.name").toLowerCase();
		
		//setup the chrome driver using WebDriverManager
        //WebDriverManager.chromedriver().version("2.36").setup();
		
		String projectPath = System.getProperty("user.dir");

	// Selenium Java Framework Step by Step
		if(os.contains("mac")) {
		// Set the path to Chrome driver 
			System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver/chromedriver_mac64");
			System.out.println("Mac");
			
		 } else if(os.contains("win")) {
			 System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver/chromedriver.exe");
			 System.out.println("Win");
		 } else {
			 
			 System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver/chromedriver_linux6");
			 System.out.println("Linux");
		 }
		
		// Create diver object for Chrome 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a URL 
		driver.get("https://www.seleniumhq.org");
		
	}

}
