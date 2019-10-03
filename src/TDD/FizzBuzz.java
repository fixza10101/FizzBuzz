package TDD;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int input = key.nextInt();
		System.out.println(input);
		String output = getInput(input);
		
		
	}
	public static String getInput(int input) {
		if(input > 0 && input <=100) {
			 if(input % 3 == 0) {
	                return "Fizz";
	         }else if(input % 5 ==0) {
	        	 	return "Buzz";
	         }else {
	            	return Integer.toString(input);
	         }
		}else {
			return "Error";
		}
	}

}
