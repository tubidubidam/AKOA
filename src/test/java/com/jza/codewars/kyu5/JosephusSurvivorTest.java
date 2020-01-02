package com.jza.codewars.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class JosephusSurvivorTest {

	@Test
	public void test1() {
		josephusTest(7, 3, 4);
	}

	@Test
	public void test2() {
		josephusTest(11, 19, 10);
	}

	@Test
	public void test3() {
		josephusTest(40, 3, 28);
	}

	@Test
	public void test4() {
		josephusTest(14, 2, 13);
	}

	@Test
	public void test5() {
		josephusTest(100, 1, 100);
	}

	private void josephusTest(final int people, final int k, final int result) {
		String testDescription = String.format("Testing where n = %d and k = %d", people, k);
		assertEquals(testDescription, result, JosephusSurvivor.josephusSurvivorBruteforce(people, k));
	}
}
