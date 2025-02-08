package InterviewProgram;


//		200
//		400	600
//		300
//		600	900	1200
//		400
//		800	1200 1600 2000

class PrintSeries
{
	public void series()
	{
		for(int i=2; i<5; i++)
		{
			for(int j=1; j<i+2; j++)
			{
				if(j==1)
				{
					System.out.println(i*j*100);
				}
				else
				{
					System.out.print(i*j*100+" ");
				}
			}
			System.out.println();
		}
	}
}

public class Series 
{
	public static void main(String[] args)
	{
		PrintSeries ps=new PrintSeries();
		ps.series();
	}
	
}
