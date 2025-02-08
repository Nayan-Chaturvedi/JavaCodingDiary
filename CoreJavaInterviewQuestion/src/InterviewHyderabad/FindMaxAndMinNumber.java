package InterviewHyderabad;

public class FindMaxAndMinNumber {

	public static void main(String[] args) {
		
		int arr[]= {21, 34, 54, 65, 32, 12, 56 ,89, 76};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum Number : "+max+" Minimum Number :"+min);
	}
}
