package javaHandsOn;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       isAnagram("L isten","SILENT");
       isAnagram("Triangle","Integral");
       isAnagram("cat","tact");
	}
	
	public static void isAnagram(String word1,String word2)
	{
		String first=word1.replaceAll("\\s+","");
		String second=word2.replaceAll("\\s+","");
		boolean status=true;
		
		if(first.length()!=second.length())
		{
			status=false;
		}
		else {
			
			char[] s1=first.toLowerCase().toCharArray();
			char[] s2=second.toLowerCase().toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			status=Arrays.equals(s1, s2);
		}
		
		if(status)
		{
			System.out.println(word1+"  and "+word2+" perfectly anagram");
		}
		else {
			System.out.println(word1+" and "+word2+" are not anagram");
		}
		
		
	}

}
