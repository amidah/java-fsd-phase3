package com.simplilearn.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionJUnitTestingExample {

	@Test
	void shouldThrowException() {
		Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
			throw new UnsupportedOperationException("Not Supported");
		});

		assertEquals("Not Supported", exception.getMessage());
	}

	@Test
	void assertThrowsException() {
		String s = null;

		assertThrows(IllegalArgumentException.class, () -> {
			Integer.valueOf(s);
		});
	}
}
