package InterviewHyderabad;

public class SecondHighestSalary {

	public static void main(String[] args) {
	       int[] salaries = {2, 4, 2, 5, 6, 4, 7, 8, 9, 9, 9, 9};
	       
	       int highest=0;
	       int secondHighest=-1;
	       
	       for(int i=1; i<salaries.length; i++)
	       {
	    	   if(salaries[i]>highest)
	    	   {
	    		   secondHighest=highest;
	    		   highest=salaries[i];
	    	   }
	       }
	       System.out.println("second height"+secondHighest+" "+highest );
	}
}
