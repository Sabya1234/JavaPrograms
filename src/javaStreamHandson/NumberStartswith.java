package javaStreamHandson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//222,224,675,423,214
public class NumberStartswith {
	
	  public static void main(String [] args)
	  {
		  List<Integer> num=  Arrays.asList(-220,222,224,675,423,214);
		  
		  		List<Integer> value= num.stream().map(e->String.valueOf(e))
		  					             .filter(e-> e.startsWith("2") || e.startsWith("-2"))
		  					                 .map(Integer::valueOf).collect(Collectors.toList());
		  					           
	           System.out.println(value);
	  
	  }
	               

}
