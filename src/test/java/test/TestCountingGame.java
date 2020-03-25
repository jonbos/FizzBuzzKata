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
		assertEquals("1", game.play(1));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzWhenInputIsThree() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Fizz", game.play(3));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzWhenInputIsMultipleOfThree() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Fizz", game.play(9));
		assertEquals("Fizz", game.play(12));
		assertEquals("Fizz", game.play(33));
	}

	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsFive() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Buzz", game.play(5));
	}

	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsMultipleOfFive() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("Buzz", game.play(10));
		assertEquals("Buzz", game.play(500));
		assertEquals("Buzz", game.play(25));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzBuzzWhenInputIsMultipleOfThreeAndFive() {
		game = GameFactory.getFizzBuzzGame();

		assertEquals("FizzBuzz", game.play(3 * 5));
	}

	@Test
	public void testFizzBuzzPopShouldReturnPopWhenNumberIsSeven() {
		game = GameFactory.getFizzBuzzPopGame();

		assertEquals("Pop", game.play(7));
	}
	
	@Test public void testFizzBuzzPopShouldReturnFizzPopWhenNumberIsMultipleOfThreeAndSeven() {
		game = GameFactory.getFizzBuzzPopGame();

		assertEquals("FizzPop", game.play(7*3));

	}
	@Test public void testFizzBuzzPopShouldReturnFizzBuzzPopWhenNumberIsMultipleOfThreeFiveAndSeven() {
		game = GameFactory.getFizzBuzzPopGame();

		assertEquals("FizzBuzzPop", game.play(7*3*5));
	}
}
