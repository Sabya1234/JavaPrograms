package javaStreamHandson;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumByASCnDesc {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(10,38,2,7,49,23);
		
		List<Integer> sortedASC=num.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedASC);
	
		List<Integer> DescOrder=  num.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(DescOrder);

	}

}
