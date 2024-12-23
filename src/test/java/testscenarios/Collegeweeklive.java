package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collegeweeklive {

	public static void main(String[] args) {

		// open browser
		WebDriver driver = new ChromeDriver();

		// Type URL
		driver.get("https://collegeweeklive.com/go-signup");	
		
		//click on terms and conditions
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[4]/span/a")).click();
	}

}
