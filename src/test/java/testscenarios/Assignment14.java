package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment14 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/confirmation.php");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// get the page text
		String pageText = driver.findElement(By.xpath("//*[contains(@class,'hero-unit')]")).getText();
		System.out.println(pageText);

	}

}
