package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromExcel {

	public static void main(String[] args) throws Exception {

		// Read the data from Excel file
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\MyTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Sheet2");
		Row a = ws.getRow(2);
		Cell username = a.getCell(0);
		Cell password = a.getCell(1);
		
			

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("username")).sendKeys(username.getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(password.getStringCellValue());
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
