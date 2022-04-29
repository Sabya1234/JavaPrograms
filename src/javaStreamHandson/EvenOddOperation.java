package javaStreamHandson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(34,75,23,8,2,90);
		
		List<Integer>even=numbers.stream()
		              .filter(e->e%2==0)
		                             .collect(Collectors.toList());
		
		System.out.println(even);
		
		List<Integer> odd = numbers.stream().filter(e->e%2!=0).collect(Collectors.toList());
		
		System.out.println(odd);

	}

}
