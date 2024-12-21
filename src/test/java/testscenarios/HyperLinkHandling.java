package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HyperLinkHandling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// Click on Forgot password? hyperlink
		driver.findElement(By.linkText("Forgot password?")).click();
		// driver.findElement(By.partialLinkText("Forg")).click();

		
		https://demo.automationtesting.in/Register.html
		new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")))
				.selectByVisibleText("August");

//		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
//		month.selectByVisibleText("August");

	}
}
