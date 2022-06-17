package com.example.newfunc;

import java.util.function.Function;

public class Sad implements Function<String, String> {
	@Override
	public String apply(String name) {
		return name + " is sad!";
	}
}
