/**
 *Create a method which accepts an array of integer elements and return the second smallest element in the array
 * @author SUDHA
 *
 */
public class Lab3Assignmenet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,7,2,1};
		System.out.print(getSecondSmallest(arr));
		
	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					
					temp=arr[j];
					//System.out.print(temp);
					arr[j]=arr[i];
					arr[i]=temp;
					
							
					
				}
			}
		}
		
		return arr[1];
	}
	
}



