package com.bridgelabz.maximumprogram;

import java.lang.Comparable;

public class Maximum {

	public <T extends Comparable<T>> T findMaximum(T a, T b, T c) {

		T maxInput = a;
		if (b.compareTo(maxInput) > 0)
			maxInput = b;
		if (c.compareTo(maxInput) > 0)
			maxInput = c;
		return maxInput;
	}

}
