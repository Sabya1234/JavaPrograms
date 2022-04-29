package javaHandsOn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceofcharactersInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="Gladiator";
		
		Map<Character,Integer> occurence =new HashMap<Character,Integer>();
		
		char[] charactersofData= data.toCharArray();
		
		for(char ch:charactersofData)
		{
			if(occurence.containsKey(ch))
			{
				occurence.put(ch,occurence.get(ch)+1);
			}
			else {
				occurence.put(ch,1);
			}
		}
		
		System.out.println(occurence);
		
		Set<Entry<Character,Integer>> entryset = occurence.entrySet();
		
		for(Entry<Character,Integer> entry:entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}

	}

}
