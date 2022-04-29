package javaHandsOn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftNonZeroInDifferentArray {

	//{1,0,2,4,0,6,0}=> {1,2,4,6,0,0,0}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] givenNum={1,0,4,7,0,8,0};
		ExtractNonInteger(givenNum);
	}
	
	public static void ExtractNonInteger(int[] num)
	{
		Integer[] secondArray ;
		List<Integer> output= new ArrayList<Integer>();
		int j=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=0)
			{
				output.add(Integer.valueOf(num[i]));
				j++;
			}
		}
		System.out.println(j);
		secondArray=output.toArray(new Integer[output.size()]);
		for(int k=0;k<secondArray.length;k++)
		{
			System.out.println(secondArray[k]);
		}
		
		
	}

}
