package com.simplilearn.junitexample;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertionAssumptionJunitExample {

	@Test
	void assertionTrueTest() {

		List<Integer> numbers = Arrays.asList(1, 2, 3);

		assertTrue(numbers.stream().mapToInt(Integer::intValue).sum() > 5, () -> "Sum should be greater than 5");
		assertFalse(numbers.stream().mapToInt(Integer::intValue).sum() < 5, () -> "Sum should be greater than 5");
	}

	@Test
	void assertionFalseTest() {

		List<Integer> numbers = Arrays.asList(1, 2, 3);

		assertFalse(numbers.stream().mapToInt(Integer::intValue).sum() < 5, () -> "Sum should be greater than 5");
	}

	@Test
	void groupAssertions() {
		int[] numbers = { 0, 1, 2, 3, 4, 5 };

		assertAll("numbers", () -> assertEquals(numbers[0], 0), () -> assertEquals(numbers[3], 3),
				() -> assertEquals(numbers[4], 4));
	}

	@Test
	void testTrueAssumtion() {

		assumeTrue(5 > 1);
		assertEquals(5 + 2, 7);
	}
	
	
	@Test
	void testFalseAssumption() {
		assumeFalse(5 < 1);
		assertEquals(5+2, 7);
	}
	
	
	@Test
	void testAssumingThatAssumption() {
		String a = "Junits are awesome...";
		assumingThat(a.equals("Junits are awesome.."), () -> assertEquals(2+2, 3));
	}
	
}