package InterviewHyderabad;

// Find First Non-repeted character in given String

public class FindNonRepeatedCharacter {
	public static void main(String[] args) {
		String input="AABCDBE";
		
		for(int i=0; i<input.length(); i++)
		{
			boolean flag=true;
			for(int j=0; j<input.length(); j++)
			{
				if(i!=j &&input.charAt(i)==input.charAt(j))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(input.charAt(i));
//				Output=CDE
			}
		}
	}
}
