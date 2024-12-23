package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	public static String date = "18";
	public static String month = "March";
	public static String year = "1983";

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

//		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
//		month.selectByVisibleText("August");
		
		new Select(driver.findElement(By.id("daybox"))).selectByVisibleText(date);
		
		new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")))
				.selectByVisibleText(month);
		
		new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText(year);
		
	

	}

}
