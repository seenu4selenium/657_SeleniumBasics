package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_8 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");	
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Choose first dropdown as Boston then second dropdown value as London..
		//Way-1
		Select abc = new Select(driver.findElement(By.name("fromPort")));
		abc.selectByVisibleText("Boston");
		
		//Way-2
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");

	}

}
