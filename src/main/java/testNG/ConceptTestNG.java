package testNG;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptTestNG {
	WebDriver driver;
	
	@Test
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	

}
