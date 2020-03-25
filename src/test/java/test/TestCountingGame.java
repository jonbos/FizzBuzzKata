package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fizzbuzz.CountingGame;

public class TestCountingGame {
	private CountingGame fb;
	@Before
	public void setUp() throws Exception {
		fb = new CountingGame();
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
	public void testFizzBuzzShouldReturnFizzWhenInputIsMultipleOfThree() {
		assertEquals("Fizz", fb.fizzBuzz(9));
		assertEquals("Fizz", fb.fizzBuzz(12));
		assertEquals("Fizz", fb.fizzBuzz(33));
	}
	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsFive() {
		assertEquals("Buzz", fb.fizzBuzz(5));
	}
	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsMultipleOfFive() {
		assertEquals("Buzz", fb.fizzBuzz(10));
		assertEquals("Buzz", fb.fizzBuzz(500));
		assertEquals("Buzz", fb.fizzBuzz(25));
	}
	@Test
	public void testFizzBuzzShouldReturnFizzBuzzWhenInputIsMultipleOfThreeAndFive() {
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}
	@Test
	public void testFizzBuzzPopShouldReturnPopWhenNumberIsSeven() {
		assertEquals("Pop", fb.fizzBuzz(7));
	}
}
