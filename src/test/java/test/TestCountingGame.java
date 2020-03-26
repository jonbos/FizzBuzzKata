package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fizzbuzz.CountingGame;
import fizzbuzz.CountingGameFactory;

public class TestCountingGame {
	private CountingGame game;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFizzBuzzShouldReturnNumber() {
		game = CountingGameFactory.getFizzBuzzGame();
		assertEquals("1", game.play(1));
		assertEquals("2", game.play(2));
		assertEquals("4", game.play(4));
		// Big prime
		assertEquals("991", game.play(991));

		

	}

	@Test
	public void testFizzBuzzShouldReturnFizzWhenInputIsThree() {
		game = CountingGameFactory.getFizzBuzzGame();

		assertEquals("Fizz", game.play(3));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzWhenInputIsMultipleOfThree() {
		game = CountingGameFactory.getFizzBuzzGame();

		assertEquals("Fizz", game.play(9));
		assertEquals("Fizz", game.play(12));
		assertEquals("Fizz", game.play(33));
	}

	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsFive() {
		game = CountingGameFactory.getFizzBuzzGame();

		assertEquals("Buzz", game.play(5));
	}

	@Test
	public void testFizzBuzzShouldReturnBuzzWhenInputIsMultipleOfFive() {
		game = CountingGameFactory.getFizzBuzzGame();

		assertEquals("Buzz", game.play(10));
		assertEquals("Buzz", game.play(500));
		assertEquals("Buzz", game.play(25));
	}

	@Test
	public void testFizzBuzzShouldReturnFizzBuzzWhenInputIsMultipleOfThreeAndFive() {
		game = CountingGameFactory.getFizzBuzzGame();

		assertEquals("FizzBuzz", game.play(3 * 5));
	}

	@Test
	public void testFizzBuzzPopShouldReturnPopWhenNumberIsSeven() {
		game = CountingGameFactory.getFizzBuzzPopGame();

		assertEquals("Pop", game.play(7));
	}

	@Test
	public void testFizzBuzzPopShouldReturnPopWhenNumberIsMultipleOfSeven() {
		game = CountingGameFactory.getFizzBuzzPopGame();

		assertEquals("Pop", game.play(7 * 2));
		assertEquals("Pop", game.play(7 * 11));

	}

	@Test
	public void testFizzBuzzPopShouldReturnFizzPopWhenNumberIsMultipleOfThreeAndSeven() {
		game = CountingGameFactory.getFizzBuzzPopGame();

		assertEquals("FizzPop", game.play(7 * 3));
		assertEquals("FizzPop", game.play(7 * 3 * 11));

	}

	@Test
	public void testFizzBuzzPopShouldReturnBuzzPopWhenNumberIsMultipleOfFiveAndSeven() {
		game = CountingGameFactory.getFizzBuzzPopGame();

		assertEquals("BuzzPop", game.play(5 * 7));
		assertEquals("BuzzPop", game.play(5 * 7 * 11));

	}

	@Test
	public void testFizzBuzzPopShouldReturnFizzBuzzPopWhenNumberIsMultipleOfThreeFiveAndSeven() {
		game = CountingGameFactory.getFizzBuzzPopGame();

		assertEquals("FizzBuzzPop", game.play(7 * 3 * 5));
		assertEquals("FizzBuzzPop", game.play(7 * 3 * 5 * 11));

	}
}
