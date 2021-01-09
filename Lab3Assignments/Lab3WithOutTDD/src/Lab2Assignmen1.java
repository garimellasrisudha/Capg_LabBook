/**
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .
 * @author SUDHA
 *
 */
public class Lab2Assignmen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sudha";
		System.out.print(s+"|"+getImage(s));
		
	}

	private static String getImage(String s) {
		// TODO Auto-generated method stub
		StringBuffer sc=new StringBuffer(s);
		sc=sc.reverse();
		return sc.toString();
	}
	

}
