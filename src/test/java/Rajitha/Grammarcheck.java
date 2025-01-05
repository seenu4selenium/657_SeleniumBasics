package Rajitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grammarcheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grammarcheck.net/editor/");	
		Thread.sleep(3000);
		
		//click on delete icon
		driver.findElement(By.id("clear-1")).click();
		
		//Click on OK button on ALERT
		
		
		driver.switchTo().alert().accept();

	}

}
