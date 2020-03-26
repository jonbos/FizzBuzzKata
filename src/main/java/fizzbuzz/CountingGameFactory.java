package fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingGameFactory {

	public static CountingGame getGame() {
		return new CountingGame();
	}

	public static CountingGame getFizzBuzzGame() {
		Rule fizz = new Rule((x) -> x % 3 == 0, "Fizz", "");
		Rule buzz = new Rule((x) -> x % 5 == 0, "Buzz", "");
		ArrayList<Rule> fizzBuzzRules = new ArrayList<Rule>(Arrays.asList(fizz, buzz));
		
		CountingGame fb = new CountingGame(fizzBuzzRules);
		return fb;
	}

	public static CountingGame getFizzBuzzPopGame() {
		Rule fizz = new Rule((x) -> x % 3 == 0, "Fizz", "");
		Rule buzz = new Rule((x) -> x % 5 == 0, "Buzz", "");
		Rule pop = new Rule((x) -> x % 7 == 0, "Pop", "");
		ArrayList<Rule> fizzBuzzPopRules = new ArrayList<Rule>(Arrays.asList(fizz,buzz,pop));
		
		CountingGame fbp = new CountingGame(fizzBuzzPopRules);
		return fbp;
	}
}
