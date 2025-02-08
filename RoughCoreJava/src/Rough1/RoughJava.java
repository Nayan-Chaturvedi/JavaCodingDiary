package Rough1;

import java.util.HashMap;
import java.util.Map;

public class RoughJava 
{
	public static void main(String[] args) 
	{
		int inputArr[]={2, 5, 6, 7, 11, 8, 2, 9, 5, 7};
		duplicateNumber(inputArr);
	}
	
	public static void duplicateNumber(int arr[])
	{
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
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
		
		for(int xx : map.keySet())
		{
			if(map.get(xx)>1)
			{
				System.out.println(xx);
			}
		}
	}
	
}
