package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fizzbuzz.FizzBuzz;

public class TestFizzBuzz {
	private FizzBuzz fb;
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	public void testFizzBuzzShouldReturnNumber() {
		assertEquals("1", fb.fizzBuzz(1));
	}
	@Test
	public void testFizzBuzzShouldReturnFizzWhenInputIsThree() {
		assertEquals("Fizz", fb.fizzBuzz(3));
	}
	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsMultipleOfFive() {
		assertEquals("Buzz", fb.fizzBuzz(5));
	}
}
