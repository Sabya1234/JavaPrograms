package javaStreamHandson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinOperation {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10,4,-1,0,37);
		
		int max=num.stream().
				           mapToInt(e->e).
				                max().
				                     getAsInt();
		System.out.println(max);
		
		  int min=num.stream().mapToInt(e->e).min().getAsInt();
			System.out.println(min);

			//OR
			int max1=num.stream().max(Comparator.comparing(Integer::valueOf)).get();
			
	}

}
