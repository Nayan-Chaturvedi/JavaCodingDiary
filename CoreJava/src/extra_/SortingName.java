package extra_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NameSort
{
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	String name;
	int ch;
	
	public void input()
	{
		while(true)
		{
			System.out.println("You want to add name");
			System.out.println("\t 1. Yes \t 2. No");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter an Name");
				name=sc.next();
				al.add(name);
				break;
			}
			case 2:
			{
				System.out.println("Before Sort : "+ al);
				return;
			}
			}
		}
	}
	
	public void sort()
	{
		for(int i=0; i<al.size(); i++)
		{
			for(int j=i+1; j<al.size(); j++)
			{
				String name1=al.get(i);
				String name2=al.get(j);
				
				int res=name1.compareToIgnoreCase(name2);
				if(res>0)
				{
					al.set(i, name2);
					al.set(j, name1);
				}
			}
		}
		System.out.println("After sort : "+al);
	}
	
}

public class SortingName 
{
	public static void main(String[] args)
	{
		NameSort n=new NameSort();
		n.input();
		n.sort();
	}
}
