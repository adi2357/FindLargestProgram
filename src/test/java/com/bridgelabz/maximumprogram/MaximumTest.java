package com.bridgelabz.maximumprogram;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaximumTest {

	
//INTEGER TEST	
	@Test
	public void givenMaxNumber_At1stPosition_ReturnNumber() {
		Maximum<Integer> max=new Maximum<Integer>(3, 2, 1);
		Assert.assertEquals(new Integer(3), max.findMaximum(max));	
	}	
	@Test
	public void givenMaxNumber_At2ndPosition_ReturnNumber() {
		Maximum<Integer> max=new Maximum<Integer>(3, 4, 1);
		Assert.assertEquals(new Integer(4), max.findMaximum(max));		
	}
	@Test
	public void givenMaxNumber_At3rdPosition_ReturnNumber() {
		Maximum<Integer> max=new Maximum<Integer>(3,4,5);
		Assert.assertEquals(new Integer(5), max.findMaximum(max));		
	}
	
//FLOAT TEST	
	@Test
	public void givenMaxFloat_At1stPosition_ReturnFloat() {
		Maximum<Float> max=new Maximum<Float>(3f,2f,1f);
		Assert.assertEquals(new Float(3f), max.findMaximum(max));		
	}	
	@Test
	public void givenMaxFloat_At2ndPosition_ReturnFloat() {
		Maximum<Float> max=new Maximum<Float>(3f,4f,1f);
		Assert.assertEquals(new Float(4f), max.findMaximum(max));		
	}
	@Test
	public void givenMaxFloat_At3Position_ReturnFloat() {
		Maximum<Float> max=new Maximum<Float>(3f,4f,5f);
		Assert.assertEquals(new Float(5f), max.findMaximum(max));		
	}

//STRING TEST
	@Test
	public void givenMaxString_At1stPosition_ReturnString() {
		Maximum<String> max=new Maximum<String>("Cherries","Banana","Apple");
		Assert.assertEquals(new String("Cherries"), max.findMaximum(max));		
	}	
	@Test
	public void givenMaxString_At2ndPosition_ReturnString() {
		Maximum<String> max=new Maximum<String>("Cherries","Grapefruit","Apple");
		Assert.assertEquals(new String("Grapefruit"), max.findMaximum(max));		
	}
	@Test
	public void givenMaxString_At3rdPosition_ReturnString() {
		Maximum<String> max=new Maximum<String>("Cherries","Banana","Kiwi");
		Assert.assertEquals(new String("Kiwi"), max.findMaximum(max));		
	}
}
