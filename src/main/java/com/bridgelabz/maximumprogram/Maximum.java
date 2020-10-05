package com.bridgelabz.maximumprogram;

import java.lang.Comparable;

public class Maximum<T> {
	T a;
	T b;
	T c;

	public Maximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static <T extends Comparable<T>> T findMaximum(Maximum<T> max) {

		T maxInput = max.a;
		if ((max.b).compareTo(maxInput) > 0)
			maxInput = max.b;
		if ((max.c).compareTo(maxInput) > 0)
			maxInput = max.c;
		return maxInput;
	}

}
