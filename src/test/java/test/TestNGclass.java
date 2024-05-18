package test;

import org.testng.annotations.Test;

public class TestNGclass {
	
@Test(priority =1)

	public static void test01() 
	{
		System.out.println("log in");
	}
@Test(priority =3)
	public static void test02() 
	{
		System.out.println("log out");
	}
@Test(priority =2, enabled= false)
	public static void test03() 
	{
		System.out.println("send email");
	}
@Test(priority =4, invocationCount = 3)
	public static void test04() 
	{
		System.out.println("delete email");
	}
}
