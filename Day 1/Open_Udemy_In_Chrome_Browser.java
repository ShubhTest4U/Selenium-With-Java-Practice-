import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubh\\Downloads\\chromedriver\\chromedriver.exe");
		
		// Instantiate a ChromeDriver class.   
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser  
        driver.manage().window().maximize();  
		
		driver.get("https://udemy.com/");
		
	}

}
