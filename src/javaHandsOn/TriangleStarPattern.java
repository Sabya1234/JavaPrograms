package javaHandsOn;

import java.util.Scanner;

public class TriangleStarPattern {

	/*
	 *    *         *****        *
	 *    **        ****         **
	 *    ***       ***          ***
	 *    ****      **           *****
	 *    *****     *            ****
	 *                           ***
	 *                           **
	 *                           *        
	 */
	public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number of rows you want to print the pattern:");
         int rows=sc.nextInt();
        // printLeftTriangle(rows);
         //printInvertedLeftTriangle(rows);
         printRightDiamondPattern(rows);
	}
         
         public static void printLeftTriangle(int rows)
         {
         for(int i=1;i<=rows;i++)
         {
        	 for (int j=1;j<=i;j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }

         }
         public static void  printInvertedLeftTriangle(int rows)
         {
        	 for(int i=1;i<=rows;i++)
        	 {
        		 for(int j=rows;j>=i;j--)
        		 {
        			 System.out.print("*");
        		 }
        		 System.out.println();
        	 }
         }
         public static void printRightDiamondPattern(int rows)
         {
        	 for(int i=1;i<=rows;i++)
             {
            	 for (int j=1;j<=i;j++)
            	 {
            		 System.out.print("*");
            	 }
            	 System.out.println();
             }
        	 for(int i=1;i<=rows-1;i++)
        	 {
        		 for(int j=rows-1;j>=i;j--)
        		 {
        			 System.out.print("*");
        		 }
        		 System.out.println();
        	 }
        	 
         }
         

}
