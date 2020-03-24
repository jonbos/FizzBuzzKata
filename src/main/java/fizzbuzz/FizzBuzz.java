package fizzbuzz;

public class FizzBuzz {

	public FizzBuzz() {

	}

	public String fizzBuzz(int number) {
		if (number == 3) {
			return "Fizz";
		} else if (number == 5) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}
}
