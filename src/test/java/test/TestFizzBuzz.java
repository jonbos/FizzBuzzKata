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
	public void testFizzBuzzShouldReturnFizzWhenInputIsMultipleOfThree() {
		assertEquals("Fizz", fb.fizzBuzz(9));
	}
	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsFive() {
		assertEquals("Buzz", fb.fizzBuzz(5));
	}
	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsMultipleOfFive() {
		assertEquals("Buzz", fb.fizzBuzz(10));
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
