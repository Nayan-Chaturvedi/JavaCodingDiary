package InterviewHyderabad;

import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {
		
		int row1;
		int coloumn1;
		int row2;
		int coloumn2;
		int a[][];
		int b[][];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("First Matrix");
		System.out.println("Enter an Row");
		row1=sc.nextInt();
		System.out.println("Enter an Coloumn");
		coloumn1=sc.nextInt();
		
		a=new int[row1][coloumn1];
		System.out.println("Enter an Element");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("You Enter");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("Second Matrix");
		System.out.println("Enter an  row");
		row2=sc.nextInt();
		System.out.println("Enter an Column");
		coloumn2=sc.nextInt();
		
		b=new int[row1][coloumn1];
		System.out.println("Enter an Element");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("You Enter");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		addTwoMatrix(a, b);
	}
	
	public static void addTwoMatrix(int a[][], int b[][])
	{
		int res[][]=new int[a.length][b.length];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
