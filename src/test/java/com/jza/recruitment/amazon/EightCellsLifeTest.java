package com.jza.recruitment.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EightCellsLifeTest {


	@Test
	public void test1() {
		int[] input = {1, 0, 0, 0, 0, 1, 0, 0};
		int days = 1;
		int[] expected = {0, 1, 0, 0, 1, 0, 1, 0};
		Assertions.assertArrayEquals(expected, EightCellsLife.solution(input, days));
	}

	@Test
	public void test2() {
		int[] input = {1, 1, 1, 0, 1, 1, 1, 1};
		int days = 2;
		int[] expected = {0, 0, 0, 0, 0, 1, 1, 0};
		Assertions.assertArrayEquals(expected, EightCellsLife.solution(input, days));
	}
}
