package InterviewProgram;

import java.util.HashMap;
import java.util.Map;

// 		Input = {2, 5, 6, 7, 11, 8, 2, 9, 5, 7}
//		Hint = We are creating HashMap, Key as a ArrayElement and Value will contain number of 
//				Value of Occurance these ArrayElement. If Occurance is more than one this means 
//				this key is duplicate


public class DuplicateInArrayUsingHashMap 
{
	public static void main(String[] args)
	{
		int inputArr[]={2, 5, 6, 7, 11, 8, 2, 9, 5, 7};
		
		findDuplicateUsingHashMap(inputArr);
		
		
	}
	
	public static void findDuplicateUsingHashMap(int arr[])
	{
		Map<Integer, Integer> map=new HashMap();
		
		for(int x : arr)
		{
			if(!map.containsKey(x))
			{
				map.put(x, 1);
			}
			else
			{
				map.put(x, map.get(x)+1);
			}
		}
		
		for(int x: map.keySet())
		{
			if(map.get(x)>1)
			{
				System.out.println("Duplicate Element is : "+x);
			}
		}
	}

}
