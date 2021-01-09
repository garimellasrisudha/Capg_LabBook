/**
 * : Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order
 */
import java.util.*;
public class Lab3Assignment3 
{
	public static void main(String[] args)
	{
		int[] arr= {32,89,67,45};
		int[] new_arr=getSorted(arr);
		for(int i=0;i<new_arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
		
	private static int[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
			String[] val=new String[arr.length];
		    for(int i=0;i<arr.length;i++)
			{
				val[i]=Integer.toString(arr[i]);
				
			}
			
			 String[] t = new String[val.length];
		     for (int i = 0; i < val.length; i++) 
		     {
		         val[i]= new StringBuilder(val[i]).reverse().toString();
		      }
		       Arrays.sort(val);
		       for(int i=0;i<val.length;i++)
		       {
		    	   arr[i]=Integer.parseInt(val[i]);
		       }
		        
		return arr;
	}






		
			
}


