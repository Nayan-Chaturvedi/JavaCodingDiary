package InterviewProgram;

// Series : 1 2 3 4 5 4 3 2 1
class Program
{
	
	// Yaha j ko 9 se start kiya hai.
	// Let suppose agar hum j ko 4 se start karte to jab i=4 hota tab j=1 hota 
	// i=5 tab j=0 and then i=5,7,8,9 per j=-1, -2, -3, -4 print hota 
	// Ish reason se j ko 9 se start kiya hai
	
	public void output()
	{
//		for(int i=1, j=4; i<=9; i++, j--)
//		{
//			if(i<=5)
//			{
//				System.out.print(i+" ");
//			}
//			else
//			{
//				System.out.print(j+" ");
//			}
//		}
		
		// Output = 1 2 3 4 5 -1 -2 -3 -4 
		
		
		for(int i=1, j=9; i<=9; i++,j--)
		{
			if(i<=5)
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(j);
			}
		}
		
		// Output = 1 2 3 4 5 4 3 2 1 
		

	}
}
public class Series2 
{

	public static void main(String[] args) 
	{
		Program p=new Program();
		p.output();
				
	}

}
