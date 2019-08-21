package SeleniumJavaFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserTestIE {
	
	public static void main(String arg[]) {
		
		
		//WebDriverManager.iedriver().setup();
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.ie.driver", projectPath + "/Driver/IEdriver/IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.get("https://1dgrouptest.info");
		
		
	}

}
