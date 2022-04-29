package javaStreamHandson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = Arrays.asList(10,22,2,3,6,8,13,45);
		List<Integer>firstthreenum=num.stream().limit(3).collect(Collectors.toList());
		System.out.println(firstthreenum);
		
		int sumoffirstthree=firstthreenum.stream().reduce((p,q)->p+q).get();
		System.out.println(sumoffirstthree);
		
		List<Integer>skipfirstthree=num.stream().skip(3).collect(Collectors.toList());
		System.out.println(skipfirstthree);

	}

}
