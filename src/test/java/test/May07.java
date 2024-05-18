package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class May07 {

	static WebDriver driver;

	@BeforeTest
	public static void setup()

	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Test(priority =1)
	public static void log_in() throws Exception
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
	}
	@Test(priority =2)

	public static void addItems()throws Exception
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click(); 
		Thread.sleep(5000);
	}
	@Test(priority = 3)
	public static void removeItems() throws Exception
	{
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click(); 
		Thread.sleep(5000);
	}


	@Test(priority = 4)
	public static void verifyBackpack()
	{
		if(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed())
		{
			System.out.println("Sauce Labs Backpack is displayed in application");

			if(driver.findElement(By.xpath("//div[text()='carry.allTheThings() with the sleek, streamlined Sly Pack"
					+ " that melds uncompromising style with unequaled laptop and tablet protection.']")).isDisplayed())
			{
				System.out.println("Sauce Labs Backpack Text is displayed in application");
			}
			else
			{
				System.out.println("Sauce Labs Backpack Text is not displayed in application");
			}
		}
		else
		{
			System.out.println("Sauce Labs Backpack is not displayed in application");
		}

	}




	@Test(priority = 5)
	public static void log_out() throws Exception
	{
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(5000);
	}


	@AfterTest
	public static void projectClose()
	{
		driver.close();
	}







}


