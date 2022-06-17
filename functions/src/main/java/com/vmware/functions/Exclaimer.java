package com.vmware.functions;

import java.util.function.Function;

public class Exclaimer implements Function<String, String> {
	@Override
	public String apply(String words) {
		return words + "!!!";
	}
}