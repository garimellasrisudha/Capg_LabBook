/**
 *Create a method which accepts an array of integer elements and return the second smallest element in the array
 * @author SUDHA
 *
 */
public class Lab2Assignment1 {
	public static void main()
	{
		int arr[]= {5,3,7,2,1};
		System.out.print(getSecondSmallest(arr));
		
	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=arr[j];
					
							
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		return 0;
	}
	
}
