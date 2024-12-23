package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opensource_demo {

	public static void main(String[] args) {
		// open browser
				WebDriver driver = new ChromeDriver();

				// Type URL
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				// Type UN & Pwd
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");

				// click on login button
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

}
