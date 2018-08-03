package com.stackroute.exercise3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFirstLastDay {
	FirstLastDay obj=new FirstLastDay();

	@Test
	void test() {
		assertEquals("Mon 16/07/2018\nSun 22/07/2018",obj.getStartEndDates("16/07/2018"));
	}

}
