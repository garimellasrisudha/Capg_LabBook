package com.cg.Lab3Assignments;

public class CheckString {

	
	public boolean getCheckString(String value) {
		// TODO Auto-generated method stub
		if(value.isEmpty())
		{
			return true;
		}
		else
		{
			char[] character_store=value.toCharArray();
			for(int i=0;i<character_store.length-1;i++)
			{
				if(character_store[i]>character_store[i+1])
				{
					return false;
				}
			}
			return true;
		}
		
	}

}
