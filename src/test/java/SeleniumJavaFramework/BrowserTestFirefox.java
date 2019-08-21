package SeleniumJavaFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTestFirefox {
	
	public static void main(String arg[]) {
		
		//WebDriverManager.firefoxdriver().setup();
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath + "/Driver/geckodriver/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://1dgrouptest.info");
		
		
	}
	

}
