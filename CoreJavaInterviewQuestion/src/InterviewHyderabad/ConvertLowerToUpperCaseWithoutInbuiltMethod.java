package InterviewHyderabad;

import java.util.Scanner;

public class ConvertLowerToUpperCaseWithoutInbuiltMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an String");
		String str=sc.nextLine();
		char arrChar[]=str.toCharArray();
		
		// Check char is Lower case or not? If its LowerCase then we convert into uppercase
		for(int i=0; i<arrChar.length; i++)
		{
			if(arrChar[i]>='a' && arrChar[i]<'z')
			{
				//Small a ASCII value is : 97
				// Capital A ASCII Value is : 65
				// So we convert a -> A to hame (97-65=32) 32 sub karna hoga
				
				
				arrChar[i]-=(char)32;  //TypeCast 
				
			}
			
		}
		str=new String(arrChar);
		System.out.println(str);
	}
}
