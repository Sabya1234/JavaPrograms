package javaHandsOn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li= Arrays.asList(4,0,1,8,6,3,7,0);
		int key= li.get(0);
		
		List<Integer> as= new ArrayList<Integer>(li);
		as.remove(0);
		as.add(key);
		
		System.out.println(as.toString());

	}

}
