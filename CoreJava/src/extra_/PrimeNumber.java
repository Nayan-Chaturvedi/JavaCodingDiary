package extra_;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Limit");
		int limit = sc.nextInt();
		
		primeNumber(limit);
		sc.close();
	}
	
	public static void primeNumber(int limit)
	{
		for(int i= 1; i<= limit; i++)
		{
			boolean flag =true;
			
			for(int j= 2; j< i; j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.print(i+ " ");
			}
		}
	}

}


// All Zero in End

class Main {
    public static void main(String[] args) {
         int num[]={2, 3, 0, 2, 0, 5, 0, 8, 0, 9, 0};
         int res[]=new int[num.length];
         int j=0;
         
         for(int i=0; i<num.length; i++)
         {
             if(num[i]!=0)
             {
                res[j++]=num[i]; 
             }
         }
         for(int i=0; i<res.length; i++)
         {
             System.out.println(res[i]);
         }
    }
}
