package InterviewProgram;

class Student
{
	int num1=0;
	int num2=1;
	
	public void forLoop()
	{
		for(int i=0; i<10; i++)
		{
			int temp=num1+num2;
			System.out.println(num1);
			num1=num2;
			num2=temp;
		}
		System.out.println("\n");
	}
	
	public void whileLoop()
	{
		num1=0;
		num2=1;
		while(num1<35)
		{
			System.out.println(num1);
			int temp=num1+num2;

			num1=num2;
			num2=temp;
		}
	}
}
public class Example
{
	public static void main(String[] args)
	{
		Student std=new Student();
		std.forLoop();
		std.whileLoop();
	}
}
