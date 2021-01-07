import java.util.Scanner;

/**
 * Create a class with a method which can calculate 
 * the sum of first n natural numbers which are divisible by 3 or 5.
 * @author SUDHA
 *
 */
public class Lab1Assignment1 
{
	public static void main(String args[])
	{
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		value=sc.nextInt();
		int result=calculateSum(value);
		System.out.print(result);
	}

	private static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum+=i;
			}
		}
		// TODO Auto-generated method stub
		return sum;
	}

	
}
