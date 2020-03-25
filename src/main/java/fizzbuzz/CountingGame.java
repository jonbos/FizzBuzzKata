package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class CountingGame {
	private List<Rule> rules = new ArrayList<>();

	public CountingGame() {
	}

	public String play(int number) {

		String result = "";

		for (Rule rule : rules) {
			result += rule.applyRule(number);
		}

		if (result.isEmpty()) {
			result = Integer.toString(number);
		}
		return result;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
}