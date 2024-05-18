package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathDragnDrop {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement src = driver.findElement(By.xpath("//li[@data-id='5']"));

		WebElement trg = driver.findElement(By.xpath("//ol[@id='bank']"));

		Actions action = new Actions(driver);
		action.dragAndDrop(src, trg).build().perform();


		src = driver.findElement(By.xpath("//li[@id='credit1']"));

		trg = driver.findElement(By.xpath("//ol[@id='loan']"));

		action.dragAndDrop(src, trg).build().perform();





	}

}
