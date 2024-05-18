package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablerogram2 {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> headersElements = driver.findElements(By.xpath("//table[@class='dataTable']//thead//th"));
		
		for(WebElement header:headersElements)
		{
			System.out.println(header.getText());
		}
		
	}

}
