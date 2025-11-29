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


// Convert List to Map

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {
      List<Character> al=Arrays.asList('A', 'C', 'D', 'Q');
      Map<Integer, Character> map=new LinkedHashMap();
      for(int i=0; i<al.size(); i++)
      {
          map.put(i, al.get(i));
      }
      System.out.println(map);
    }
}


// Remove Special Characters

public class Main {
    public static void main(String[] args) {
        String s = "Na$ya@n#123";

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
