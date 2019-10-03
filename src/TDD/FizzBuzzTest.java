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
	String i5 = fizzbuzz.getInput(5);
	String i6 = fizzbuzz.getInput(6);
	String i7 = fizzbuzz.getInput(7);
	String i8 = fizzbuzz.getInput(8);
	
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
	@DisplayName("input 4 : expect 4")
	void test4() {	
		assertEquals("4", i4);
	}
	@Test
	@DisplayName("input 5 : expect Buzz")
	void test5() {	
		assertEquals("Buzz", i5);
	}
	@Test
	@DisplayName("input 6 : expect Fizz")
	void test6() {	
		assertEquals("Fizz", i6);
	}
	@Test
	@DisplayName("input 7 : expect 7")
	void test7() {	
		assertEquals("7", i7);
	}
	@Test
	@DisplayName("input 8 : expect 8")
	void test8() {	
		assertEquals("8", i8);
	}
}
