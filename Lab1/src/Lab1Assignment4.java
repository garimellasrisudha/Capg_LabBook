/**
 * Create a method to check if a number is a power of two or not
 * @author SUDHA
 *
 */

public class Lab1Assignment4 {
	public static void main(String args[])
	{
		System.out.print(checkNumber(32));
	}

	private static boolean checkNumber(int n) {
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
				
			
		}
		return true;
		// TODO Auto-generated method stub
		
	}
	
	

}
