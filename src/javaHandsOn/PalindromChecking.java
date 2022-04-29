package javaHandsOn;

import java.util.Scanner;

//without using 

public class PalindromChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a string to check palindrome");
		String inputdata= s.nextLine();
		String rev="";
		System.out.println(inputdata);
		reverseandConvertIntoCharacter(inputdata);
		
		
//		int len= inputdata.length();
//		for(int i=len;i>=1;i--)
//		{
//			rev=rev+inputdata.charAt(i-1);
//		}
//		
//		System.out.println("Reversed String is-->"+rev);
//
//		
//		
//		
//		if(inputdata.equals(rev))
//		{
//			System.out.println("String is Palindrome");
//		}
//		else
//			System.out.println("Not palindrome");
//	}
//	
	}
	public static void reverseandConvertIntoCharacter(String input)
	{
		
		
		char[] data=new StringBuilder(input).reverse().toString().toCharArray();
		for(Character s:data)
		{
			System.out.print(String.valueOf(s));
		}
		System.out.println();
		//on liner approach of string reverse using inbuild functions
		String rev=new StringBuilder(input).reverse().toString();
		System.out.println(rev);
	}

}
