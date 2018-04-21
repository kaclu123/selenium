package v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Luka\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		
//		String Url = "localhost.com";
		driver.get("https://www.google.com/");
		
driver.close();
	}

}
