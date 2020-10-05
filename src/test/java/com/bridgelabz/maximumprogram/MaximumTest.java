package com.bridgelabz.maximumprogram;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaximumTest {

	Maximum max;
	
	@Before
	public void initialize() {
		max=new Maximum();
	}

	

//INTEGER TEST	
	@Test
	public void givenMaxNumber_At1stPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(3), max.findMaximum(3, 2, 1));	
	}	
	@Test
	public void givenMaxNumber_At2ndPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(4), max.findMaximum(3, 4, 1));		
	}
	@Test
	public void givenMaxNumber_At3rdPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(5), max.findMaximum(3,4,5));		
	}
	
//FLOAT TEST	
	@Test
	public void givenMaxFloat_At1stPosition_ReturnFloat() {
		Assert.assertEquals(new Float(3f), max.findMaximum(3f,2f,1f));		
	}	
	@Test
	public void givenMaxFloat_At2ndPosition_ReturnFloat() {
		Assert.assertEquals(new Float(4f), max.findMaximum(3f,4f,1f));		
	}
	@Test
	public void givenMaxFloat_At3Position_ReturnFloat() {
		Assert.assertEquals(new Float(5f), max.findMaximum(3f,4f,5f));		
	}

//STRING TEST
	@Test
	public void givenMaxString_At1stPosition_ReturnString() {
		Assert.assertEquals(new String("Cherries"), max.findMaximum("Cherries","Banana","Apple"));		
	}	
	@Test
	public void givenMaxString_At2ndPosition_ReturnString() {
		Assert.assertEquals(new String("Grapefruit"), max.findMaximum("Cherries","Grapefruit","Apple"));		
	}
	@Test
	public void givenMaxString_At3rdPosition_ReturnString() {
		Assert.assertEquals(new String("Kiwi"), max.findMaximum("Cherries","Banana","Kiwi"));		
	}
}
