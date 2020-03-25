package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fizzbuzz.CountingGame;
import fizzbuzz.GameFactory;

public class TestGameFactory {
	private GameFactory factory;

	@Before
	public void setUp() throws Exception {
		GameFactory factory = new GameFactory();
	}

	@Test
	public void testCreatesGameWithNoRulesWhenPassedNoArgs() {
		CountingGame game = GameFactory.getGame();
		assertEquals(0, game.getRules().size());
	}

}
