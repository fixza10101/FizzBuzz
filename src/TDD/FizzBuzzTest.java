package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzbuzz = new FizzBuzz();
	String i = fizzbuzz.getInput(1);
	
	@Test
	@DisplayName("input 1 : expect 1")
	void test1() {	
		assertEquals("1", i);
	}
}
