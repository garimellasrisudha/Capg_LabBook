package com.cg.Lab3Assignments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab3Assignment2Test {

	private CheckString checkstring;
	@Before
	public void setup()
	{
		checkstring=new CheckString();
	}
	@Test
	public void testCalculate_GivenEmptyString_ShouldReturn0() {
		String value="";
		boolean result=checkstring.getCheckString(value);
		assertEquals(true,result);
		
	}
	@Test
	public void testCalculate_Given1String_shouldReturnValue()
	{
		String value="ast";
		boolean result=checkstring.getCheckString(value);
		assertEquals(true,result);
	}
	

}
