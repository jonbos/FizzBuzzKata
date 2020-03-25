package fizzbuzz;

import java.util.ArrayList;

public class GameFactory {

	public static CountingGame getGame() {
		return new CountingGame();
	}

	public static CountingGame getFizzBuzzGame() {
		CountingGame fb = new CountingGame();
		Rule fizz = new Rule((x) -> x % 3 == 0, "Fizz", "");
		Rule buzz = new Rule((x) -> x % 5 == 0, "Buzz", "");
		ArrayList<Rule> fizzBuzzRules = new ArrayList<Rule>();
		fizzBuzzRules.add(fizz);
		fizzBuzzRules.add(buzz);
		fb.setRules(fizzBuzzRules);
		return fb;
	}

	public static CountingGame getFizzBuzzPopGame() {
		CountingGame fbp = new CountingGame();

		Rule fizz = new Rule((x) -> x % 3 == 0, "Fizz", "");
		Rule buzz = new Rule((x) -> x % 5 == 0, "Buzz", "");
		Rule pop = new Rule((x) -> x % 7 == 0, "Pop", "");

		ArrayList<Rule> fizzBuzzPopRules = new ArrayList<Rule>();
		fizzBuzzPopRules.add(fizz);
		fizzBuzzPopRules.add(buzz);
		fizzBuzzPopRules.add(pop);

		fbp.setRules(fizzBuzzPopRules);
		return fbp;
	}
}
