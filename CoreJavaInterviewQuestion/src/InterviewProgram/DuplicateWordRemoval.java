package InterviewProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//		Input = " I am Rahul Rahul "
// 		Output = " I am Rahul "

//		HINT - SET INTERFACE DOES NOT ALLOWED DUPLICATE

class RemoveDuplicate
{
	String input="I am Rahul Rahul";
	Set<String> set=new LinkedHashSet<String>();
	
	public void removeWord()
	{
		
		
		String[] inputArr=input.split(" ");
		
		for(int i=0; i<inputArr.length; i++)
		{
			set.add(inputArr[i]);
		}
		
		Iterator<String> itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
public class DuplicateWordRemoval 
{
	public static void main(String[] args) 
	{
		RemoveDuplicate rd=new RemoveDuplicate();
		rd.removeWord();
	}
}
