package InterviewProgram;

//		Input string= "This is Nayan This is Nayan"
//		Output = this is nayan  THIS IS NAYAN
public class firstHalfInUpperCaseAndAnotherOneInLowerCase 
{
	public static void main(String[] args)
	{
		String string="This is Nayan This is Nayan";
		firstHalfInUpperCaseAndAndAnotherHalfInLowerCase(string);
	}
	
	public static void firstHalfInUpperCaseAndAndAnotherHalfInLowerCase(String string)
	{
		int mid= string.length()/2;
		
		String lowerCase="";
		String upperCase="";
		
		for(int i=0; i<string.length(); i++)
		{
			if(i<mid)
			{
				lowerCase+= Character.toLowerCase(string.charAt(i));
			}
			else
			{
				upperCase+= Character.toUpperCase(string.charAt(i));
			}
		}
		
		System.out.println(lowerCase+" "+upperCase);
	}
}

