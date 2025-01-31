package testNGScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting_FBlogin {
	WebDriver driver;	

	@Parameters("browserName")
	@BeforeClass // Pre-condition code want to execute
	public void beforeClass(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please give valid browser name*****");
		}
		driver.manage().window().maximize();
	}

	@Test
	public void f() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HemaNewEmail@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("asdghdfyt4wrtgfhdf");
		driver.findElement(By.name("login")).click();
	}
	
}
