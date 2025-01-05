package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
	
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Click on 'terms & conditions' link on bottom of the page
		 driver.findElement(By.linkText("terms & conditions")).click();
		 
		 //driver.findElement(By.partialLinkText("& condit")).click();


	}

}
