package javaHandsOn;

public class SwapTwoString {

	public static void main(String[] args) {
		
		String firstData="WelcomeHome";
		String secondData="Buddy";
		
		firstData=firstData+secondData;
		secondData=firstData.substring(0,(firstData.length()-secondData.length()));
		firstData=firstData.substring(secondData.length());
		System.out.println(firstData +" "+secondData);

	}

}
