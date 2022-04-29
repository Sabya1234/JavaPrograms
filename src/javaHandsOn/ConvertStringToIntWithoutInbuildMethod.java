package javaHandsOn;

public class ConvertStringToIntWithoutInbuildMethod {

	public static void main(String[] args) {
		
		System.out.println(convertStringToInt("5789")+10);
		// TODO Auto-generated method stub

	}
	
	public static int convertStringToInt(String num)
	{
		int number=0;
		int ASCII_ZerO=48;
		for(int i=0;i<num.length();i++)
		{
			System.out.println((int)num.charAt(i));
			//return teh ASCII value 
			number=number*10+((int)num.charAt(i))-ASCII_ZerO;
						
		}
		return number;
	}

}
