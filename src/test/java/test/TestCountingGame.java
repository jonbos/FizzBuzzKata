package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fizzbuzz.CountingGame;
import fizzbuzz.GameFactory;

public class TestCountingGame {
	private CountingGame game;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFizzBuzzShouldReturnNumber() {
		game = GameFactory.getFizzBuzzGame();
		assertEquals("1", game.fizzBuzz(1));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzWhenInputIsThree() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Fizz", game.fizzBuzz(3));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzWhenInputIsMultipleOfThree() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Fizz", game.fizzBuzz(9));
		assertEquals("Fizz", game.fizzBuzz(12));
		assertEquals("Fizz", game.fizzBuzz(33));
	}

	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsFive() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Buzz", game.fizzBuzz(5));
	}

	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsMultipleOfFive() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Buzz", game.fizzBuzz(10));
		assertEquals("Buzz", game.fizzBuzz(500));
		assertEquals("Buzz", game.fizzBuzz(25));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzBuzzWhenInputIsMultipleOfThreeAndFive() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("FizzBuzz", game.fizzBuzz(3 * 5));
	}

	@Test
	public void testFizzBuzzPopShouldReturnPopWhenNumberIsSeven() {
		game = GameFactory.getFizzBuzzPopGame();

		assertEquals("Pop", game.fizzBuzz(7));
	}
	
	@Test public void testFizzBuzzPopShouldReturnFizzPopWhenNumberIsMultipleOfThreeAndSeven() {
		game = GameFactory.getFizzBuzzPopGame();

		assertEquals("FizzPop", game.fizzBuzz(7*3));

	}
	@Test public void testFizzBuzzPopShouldReturnFizzBuzzPopWhenNumberIsMultipleOfThreeFiveAndSeven() {
		game = GameFactory.getFizzBuzzPopGame();

		assertEquals("FizzBuzzPop", game.fizzBuzz(7*3*5));
	}
}
