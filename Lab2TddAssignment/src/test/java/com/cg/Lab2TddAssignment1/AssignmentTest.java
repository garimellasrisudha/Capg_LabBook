package com.cg.Lab2TddAssignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AssignmentTest {
	
	private ReverseArray reverseArray;
	@Before
	 
	public void setup()
	{
		reverseArray=new ReverseArray();
		
	}

	@Test
	public void test_getReverseArray_GivenEmptyIntegerArray_ShowReturn0AsInteger() {
		int newNumbers[]= {};
		int[] result=reverseArray.getReverseArray(newNumbers);
		assertEquals(null,result);
		
	}
	@Test
	public void test_getReverseArray_GivenOneIntegerArray_ShowReturn1AsInteger() {
		int newNumbers[]= {12};
		int[] result=reverseArray.getReverseArray(newNumbers);
		assertEquals(21,result[0]);
	}
	
	
	@Test
	public void test_getReverseArray_GivenTwoIntegerArray_ShowReturn2AsInteger() {
		int newNumbers[]= {12,31,11};
		int[] result=reverseArray.getReverseArray(newNumbers);
		assertEquals(11,result[0]);
	
		
	}

}
