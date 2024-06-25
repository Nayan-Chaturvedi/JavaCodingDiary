package InterviewProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class Sort
{
	Map<String, Integer> map=new HashMap<String, Integer>();
	Scanner sc=new Scanner(System.in);
	int size;
	
	public void input()
	{
		map.put("Student1", 97);
		map.put("Student18", 66);
		map.put("Student8", 45);
		map.put("Student2", 50);
		
		System.out.println("Before sort ");
		Set set1=map.entrySet();
		Iterator itr1=set1.iterator();
		
		System.out.println("KEY \t value");
		while(itr1.hasNext())
		{
			Map.Entry dataBeforeSort=(Entry) itr1.next();
			System.out.println(dataBeforeSort.getKey()+" : "+dataBeforeSort.getValue());
		}
		System.out.println();
	}
	
	public void sort()
	{
		Map<String, Integer> sortedMap= map.entrySet().stream().sorted(Map.Entry.comparingByKey((String name1, String name2)->name1.compareToIgnoreCase(name2)))
		.collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (e1,e2)->e1, LinkedHashMap :: new));
		// Explain
		

/*			map.entrySet().stream(): Isse map ke entries ko ek stream mein convert kiya jaata hai.
 			 entrySet() method ek Set of map entries laata hai, aur stream() isse ek stream mein convert karta hai.
			.sorted(Map.Entry.comparingByValue()): Isse entries ko unke values ke basis par sort kiya jaata hai
			. comparingByValue() method har entry ke values ko compare karta hai.
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
			 (e1, e2) -> e1, LinkedHashMap::new)): Isse sorted entries ko ek naye LinkedHashMap mein collect kiya jaata hai.
			  toMap collector ek naya map banata hai jahan keys original entries ke keys se li jaati hain 
			  (Map.Entry::getKey) aur values original entries ke values se li jaati hain (Map.Entry::getValue). 
			  (e1, e2) -> e1 merge function ensure karta hai ki agar duplicate keys hain, toh pehli occurrence ko retain kiya jaaye.
			Sankshipt mein, yeh code snippet original map ke entries ko unke values ke basis par sort karta hai aur unhe ek naye LinkedHashMap mein store karta hai.*/
		
		
		//		ACCESS DATA
		
		System.out.println("After sort");
		Set set=sortedMap.entrySet();
		Iterator itr=set.iterator();
		
		System.out.println("KEY \t  VALUE");
		while(itr.hasNext())
		{
			Map.Entry data=(Entry) itr.next();
			System.out.println(data.getKey() +" :  "+ data.getValue());
		}
	}
	
}	
	
public class SortDataUsingHashMap
{
	public static void main(String[] args) 
	{
		Sort s=new Sort();
		s.input();
		s.sort();
		
		
		
	}
}