package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathDropdownBYvisibletext {

	public static void main(String[] args) {

		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
			
		Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		yearDropDown.selectByVisibleText("1920");
		
		
	}

}
