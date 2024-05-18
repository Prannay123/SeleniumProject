package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitProgram {

	public static void main(String[] args) {

		WebDriver driver;
		driver  = new ChromeDriver();

		driver.get("https://www.selenium.dev/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Downloads')")));
		
		driver.findElement(By.xpath("//span[text()='Downloads'])).click()"0
				
		
	}

}
