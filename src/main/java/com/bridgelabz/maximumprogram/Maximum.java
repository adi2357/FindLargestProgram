package com.bridgelabz.maximumprogram;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.Optional;

public class Maximum<T> {
	T[] inputArray;

	public Maximum(T[] inputArray) {
		this.inputArray = inputArray;
	}

	public static <T extends Comparable<T>> T findMaximum(Maximum<T> max) {

		Optional<T> checkNull = Optional.ofNullable(max.inputArray[max.inputArray.length-1]);
		if(checkNull.isPresent()) {
			Arrays.sort(max.inputArray);
			return max.inputArray[max.inputArray.length-1];
		}else{
			System.out.println("Input is empty");		
		return null;
		}
	}

}
