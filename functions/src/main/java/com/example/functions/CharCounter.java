package com.examples.functions;

import java.util.function.Function;

// the endpoint would be /charCounter
public class CharCounter implements Function<String, Integer> {

	@Override
	public Integer apply(String word) {
		return word.length();
	}

}