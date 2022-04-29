package javaStreamHandson;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,20,35,75,-23);
		
		Optional<Integer> sum=numbers.stream()
		        	                      .reduce((a,b) -> a+b);
		                       
                 System.out.println(sum.get());
                 
       //another way
                 int sumofNumbers=numbers.stream().mapToInt(e-> e).sum();      //.average().getAsDouble();
         		  System.out.println(sumofNumbers);
	}

}
