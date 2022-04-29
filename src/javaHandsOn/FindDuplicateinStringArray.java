package javaHandsOn;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateinStringArray {

	public static void main(String[] args) {
		
		String [] infra= {"Azure","GCP","Amazon","Devops","GCP","Azure","SAP","Amazon"};
		
		System.out.println("*****Brute force ***********");
		
		for(int i=0;i<infra.length;i++)
		{
			for(int j=i+1;j<infra.length;j++)
			{
				if(infra[i].equals(infra[j]))
				{
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("******Using HashSet*********");
		
		Set<String> data = new HashSet<String>();
		
		for(String e:infra)
		{
			if(data.add(e)==false)
			{
				System.out.println(e);
				
			}
		}
		
       System.out.println("**** Using HashMap******");
       
       Map<String,Integer> dataset = new HashMap<String,Integer>();
       
       for(String e:infra)
       {
    	   Integer count=dataset.get(e);
    	   if(count==null)
    	   {
    		   dataset.put(e, 1);
    	   }
    	   else {
    		   dataset.put(e, ++count);
    	   }
       }
       
       Set<Entry<String,Integer>> entryset = dataset.entrySet();
       for(Entry<String,Integer> e:entryset)
       {
    	   if(e.getValue()>1)
    	   {
    		   System.out.println(e.getKey());
    	   }
       }
       
       System.out.println("Using Stream frequency");
       
       List<String> inputset = Arrays.asList(infra);
      Set<String> value= inputset.stream().filter(e->Collections.frequency(inputset,e)>1).collect(Collectors.toSet());
       System.out.println(value);
	}

}
