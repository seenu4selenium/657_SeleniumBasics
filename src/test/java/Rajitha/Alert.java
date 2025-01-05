package Rajitha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");	
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("alertButton")));
		
			
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		//Click on OK button on ALERT
		driver.switchTo().alert().accept();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;		
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("timerAlertButton")));
		
		
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		org.openqa.selenium.Alert element = wait.until(ExpectedConditions.alertIsPresent());
		
		//Click on OK button on ALERT
		driver.switchTo().alert().accept();
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;		
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("confirmButton")));
		
		
		driver.findElement(By.id("confirmButton")).click();
		//Click on OK button on ALERT
				driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
