package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FB_login {

	public static void main(String[] args) {

		// open browser
		WebDriver driver = new ChromeDriver();

		// Type URL
		driver.get("https://www.facebook.com/");

		// Type UN & Pwd
		driver.findElement(By.name("email")).sendKeys("Vivek");
		driver.findElement(By.name("pass")).sendKeys("DGshsdfhsfhfs");

		// click on login button
		driver.findElement(By.name("login")).click();

	}

}
