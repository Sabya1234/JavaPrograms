package javaHandsOn;

public class ConvertIntoPhoneNumber {

	public static void main(String[] args) {
		
		//(123)-456-789
		int n=123456789;
		String a=String.valueOf(n);
		String output="("+a.substring(0,3)+")"+"-"+a.substring(3,6)+"-"+a.substring(6);
		System.out.println(output);

	}

}
