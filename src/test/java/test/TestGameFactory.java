package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fizzbuzz.CountingGame;
import fizzbuzz.GameFactory;
import fizzbuzz.Rule;

public class TestGameFactory {
	private GameFactory factory;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreatesGameWithNoRulesWhenPassedNoArgs() {
		CountingGame game = GameFactory.getGame();
		assertEquals(0, game.getRules().size());
	}

	@Test
	public void testShouldCreateFizzBuzzGameWithTwoRules() {
		CountingGame fizzBuzz = GameFactory.getFizzBuzzGame();
		assertEquals(fizzBuzz.getRules().size(), 2);
	}

	@Test
	public void testShouldCreateFizzBuzzPopGameWithThreeRules() {
		CountingGame fizzBuzzPop = GameFactory.getFizzBuzzPopGame();
		assertEquals(fizzBuzzPop.getRules().size(), 3);
	}

}
