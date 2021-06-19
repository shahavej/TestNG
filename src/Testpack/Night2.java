package Testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Night2 {

	
	@BeforeClass
	public void bc()
	{
		
		System.out.println("i am before class");
	}
	@AfterClass
	public void ac()
	{
		
		System.out.println("i am after class");
	}
	
	@Test
	public void t1()
	{
		System.out.println("sleep");
	}
	@Test
	public void t2()
	{
		System.out.println("dream");
	}
}
