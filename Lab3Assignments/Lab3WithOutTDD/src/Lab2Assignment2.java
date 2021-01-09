/**
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 *Note: Consonant refers to all alphabets excluding vowels

 * @author SUDHA
 *
 */
public class Lab2Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="JAVA";
		
		char[] c=input.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='A'||c[i]=='E'||c[i]=='O'||c[i]=='U'||c[i]=='I')
			{
				
			}
			else
			{
				int val=(int) c[i];
				c[i]=(char) (val+1);
				
			}
		}
		input=String.valueOf(c);
		System.out.print(input);

	}
	

}
