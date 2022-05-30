package abcdtest.avc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsermanagement {

	public static void main(String[] arg) {
		//To download the browser
		WebDriverManager.chromedriver().setup();
		//To launch browsre
		WebDriver driver = new ChromeDriver();
		
		//To navigate to a website
		driver.get("https://www.datatables.net/");
		
	}
}
