package javaStreamHandson;

import java.util.Arrays;
import java.util.List;

public class SquarenAverageofNumbers {

	
	//Here for example: 5,10,20,30, we need to find square of these using stream and applyfilter 
	//to select numbers based on condition and found average
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           List<Integer> numbers=Arrays.asList(5,10,20,30);
          double avgofsquare= numbers.stream().
                           map(e-> e*e)
                                       .filter(e->e>100).mapToInt(e->e).average().getAsDouble();
	
	  System.out.println(avgofsquare);
	}

}
