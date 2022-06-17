package functions;

import java.util.function.Function;

public class Tired implements Function<String, String> {
	@Override
	public String apply(String name) {
		return name + " is tired!";
	}
}
