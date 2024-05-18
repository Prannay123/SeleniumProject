package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitProgram {

	public static void main(String[] args) {


		WebDriver driver;
		driver  = new ChromeDriver();

		driver.get("https://www.selenium.dev/downloads/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("abc")).click();

	}

}
