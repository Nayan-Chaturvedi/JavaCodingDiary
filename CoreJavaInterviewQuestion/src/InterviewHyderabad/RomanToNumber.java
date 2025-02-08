package InterviewHyderabad;

public class RomanToNumber
{
	public static void main(String[] args) 
	{
		String str="MCMXCVI";
		System.out.println("Conversion of MCMXCVI is : "+convert(str));
	}
	
	
	public static int convert(String str)
	{		
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if((i+1)<str.length() && getValue(ch)<getValue(str.charAt(i+1)))
			{
				sum-=getValue(ch);
			}
			else
			{
				sum+=getValue(ch);
			}
		}
		return sum;
	}
	
	
	public static int getValue(char ch)
	{
		switch(ch)
		{
		case 'I' :return 1;
		case 'V' :return 5;
		case 'X' :return 10;
		case 'L' :return 50;
		case 'C' :return 100;
		case 'D' :return 500;
		case 'M' :return 1000;
		default : return 0;		
		}
	}
}
