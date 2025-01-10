package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetDataFromExcel_MultipleTestData {
	public static WebDriver driver;

	public static void takescreenshot() throws Exception {
		// Time and Date
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
		String timestamp = df.format(d);

		// Takescreenshot of the current webpage?
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\src\\test\\resources\\screenshots\\orangehrmlive_" + timestamp + ".png"));
	}

	public static void main(String[] args) throws Exception {

		// Read the data from Excel file
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\MyTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Sheet2");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		for (int row = 1; row < 7; row++) {
			Row a = ws.getRow(row);
			Cell username = a.getCell(0);
			Cell password = a.getCell(1);

			Thread.sleep(2000);
			// To Clear the existing text from Editbox
//			JavascriptExecutor jse = (JavascriptExecutor) driver;
//			jse.executeScript("arguments[0].value = '';", driver.findElement(By.name("username")));
//			jse.executeScript("arguments[0].value = '';", driver.findElement(By.name("password")));
//			
			driver.findElement(By.name("username")).sendKeys(Keys.CONTROL + "a");
			driver.findElement(By.name("username")).sendKeys(Keys.DELETE);

			driver.findElement(By.name("password")).sendKeys(Keys.CONTROL + "a");
			driver.findElement(By.name("password")).sendKeys(Keys.DELETE);

			// driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys(username.getStringCellValue());
			Thread.sleep(2000);
			// driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password.getStringCellValue());

			takescreenshot() ;
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			
			takescreenshot() ;
			
			// Validate the error text is displayed or not?
			// if it is displayed, the given credentials are in-valid else valid.

			System.out.println(username.getStringCellValue());
			System.out.println(password.getStringCellValue());
			System.out.println("********************************");
			if (driver.findElements(By.xpath("//*[text()='Invalid credentials']")).size() > 0) {
				System.out.println("The given credentials are in-valid- TestCases FAIL");
			} else {
				System.out.println("The given credentials are valid-  TestCases PASS");
			}

		} // for loop end
	}

}
