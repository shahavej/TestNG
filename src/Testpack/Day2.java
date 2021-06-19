package Testpack;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	
	@BeforeTest
	public void bt()
	{
		System.out.println("i am before test");
	}
	
	@AfterTest
	public void at()
	{
		
		System.out.println("i am after test");
	}
	
	@Test(groups= {"Smoke"})
	public void t1()
	{
		System.out.println("breakfast");
	}
	
	@Test(priority=1)
	public void t2()
	{
		//System.out.println("ready for office");
		assertEquals(false, true);
	}
	
	@Test(priority=2,groups= {"Smoke"})
	public void t3()
	{
		System.out.println("work in Office");
	}
}
