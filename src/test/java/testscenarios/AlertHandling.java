package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");	
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//First "Click me" button
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);
		//Click on OK button on ALERT
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		//scrolldown Way-1
//		JavascriptExecutor jse = (JavascriptExecutor)driver;		
//		jse.executeScript("window.scrollBy(0,250)");
		
		//scrolldown Way-2
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("confirmButton")));
		
		
		
		Thread.sleep(2000);
		//Third "Click me" button
		driver.findElement(By.id("confirmButton")).click();

		//Click on CANCLE button on CONFORMATION_ALERT
		driver.switchTo().alert().dismiss();		
		
		
		
		

	}

}
