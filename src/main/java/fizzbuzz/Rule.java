package fizzbuzz;

import java.util.function.Function;

public class Rule {

	private Function<Integer, Boolean> condition;
	private String match;
	private String noMatch;

	public Rule(Function<Integer, Boolean> condition, String match, String noMatch) {
		super();
		this.condition = condition;
		this.match = match;
		this.noMatch = noMatch;
	}

	public Rule() {
	}

	public String applyRule(int number) {
		return condition.apply(number) ? match : noMatch;
	}

	public Function<Integer, Boolean> getCondition() {
		return condition;
	}

	public void setCondition(Function<Integer, Boolean> condition) {
		this.condition = condition;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public String getNoMatch() {
		return noMatch;
	}

	public void setNoMatch(String noMatch) {
		this.noMatch = noMatch;
	}
}
