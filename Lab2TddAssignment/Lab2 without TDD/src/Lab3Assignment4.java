
public class Lab3Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,5,7,1,5,3,1};
		System.out.println(modifyArray(arr));
	}

	private static int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		int[] resultArr=new int[arr.length];
		int k=0;
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=i+1;j<arr.length;j++)
			
			{
				if(arr[i]==arr[j]);
				{
					count=1;
					break;
				}
				
			}
			if(count==1)
			{
				resultArr[k]=arr[i];
				k+=1;
			}
			
		}
		for(int j=0;j<resultArr.length;j++)
		{
			System.out.println(resultArr[j]);
		}
		
		return null;
	}

}
