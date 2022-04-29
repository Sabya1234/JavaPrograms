package javaStreamHandson;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,10,3,2,2,15,13,30,7,30,10,45);
		
		Set<Integer> duplicate=num.stream().filter(e->Collections.frequency(num, e)>1).collect(Collectors.toSet());
		
		System.out.println(duplicate);
		
//		Set<Integer> dupNum= new HashSet<Integer>();
//		
//		Set<Integer>duplicate=num.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet());
//		
//		System.out.println(duplicate);
	

	}

}
