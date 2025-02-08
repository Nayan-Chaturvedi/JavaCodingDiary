package InterviewHyderabad;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
	int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
         mergeArrays(array1, array2);
	}
	
	public static void mergeArrays(int arr1[], int arr2[])
	{
		int len1=arr1.length;
		int len2=arr2.length;
		int res[]=new int[len1+len2];
		int i=0, j=0, k=0;
		

        // Traverse both arrays
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of array1, if any

        // Copy remaining elements of array2, if any
        while (j < len2) {
            res[k++] = arr2[j++];
        }
        
        for(int x=0; x<res.length; x++)
        {
        	System.out.print(res[x]);
        }
	}
}
