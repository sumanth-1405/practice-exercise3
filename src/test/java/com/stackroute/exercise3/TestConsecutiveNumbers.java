package com.stackroute.exercise3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConsecutiveNumbers {
	ConsecutiveNumbers obj = new ConsecutiveNumbers();

	@Test
	void test() {
		assertEquals("23,24,25,26,27,28,29 are consecutive numbers", obj.consecutiveChecker("23,24,25,26,27,28,29"));
	}
	
	@Test
	void test1() {
		assertEquals("23,24,25,26,27,28,30 non consecutive numbers", obj.consecutiveChecker("23,24,25,26,27,28,30"));
	}

}
