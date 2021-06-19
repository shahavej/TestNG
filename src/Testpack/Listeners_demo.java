package Testpack;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Listeners_demo {

	
	@BeforeMethod
	public void bm()
	{
		
		System.out.println("i am before method");
	}
	
	@AfterMethod
	public void am() 
	{
		System.out.println("i am after method");
	}
	
	
	// this test going to fail 
	@Test
	public void t1()
	{
		assertEquals(true, false);
	}
	
	@Test
	public void t2()
	{
		
		System.out.println("this is test 2");
	}
	
	/*
		execution should be like this 
		-> i am before method
		-> after fail any test i will come into existane
		-> i am after method
		-> i am before method
		-> this is test 2
		-> i am after method
			
			
		Note : if i am going to use listeners then we must declare listeners into the xml file and run xml 
	
	
	*/
		
}
