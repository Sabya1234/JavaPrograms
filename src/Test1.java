
public class Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar= {1,2,3,4,5};
		int v=5;
		findPair(v,ar);
	}
	
	public static void  findPair(int input,int[] ar)
	{
		int len=ar.length;
		
		for(int i=0;i<len;i++)
		{
			int sum=0;
			for(int j=i+1;j<len;j++)
			{
				sum=ar[i]+ar[j];
				if(sum==input)
				{
					System.out.print("the pair is:"+ar[i]+" "+ar[j]);
				}
			}
		}
		
	}

}
