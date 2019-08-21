package SeleniumJavaFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTestChrome {
	
	public static void main(String arg[]) {
		
		String os = System.getProperty("os.name").toLowerCase();
		
		//setup the chrome driver using WebDriverManager
        //WebDriverManager.chromedriver().version("2.36").setup();
		
		String projectPath = System.getProperty("user.dir");
	
	    System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver/chromedriver.exe");
		
		// Create diver object for Chrome 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Navigate to a URL 
		driver.get("https://www.seleniumhq.org");
		
	}

}
