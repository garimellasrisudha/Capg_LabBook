/**
*Create a class with a method to find the difference between 
*the sum of the squares and the square of the sum of the first n natural numbers.
*
*
*/
public class Lab1Assignment2 {
	public static void main(String [] args)
	
	{
		int num = 10;
		int n=calculateDifference(num);
		System.out.print(n);
		
		
	}

	private static int calculateDifference(int num) 
	{
		int sum=0;
		int sum2=0;
		for(int i=1;i<=num;i++)
		{
			sum+=(i*i);
			sum2+=i;
			
			
		}
		
		// TODO Auto-generated method stub
		return (sum-(sum2*sum2));
	}

	
	

}
