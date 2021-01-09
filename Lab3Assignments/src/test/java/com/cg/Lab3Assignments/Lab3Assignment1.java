package com.cg.Lab3Assignments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Lab3Assignment1 
{
    /**
     * Rigorous Test :-)
     */
	private SumOfIntegers sumofintegers;
	@Before
	public void setup()
	{
		sumofintegers=new SumOfIntegers();
	}
    @Test
    public void testCalculate_GivenEmptyString_ShouldReturnAsInteger()
    {
    	String value="";
    	int result=sumofintegers.getSumOfIntergers(value);
        assertEquals(0,result);    
    }
    @Test
    public void testCalculate_GivenOneString_ShouldReturnAsInteger()
    {
    	String value="1";
    	int result=sumofintegers.getSumOfIntergers(value);
        assertEquals(1,result);    
    }
    @Test
    public void testCalculate_GivenSumString_ShouldReturnAsInteger()
    {
    	String value="1 2";
    	int result=sumofintegers.getSumOfIntergers(value);
    	assertEquals(3,result);
    }
}
