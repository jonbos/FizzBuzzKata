package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	private List<Rule> rules = new ArrayList<>();

	public FizzBuzz() {
		rules.add(new Rule((x) -> x % 3 == 0, "Fizz", ""));
		rules.add(new Rule((x) -> x % 5 == 0, "Buzz", ""));
		rules.add(new Rule((x) -> x % 7 == 0, "Pop", ""));
	}

	public String fizzBuzz(int number) {

		String result = "";

		for (Rule rule : rules) {
			result += rule.apply(number);
		}

		if (result.isEmpty()) {
			result = Integer.toString(number);
		}
		return result;
	}
}