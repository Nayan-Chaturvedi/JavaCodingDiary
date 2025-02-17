package InterviewHyderabad;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindMaxNumber {
	public static void main(String[] args) {
		
		int numOfRows;
		int numOfCol;
		int[][] inputArray;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number of row in Matrix : ");
		numOfRows=sc.nextInt();
		
		System.out.println("Enter number of coloumn in matrix : ");
		numOfCol=sc.nextInt();
		
		inputArray=new int[numOfRows][numOfCol];
		
		System.out.println("Enter an Matrix Element");
		for(int i=0; i<numOfRows; i++)
		{
			for(int j=0; j<numOfCol; j++)
			{
				inputArray[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display matrix : ");
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfCol; j++) {
				System.out.print(inputArray[i][j]);
			}
			System.out.println();
			
		}
		
		findMaxNumFromEachRow(inputArray);
		
	}
	
	public static void findMaxNumFromEachRow(int inputArr[][])
	{
		int[] arr=new int[inputArr.length];
		for (int i = 0; i < arr.length; i++) {
			int maxNumber=inputArr[i][0];
			for (int j = 0; j < arr.length; j++) {
				if(maxNumber<inputArr[i][j])
				{
					maxNumber=inputArr[i][j];
				}
			}
			System.out.println(maxNumber);
		}
	}
}
