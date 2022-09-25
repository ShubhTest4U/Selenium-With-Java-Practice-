import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;																									

public class OpenBrowser {

	public static void main(String[] args) {

		// System Property for Firefox Driver   
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shubh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");chromedriver.exe");
		
		// Instantiate a FirefoxDriver class.   
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the browser  
        driver.manage().window().maximize();  
		
		driver.get("https://udemy.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
