package test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath(readXapth("FirstName"))).sendKeys(readData("FirstName"));
		driver.findElement(By.xpath(readXapth("LastName"))).sendKeys(readData("LastName"));
		driver.findElement(By.xpath(readXapth("Address"))).sendKeys(readData("Address"));
		driver.findElement(By.xpath(readXapth("Email"))).sendKeys(readData("Email"));
	

	}
	public static String readXapth(String fieldName) throws Exception 
	{

		File src = new File ("./Datasheet.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();

		for(int i=1;i<6;i=i+1)
		{
			if(format.formatCellValue(sh.getRow(i).getCell(0)).equals(fieldName))
			{
				return format.formatCellValue(sh.getRow(i).getCell(1));
			}

		}
		return"";
	}
	public static String readData(String fieldName) throws Exception 
	{

		File src = new File ("./Datasheet.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();

		for(int i=1;i<6;i=i+1)
		{
			if(format.formatCellValue(sh.getRow(i).getCell(0)).equals(fieldName))
			{
				return format.formatCellValue(sh.getRow(i).getCell(2));
			}

		}
		return"";
	}
}
