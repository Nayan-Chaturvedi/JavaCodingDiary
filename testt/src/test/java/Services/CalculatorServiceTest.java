package Services;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import J_Unit_.testt.CalculatorService;
import junit.framework.Assert;

public class CalculatorServiceTest
{
	// Test method of add two number
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("Before all test cases");
		System.out.println("Started test"+new Date());
	}
	
	@Test
	public void addTwoNumberTest()
	{
		System.out.println("Add 2 Numbers");
		int res=CalculatorService.addTwNumber(12, 38);
		
		//Expected Result
		int expected=50;
		//Actual Result
		Assert.assertEquals(expected, res);
		
		
		
	}
	@Before
	public  void beforeEachCase()
	{
		System.out.println("------");
	}
	@Test
	public void sumAnyNumbersTest()
	{
		System.out.println("Sum any numbers");
		int res=CalculatorService.sumAnyNumber(2, 7, 8, 9);
		//ExpectedResult
		int expectedRes=26;
		//ActualResult
		Assert.assertEquals(expectedRes, res);
		
	}
	
	@AfterClass
	public  static void cleanUp()
	{
		System.out.println("After all cases");
	}
}
