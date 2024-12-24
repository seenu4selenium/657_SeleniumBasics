package Rajitha;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dmv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// open browser
				WebDriver driver = new ChromeDriver();

				// Type URL
				driver.get("https://www.txdpsscheduler.com/");
				Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/button[1]")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/div/form/div[2]/div[3]/div[2]/div/div[1]/div/input")).sendKeys("sudheer");
			
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/div/form/div[2]/div[3]/div[3]/div/div[1]/div/input")).sendKeys("Aluvala");
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/div/form/div[2]/div[3]/div[4]/div/div[1]/div[1]/input")).sendKeys("08/26/1978");
				driver.findElement(By.id("last4Ssn")).sendKeys("1942");
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/div/form/div[2]/div[4]/button")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/div/div[3]/div/button")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/main/div/div/div[1]/div[1]/button")).click();
				
				Actions act =  new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/button/span/"))).click().perform();
				
				
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/form/div/div[1]/div/div[5]/div/div/div/div[1]/div/input")).sendKeys("rajitha.amraj@gmail.com");
				
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/form/div/div[1]/div/div[6]/div/div/div/div[1]/div/input")).sendKeys("rajitha.amraj@gmail.com");
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/form/div/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div[1]/input")).sendKeys("75078");
				driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/form/div/div[2]/div[2]/div/div[2]/button")).click()
				;	
				driver.manage().window().maximize();
	}
	
	

}
