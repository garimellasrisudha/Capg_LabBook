package com.cg.Lab3Assignments;

import java.util.StringTokenizer;

public class SumOfIntegers 
{

	public int getSumOfIntergers(String value) 
	{
		// TODO Auto-generated method stub
		if(value.isEmpty())
		{
			return 0;
		}
		else if(value.length()>0)
		{
			int sum=0;
			StringTokenizer s1=new StringTokenizer(value," ");
			while(s1.hasMoreTokens())
			{
				String store=s1.nextToken();
				sum=sum+Integer.parseInt(store);
				
				
			}
			return sum;
			
		}
		
		else 
		{
			int re=Integer.parseInt(value);
			return re;
		}
			
			
	}

}
