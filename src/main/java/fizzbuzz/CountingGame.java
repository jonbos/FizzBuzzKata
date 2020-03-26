package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class CountingGame {
	private List<Rule> rules = new ArrayList<>();

	public CountingGame() {
	}
	
	
	public CountingGame(List<Rule> rules) {
		super();
		this.rules = rules;
	}


	public String play(int number) {

		String result = "";

		for (Rule rule : rules) {
			result += rule.applyRule(number);
		}
		// Number does not match any of the game rules, so just return the number
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