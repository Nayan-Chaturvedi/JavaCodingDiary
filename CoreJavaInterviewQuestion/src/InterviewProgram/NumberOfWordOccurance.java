package InterviewProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//		Input = "aabbbc"
//		Output = "a2b3c1"

public class NumberOfWordOccurance 
{
	public static void main(String[] args)
	{
		String input="aabbbc";
		
		numberOfWord(input);
	}
	
	public static void numberOfWord(String input)
	{
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0; i<input.length(); i++)
		{
			char ch=input.charAt(i);
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
