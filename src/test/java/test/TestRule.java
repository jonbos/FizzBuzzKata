package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fizzbuzz.Rule;

public class TestRule {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRuleConditionCanBeImplementedAsLambda() {
		Rule rule = new Rule();
		rule.setCondition((x) -> x == 1);
		assertTrue(rule.getCondition().apply(1));
	}

	@Test
	public void testRuleReturnsMatchWhenRuleMatches() {
		Rule rule = new Rule();
		rule.setCondition((x) -> x == 1);
		String expected = "match";
		rule.setMatch(expected);
		assertEquals(expected, rule.applyRule(1));
	}

	@Test
	public void testRuleReturnsNoMatchWhenNoRuleMatch() {
		Rule rule = new Rule();
		rule.setCondition((x) -> x == 1);
		String expected = "no match";
		rule.setNoMatch(expected);
		assertEquals(expected, rule.applyRule(2));
	}

}
