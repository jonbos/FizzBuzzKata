package fizzbuzz;

public class FizzBuzz {

	public String fizzBuzz(int number) {
		String result = "";
		
		if (number % 3 == 0) {
			result += "Fizz";
		}
		
		if (number % 5 == 0) {
			result += "Buzz";
		}
		
		if (result.isEmpty()) {
			result = Integer.toString(number);
		}
		return result;
	}
}