package javaHandsOn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTextFromParenthesis {

	public static void main(String[] args) {
		
		String data ="I see a lot of colors in this string. I see (blue) and some times I also see (black). May be if I take a closer look, I may see (Orange)";
		// TODO Auto-generated method stub
         Matcher m = Pattern.compile("\\((.*?)\\)").matcher(data);
         while(m.find())
         {
        	 System.out.println(m.group(1));
         }
	}

}
