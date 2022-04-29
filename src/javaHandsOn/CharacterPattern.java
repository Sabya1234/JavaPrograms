package javaHandsOn;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		 Scanner sc1 = new Scanner(System.in);
         System.out.println("Enter the Number of rows you want to print the pattern:");
         int rows=sc1.nextInt();
         printLeftTriangleCharacterPattern(rows);
         System.out.println();
         printInvertedLeftTrianglePattern(rows);
         System.out.println();
         printSameCharacterTriangle(rows);
         System.out.println();
         printRighttriangleCharacterPattern(rows);
         System.out.println();
         printLeftDiamondPattern(rows);
         System.out.println();
         printCharacterPyramid(rows);

	}
	/**
	 *    A
	 *    A B
	 *    A B C
	 *    A B C D 
	 *    
	 */
	public static void printLeftTriangleCharacterPattern(int rows)
	{
		int alpha=65;
		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void printInvertedLeftTrianglePattern(int rows)
	{
		
		for(int i=0;i<rows;i++)
		{
			int alpha=65;
			for(int j=rows-1;j>=i;j--)
			{
				System.out.print((char)(alpha)+" ");
				alpha++;
				
			}
			System.out.println();
		}
		
	}
	
	public static void printSameCharacterTriangle(int rows)
	{
		int alpha=65;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)alpha+" ");
			}
			alpha++;
			System.out.println();
		}
		
	}
	
   public static void printRighttriangleCharacterPattern(int rows)
   {
	   int alpha=65;
	   for(int i=0;i<rows;i++)
	   {
		   for(int j=rows-1;j>i;j--)
		   {
			   System.out.print(" ");
		   }
		   for(int k=0;k<=i;k++)
		   {
			   System.out.print((char)(alpha+k));
		   }
		   System.out.println();
	   }
	   
   }
   public static void printLeftDiamondPattern(int rows)
   {
	   int alpha=65;
	   for(int i=0;i<rows;i++)
	   {
		   for(int j=rows-1;j>i;j--)
		   {
			   System.out.print(" ");
		   }
		   for(int k=0;k<=i;k++)
		   {
			   System.out.print((char)(alpha+k));
		   }
		   System.out.println();
	   }
	   for(int i=1;i<rows;i++)
	   {
		   int alpha1=65;
		   for(int j=0;j<i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int k=rows-1;k>=i;k--)
		   {
			   System.out.print((char)alpha1);
			   alpha1++;
		   }
		   System.out.println();
	   }
	   
   }
   
   public static void printCharacterPyramid(int rows)
   {
	   int alpha=65;
	   for(int i=0;i<rows;i++)
	   {
		   for(int j =rows-1;j>i;j--)
		   {
			   System.out.print(" ");
		   }
		   for(int k=0;k<=i;k++)
		   {
			   System.out.print((char)(alpha+k)+" ");
		   }
		   System.out.println();
	   }
	   
   }
}
