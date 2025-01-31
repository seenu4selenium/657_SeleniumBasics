package testNGScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Blazedemo {
	WebDriver driver;

	@BeforeClass
	public void beforeClass(@Optional("firefox") String browserName) {
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
	public void tc_01() throws Exception {

		// WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Choose first dropdown as Boston then second dropdown value as London..
		// Way-1
		Select abc = new Select(driver.findElement(By.name("fromPort")));
		abc.selectByVisibleText("Boston");

		// Way-2
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");

	}
}
