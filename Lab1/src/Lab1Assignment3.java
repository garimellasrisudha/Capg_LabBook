/**
 * 
 * 
 *Create a method to check if a number is an increasing number
 */
public class Lab1Assignment3 
{
	public static void main(String args[])
	{
		int number=123;
	
		System.out.print(checkNumber(number));
		
		
	}

	private static boolean checkNumber(int num) 
	{
		
		int currentDigit = num % 10;
	       num = num/10;
	       
	        while(num>0)
	        {
	          if(currentDigit <= num % 10)
	          {
	               
	               return false;
	           }
	          currentDigit=num%10;
	          num=num/10;
	        }
	          return true;
	 
		
	}
}
	
		// TODO Auto-generated method stub
		
	


