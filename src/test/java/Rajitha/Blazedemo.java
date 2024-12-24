package Rajitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Blazedemo {
	public static String place = "Boston";
	public static String place1 = "London";


	public static <place1> void main(String[] args) {

		// open browser
		WebDriver driver = new ChromeDriver();

		// Type URL
		driver.get("https://blazedemo.com/");
		
		 new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"))).selectByVisibleText(place);
		new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"))).selectByVisibleText(place1);
				

		
	
	
	}

	
	}
	


