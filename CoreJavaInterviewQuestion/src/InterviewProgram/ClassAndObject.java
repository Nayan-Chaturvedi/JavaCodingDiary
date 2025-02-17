package InterviewProgram;

public class ClassAndObject 
{
	public static void main(String[] args) 
	{
		B vishnu=new B();
		C jee=new C();
	
		System.out.println(vishnu instanceof B); 
		System.out.println(jee instanceof C);
		
	}
}

class B
{
	int age=24;  
	String name="Vishnu";
	
	public void method1()
	{
		System.out.println("Inside Method");
	}
}

class C
{
	int age= 76;
	String name=" Jeevitha";
	
	public void method2()
	{
		System.out.println("Inside method 2");
	}
}
