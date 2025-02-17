package InterviewProgram;

import java.util.ArrayList;
import java.util.List;

// 			How you will make object immutable ?

// 			Immutable object means jo ek baar assign ho jaye to then Object Value na change ho paye

class MyStudent
{
	private int id;
	List<String> al;
	
	public MyStudent(int id, List<String> al)
	{
		this.id=id;
		this.al=new ArrayList<String>(al);
	}
	
	public List<String> getList()
	{
		return new ArrayList<String>(al);
	}
	@Override
	public String toString()
	{
		return "MyStudent [ ID : "+id+" | List Of Student : "+al+" ]";
		
	}
}

public class ObjectMakeImmutable 
{
	public static void main(String[] args) 
	{
		List<String> al1=new ArrayList<String>();
		al1.add("Vikas");
		al1.add("Anoop");
		MyStudent ms=new MyStudent(101, al1);
		System.out.println(al1);
		
		//Access data
		al1.add("New Element");
		System.out.println(al1);
		System.out.println(ms);
		
		System.out.println("-----------------");
		// Access data using method
		
		List<String> list=ms.getList();
		list.add("Element add");
		System.out.println(list);
		System.out.println(ms.getList());
		
		
	}
}
