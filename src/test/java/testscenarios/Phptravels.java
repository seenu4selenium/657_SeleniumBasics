package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravels {

	public static void main(String[] args) throws InterruptedException {
		// open browser
				WebDriver driver = new ChromeDriver();

				// Type URL
				driver.get("https://phptravels.com/demo");
				
				//Mazimize current window
				driver.manage().window().maximize();

				// click on signup
				
				driver.findElement(By.xpath("/html/body/header/nav/div/div/div/a[3]")).click();
	}

}
