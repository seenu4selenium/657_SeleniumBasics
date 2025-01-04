package testscenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_9_gettext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");

		// wait for few seconds
		// Thread.sleep(9000);

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// GetText()
		String fnText = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(fnText);

		System.out.println("********************************");
		
		// Will get all the error message by using single/Common Locator with the help
		// of List
		List<WebElement> allErrMsg = driver.findElements(By.className("formValidationMessage"));
		// ForEach loop / Advanced For / Enhanced for loop
		for (WebElement xyz : allErrMsg) {
			System.out.println(xyz.getText());
		}

	}

}
