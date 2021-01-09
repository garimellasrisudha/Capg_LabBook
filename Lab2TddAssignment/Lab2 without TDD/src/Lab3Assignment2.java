/**
 * Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
 *Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE* 
 * @author SUDHA
 *
 */
public class Lab3Assignment2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] arr= {"sudha","anju","goutam","dog"};
		String[] result=sortString(arr);
		for(String s:result)
		{
			System.out.print(s+",");
		}
		
	}

	private static String[] sortString(String[] arr) 
	{
		// TODO Auto-generated method stub
		String temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		if((arr.length%2)==0)
		{
			for(int i=0;i<(arr.length/2);i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=arr.length/2;i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<((arr.length+1)/2);i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=((arr.length+1)/2);i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
			
		}
		
		
		return arr;
		
		
	}
	
}

