package com.cg.Lab2TddAssignment1;

import java.util.Arrays;

public class ReverseArray {

	public int[] getReverseArray(int[] newNumbers) {
		
		if(isEmpty(newNumbers))
		{
			return null;
		}
		
		else
		{
			String[] string_store=new String[newNumbers.length];
			for(int i=0;i<newNumbers.length;i++)
			{
				string_store[i]=Integer.toString(newNumbers[i]);
				string_store[i]=new StringBuilder(string_store[i]).reverse().toString();
				newNumbers[i]=Integer.parseInt(string_store[i]);
				
			}
			Arrays.sort(newNumbers);
			return newNumbers;
			
			
		}
		
	}

	private boolean isEmpty(int[] newNumbers) {
		if(newNumbers.length==0)
		{
			return true;
		}
		return false;
		
	}

}
