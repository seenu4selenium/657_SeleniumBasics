package testscenarios;

import java.time.Duration;

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
		driver.findElement(By.name("email")).sendKeys("rajithashwetha1234@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("DGshsdfhsfhfs");

		// click on login button
		driver.findElement(By.name("login")).click();
		//Wait for page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		//find the error message has displayed on webpage "Find your account and log in."	
//		if (driver.findElement(By.linkText("Find your account and log in.abc")).isDisplayed()) {
//			 String eleText =  driver.findElement(By.linkText("Find your account and log in.")).getText();
//			 System.out.println(eleText);
//		} else {
//			System.out.println("The locator is not disaplyed.");
//		}
		
		
		if (driver.findElements(By.linkText("Find your account and log in.")).size()>0) {
			 String eleText =  driver.findElement(By.linkText("Find your account and log in.")).getText();
			 System.out.println(eleText);
		} else {
			System.out.println("The locator is not disaplyed.");
		}


	}

}
