package javaHandsOn;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		
		 Scanner sc1 = new Scanner(System.in);
         System.out.println("Enter the Number of rows you want to print the pattern:");
         int rows=sc1.nextInt();
         printRightTriangle(rows);
         System.out.println();
         printInvertedRightTriangle(rows);
         System.out.println();
         printLeftHalfDiamondPattern(rows);
         System.out.println();
         printPyramid(rows);
         System.out.println();
         printInvertedPyramid(rows);
         System.out.println();
         printDiamondPattern(rows);

	}
	
	/**
	 *         *
	 *        **
	 *       ***
	 *      ****
	 */
	public static void printRightTriangle(int rows)
	{
		for (int i=1;i<=rows;i++)
		{
			for(int j=rows-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	/**
	 *        *****
	 *         ****
	 *          ***
	 *           **
	 *            *
	 */
	public static void printInvertedRightTriangle(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=rows;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void printLeftHalfDiamondPattern(int rows)
	{
		for (int i=1;i<=rows;i++)
		{
			for(int j=rows-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=1;i<=rows-1;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=rows-1;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	/** put a space before every"*" from left side pattern , it will create pyramid
	 *         *                *
	 *        **  ->           * * 
	 *       ***              * * *  
	 *      ****             * * * *
	 */
	
	public static void printPyramid(int rows)
	{
		for (int i=1;i<=rows;i++)
		{
			for(int k=rows-1;k>=i;k--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	/**
	 *        *****        * * * * *
	 *         ****  ->     * * * *
	 *          ***          * * *
	 *           **           * *
	 *            *            *
	 */
	public static void printInvertedPyramid(int rows)
	{
		
		for (int i=1;i<=rows;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=rows;j>=i;j--)
             {
				System.out.print(" *");
			  }
			System.out.println();
		}
	}

	/**
	 *            
	 *            *             *
	 *           **            * *
	 *          ***    ->     * * *
	 *         ****          * * * * 
	 *          ***           * * *
	 *           **            * *
	 *            *             *
	 */
	public static void printDiamondPattern(int rows)
	{
		for (int i=1;i<=rows;i++)
		{
			for(int k=rows-1;k>=i;k--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i=1;i<=rows-1;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=rows-1;j>=i;j--)
             {
				System.out.print(" *");
			  }
			System.out.println();
		}
	}
}
