package Java_SE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class automacao01 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		
		FirefoxOptions options = new FirefoxOptions();
	    	 FirefoxDriver adriver = new FirefoxDriver(options);
		
		WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
				driver.get("http://www.youtube.com/");
				driver.get("http://www.facebook.com/");
				driver.get("http://www.youtube.com/");
	}

}
