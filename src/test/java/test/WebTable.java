package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

	WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> headersElements = driver.findElements(By.xpath("//table[@class='dataTable']//thead//th"));
		String[] expectedHeaders = {"Companys",
				"Group",
				"Prev Close (Rs)",
				 "Current Price (Rs)",
				"% Change"};
		
		for(int i=0;i<expectedHeaders.length;i=i+1)
		{
			if(headersElements.get(i).getText().equals(expectedHeaders[i]))
			{
				System.out.println(expectedHeaders[i]+"  is displayed ");
			}
			else
			{
				System.out.println(expectedHeaders[i]+"  is not displayed ");
			}
		}
		System.out.println("Test");
	}

}
