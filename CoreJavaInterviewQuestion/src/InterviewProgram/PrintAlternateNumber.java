package InterviewProgram;

import java.util.Scanner;

public class PrintAlternateNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Number");
		int num=sc.nextInt();
		
		alternateNumber(num);
	}
	
	public static void alternateNumber(int num)
	{
		for(int i=0; i<=num; i++)
		{
			System.out.print(i+" ");
			i++;
		}
	}
}
