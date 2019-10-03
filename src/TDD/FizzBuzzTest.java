package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzbuzz = new FizzBuzz();
	String i = fizzbuzz.getInput(1);
	String i2 = fizzbuzz.getInput(2);
	String i3 = fizzbuzz.getInput(3);
	String i4 = fizzbuzz.getInput(4);
	
	@Test
	@DisplayName("input 1 : expect 1")
	void test1() {	
		assertEquals("1", i);
	}
	@Test
	@DisplayName("input 2 : expect 2")
	void test2() {	
		assertEquals("2", i2);
	}
	@Test
	@DisplayName("input 3 : expect Fizz")
	void test3() {	
		assertEquals("Fizz", i3);
	}
	@Test
	@DisplayName("input 4 : expect Fizz")
	void test4() {	
		assertEquals("4", i4);
	}
}
