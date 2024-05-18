package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class May04 {

	public static void main(String[] args) {

		WebDriver driver;
		driver  = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();

		System.out.println(driver.getWindowHandles());

		for(String windowId : driver.getWindowHandles())
		{
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("Services"))
			{
				driver.findElement(By.xpath("//span[text()='COMBO PACKS']")).click();
			}
			if(driver.getTitle().contains("List of top"))
			{
				driver.findElement(By.xpath("//span[text()='Search jobs here']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys("Testing"+Keys.ENTER);
			}
		}

	}
}
