package InterviewProgram;

class Student
{
	private int id;
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void dis()
	{
		System.out.println(name);
	}
}
public class ShadowingEffect 
{
	public static void main(String[] args) 
	{
		Student std=new Student();
		std.setName("Manju");
		std.dis();
	}
}
