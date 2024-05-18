package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement src = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action = new Actions(driver);
		action.contextClick(src).build().perform();
		
		action.click(driver.findElement(By.xpath("//span[text()='Paste']"))).build().perform();
		
		//WebElement paste = driver.findElement(By.xpath("//span[text()='Paste']"));
				//action.click(paste).build().perform();


	}

}
