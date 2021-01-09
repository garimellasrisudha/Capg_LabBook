/**
 * Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, 
 * if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should return true if the entered string is positive.
 * @author SUDH
 *
 */
public class Lab2Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ANT";
		 System.out.print(sortString(s));
		
		

	}

	private static boolean sortString(String s) 
	{
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]>c[i+1])
			{
				return false;
			}
		}
		return true;
	}
		

}
