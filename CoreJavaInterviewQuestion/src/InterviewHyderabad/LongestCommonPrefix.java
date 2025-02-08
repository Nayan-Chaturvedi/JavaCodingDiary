package InterviewHyderabad;

import java.util.Arrays;

public class LongestCommonPrefix 
{
	
	public static void main(String[] args) 
	{
		String str[]= {"flower", "flow", "flight"};
		System.out.println("Longest Prfix is : "+ longestPrfix(str));
		
	}
	
	public static String longestPrfix(String str[])
	{
		 // Hamne array ko sort ish karan se kiya kyoki jo 0 index par String hoga aur
		//  jo last index par String hoga. Hamme unhi me Common prifix search karna hai.
		//	 	Middle ke to apne aap ho jaege					
		
		Arrays.sort(str);	// flight, flow, flower
		String str1=str[0];
		String str2=str[str.length-1];
		int index=0;
		
		while(index<str1.length())
		{
			if(str1.charAt(index) == str2.charAt(index))
			{
				index++;
			}
			else
			{
				break;
			}
		}
		
		return index==0?"No common prefix":str1.substring(0, index);
		
		
		
		
							
	}

}
