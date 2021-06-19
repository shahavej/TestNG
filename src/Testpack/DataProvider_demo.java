package Testpack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_demo {

	@Test(dataProvider="getdata")
	public void t1(String un, String pwd)
	{
		System.out.println(un);
		System.out.println(pwd);
		System.out.println("--------------------");
	}

	@DataProvider
	public Object[][] getdata()
	{

		Object[][] data= new Object[3][2];

		//1st set
		data[0][0]="1st Username";
		data[0][1]="1st password";	

		//2nd set
		data[1][0]="2nd Username";
		data[1][1]="2nd password";
		
		//3rd set
		data[2][0]="3rd Username";
		data[2][1]="3rd password";
		return data;
	}

}
