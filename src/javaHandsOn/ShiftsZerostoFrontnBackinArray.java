package javaHandsOn;

import java.util.Arrays;

public class ShiftsZerostoFrontnBackinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shiftsZerotoBack(new int[]{1,4,0,5,0});
		shiftsZerotoFront(new int[]{1,4,0,5,0});
	}
	
	public static void shiftsZerotoBack(int[]inputArray)
	{
		
		int pos=0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]!=0)
			{
				inputArray[pos++]=inputArray[i];
			}
		}
		System.out.println(pos);
		while(pos<inputArray.length)
		{
			inputArray[pos]=0;
			pos++;
		}
		System.out.println(Arrays.toString(inputArray));
	}
	
	public static void shiftsZerotoFront(int[]inputArray)
	{
		
		int pos=inputArray.length-1;
		for(int i=inputArray.length-1;i>=0;i--)
		{
			if(inputArray[i]!=0)
			{
				inputArray[pos--]=inputArray[i];
			}
		}
		System.out.println(pos);
		while(pos>=0)
		{
			inputArray[pos]=0;
			pos--;
		}
		System.out.println(Arrays.toString(inputArray));
	}

}
