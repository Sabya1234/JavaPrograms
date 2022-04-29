package javaHandsOn;

import java.util.Arrays;
import java.util.Scanner;

public class Print2DMatrix {

	public static void main(String[] args) {
		System.out.println("Enter no of rows");
		Scanner in = new Scanner(System.in);
		int rows= in.nextInt();
		System.out.println("Enter no of Column");
		Scanner ins = new Scanner(System.in);
		int column= ins.nextInt();

		int [][]data= new int[rows][column];

		System.out.println("Enter the Number you want to put in Matrix");
		for (int i=0;i<rows;i++)
			for(int j=0;j<column;j++)
			{
				Scanner sc= new Scanner(System.in);
				data[i][j]=sc.nextInt();
				
			}
		
		
			
		
      System.out.println("The matrix is::");
//		for(int[] r :data)
//		{
//			for(int x:r)
//			{
//				System.out.print(x+" ");
//		    }
//		  System.out.println();
//		}

	for(int[] r:data)
	{
		System.out.println(Arrays.toString(r));
	}


	}

}
