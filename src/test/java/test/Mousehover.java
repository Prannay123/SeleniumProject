package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Actions action = new Actions(driver);
		WebElement x = driver.findElement(By.xpath("//div[@data-group='home-&-living']"));
		action.moveToElement(x).build().perform();
		
		
	}

}
