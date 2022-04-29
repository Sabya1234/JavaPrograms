package javaStreamHandson;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetSecondHighestLowestNumber {

	public static void main(String[] args) {
		
		List<Integer> num= Arrays.asList(10,2,3,2,60,13,45,30,45,19,1);
		
		         int secondHighest=num.stream().sorted(Collections.reverseOrder()).
		                         distinct().skip(1).findFirst().get();
		         
		         System.out.println(secondHighest);
		         
		        int secondlowest= num.stream().sorted().distinct().skip(1).findFirst().get();
		        System.out.println(secondlowest);

	}

}
