package javaHandsOn;

public class ObtainStringByDeletingCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "BAAABAB";
		StringBuilder bs= new StringBuilder();
		char[] ar= s.toCharArray();
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i!=ar.length-1)
			{
			if(ar[i]!='A' && ar[i+1]=='A')
			{
				
				bs.append(ar[i+1]);
				count++;
				
			}
			}
		}
		System.out.println(count);
		System.out.println(bs.toString());

	}

}
