package Rajitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autotestdata {

	public static void main(String[] args) {
		
		// open browser
				WebDriver driver = new ChromeDriver();

				// Type URL
				driver.get("https://autotestdata.com");

				// click on needhelp 
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();

	}

}
