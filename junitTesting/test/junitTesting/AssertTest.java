package junitTesting;

import static org.junit.jupiter.api.Assertions.*;
 

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean cond = true;
		assertEquals(true,cond);
		assertTrue(true);
		assertFalse(false);
	}

}
