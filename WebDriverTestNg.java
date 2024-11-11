package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverTestNg {
	static
	{
		System.setProperty("webdriver.edge.driver","./Library/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Library/geckodriver.exe");
		
	}
	@Test
	public void openGoogle() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void openFacebook() throws InterruptedException
	{
		WebDriver fire = new FirefoxDriver();
		fire.get("https://www.facebook.com");
		Thread.sleep(5000);
		fire.close();
	}

}
