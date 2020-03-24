package fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
	Map<Integer, String> rules = new HashMap<Integer, String>();
	
	public FizzBuzz() {
		rules.put(3, "Fizz");
		rules.put(5, "Buzz");
	}

	public String fizzBuzz(int number) {
		
		String result = "";

		for (Map.Entry<Integer, String> rule: rules.entrySet()) {
			if (number % rule.getKey() == 0) {
				result += rule.getValue();
			}
		}
		
		if (result.isEmpty()) {
			result = Integer.toString(number);
		}
		return result;
	}
}