
public class Lab2Assignment3 {
	public static void main(String[] args)
	{
		char[] c= {'4','5','6','8','2'};
		int[] val= new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			val[i]=(int)c[i];
		}
		for(int i=0;i<val.length-1;i++)
		{
			
			val[i]=Math.abs(val[i]-val[i+1]);
			System.out.println(val[i]);
		}
		System.out.println(val[val.length-1]);
			
		
	}
}
