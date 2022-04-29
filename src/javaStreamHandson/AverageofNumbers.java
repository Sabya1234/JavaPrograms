package javaStreamHandson;

import java.util.Arrays;
import java.util.List;

public class AverageofNumbers {

	//sumof all numers/total numbers count
	
	/*You can not perform arithmatic operation on stream for that you need to convert to stream 
	to Integer/String/Double */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,20,34,56,75);
		
		double avg =numbers.stream().mapToInt(e->e).average().getAsDouble();
		
		System.out.println(avg);
		
	}

}
