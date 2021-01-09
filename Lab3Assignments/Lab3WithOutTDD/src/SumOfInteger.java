/**
 * Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)?
 */
import java.util.StringTokenizer;


public class SumOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String input="10 20 30 40";
		StringTokenizer s1=new StringTokenizer(input," ");
		while(s1.hasMoreTokens())
		{
			String store=s1.nextToken();
			sum=sum+Integer.parseInt(store);
			
			
		}
		System.out.print(sum);

	}

}
