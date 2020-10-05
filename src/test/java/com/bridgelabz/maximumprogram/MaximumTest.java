package com.bridgelabz.maximumprogram;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaximumTest {

//INTEGER TEST	
	@Test
	public void givenIntegerArray_OfSize3_ReturnMaximum() {
		Maximum<Integer> max = new Maximum(new Integer[] { 3, 2, 1 });
		Assert.assertEquals(new Integer(3), max.findMaximum(max));
	}

	@Test
	public void givenIntegerArray_OfSize4_ReturnMaximum() {
		Maximum<Integer> max = new Maximum(new Integer[] { 3, 2, 1, 4 });
		Assert.assertEquals(new Integer(4), max.findMaximum(max));
	}

	@Test
	public void givenIntegerArray_OfSize0_ReturnNull() {
		Maximum<Integer> max = new Maximum(new Integer[6]);
		Assert.assertEquals(null, max.findMaximum(max));
	}

//FLOAT TEST	
	@Test
	public void givenFloatArray_OfSize3_ReturnMaximum() {
		Maximum<Float> max = new Maximum(new Float[] { 3f, 2f, 1f });
		Assert.assertEquals(new Float(3f), max.findMaximum(max));
	}

	@Test
	public void givenFloatArray_OfSize5_ReturnMaximum() {
		Maximum<Float> max = new Maximum(new Float[] { 3f, 4f, 1f, 2f, 6f });
		Assert.assertEquals(new Float(6f), max.findMaximum(max));
	}

	@Test
	public void givenFloatArray_OfSize0_ReturnNull() {
		Maximum<Float> max = new Maximum(new Float[4]);
		Assert.assertEquals(null, max.findMaximum(max));
	}

//STRING TEST
	@Test
	public void givenStringArray_OfSize3_ReturnMaximum() {
		Maximum<String> max = new Maximum(new String[] { "Cherries", "Banana", "Apple" });
		Assert.assertEquals(new String("Cherries"), max.findMaximum(max));
	}

	@Test
	public void givenStringArray_OfSize4_ReturnMaximum() {
		Maximum<String> max = new Maximum(new String[] { "Cherries", "Grapefruit", "Apple", "Kiwi" });
		Assert.assertEquals(new String("Kiwi"), max.findMaximum(max));
	}

	@Test
	public void givenStringArray_OfSize0_ReturnNull() {
		Maximum<String> max = new Maximum(new String[4]);
		Assert.assertEquals(null, max.findMaximum(max));
	}
}
