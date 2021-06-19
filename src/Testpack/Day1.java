package Testpack;

import org.testng.annotations.Test;

public class Day1 {

	
	@Test(groups= {"Smoke"})
	public void t1()
	{
		System.out.println("wakeup");
	}
	
	@Test
	public void t2 ()
	{
		System.out.println("brushing");
	}
	
}
