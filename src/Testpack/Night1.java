package Testpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Night1 {

	
	@Test (groups= {"Smoke"})
	public void t1()
	{
		System.out.println("walk");
	}
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void bm(String un,String pwd)
	{
		System.out.println("i am before method");
		System.out.println("username :"+un);
		System.out.println("password :"+pwd);
	}
	@AfterMethod
	public void am() {
		System.out.println("i am after method");
	}
	@Test
	public void t2()
	{
		System.out.println("gym");
	}
	@Test(groups= {"Smoke"})
	public void t3()
	{
		System.out.println("dinner");
	}
}
