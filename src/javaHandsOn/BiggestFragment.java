package javaHandsOn;

import java.util.ArrayList;
import java.util.List;

public class BiggestFragment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        
		  String s="10101";
		        char[] ar= s.toCharArray();
		       List<Integer> ar1= new ArrayList();
		        for(int i=0;i<ar.length;i++)
		        {
		        	if(i!=ar.length-1)
		        	{
		            StringBuilder bs=new StringBuilder();
		            bs.append(ar[i]);
		            bs.append(ar[i+1]);
		            ar1.add(Integer.parseInt(bs.toString()));
		        	}
		        }
		        int biggestFragment=Integer.MIN_VALUE;
		        for(Integer arr:ar1)
		        {
		            if(arr>biggestFragment)
		            {
		                biggestFragment=arr;

		            }
		        }
		       
		    System.out.println(biggestFragment);
		
	}

}
