package J_Unit_.testt;

public class CalculatorService 
{
	public static int addTwNumber(int a, int b)
	{
		return a+b;
	}
	
	public static int productTwoNumber(int a, int b)
	{
		return a*b;
	}
	
	public static int sumAnyNumber(int ...numbers)
	{
		int sum=0;
		for(int n:numbers)
		{
			sum+=n;
		}
		return sum;
	}
}
