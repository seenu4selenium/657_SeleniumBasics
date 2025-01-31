package testNGScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBlogin {
	@Test
	public void f() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("HemaNewEmail@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("asdghdfyt4wrtgfhdf");
		driver.findElement(By.name("login")).click();
	}
}
