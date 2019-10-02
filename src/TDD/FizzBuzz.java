package TDD;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int input = key.nextInt();
			if(input > 0 && input <=100) {
				if(input % 3 == 0) {
					String output = getFizz();
				}else if(input % 5 == 0) {
					String output = getBuzz();
				}else if(input % 3 == 0 && input % 5 ==0) {
					String output = getFizzBuzz();
				}else {
					int output = getNum(input);
				}
			}else {
				getError();
			}
			
		}
		public static String getFizz() {
			return "Fizz";
		}
		public static String getBuzz() {
			return "Buzz";
		}
		public static String getFizzBuzz() {
			return "FizzBuzz";
		}
		public static int getNum(int key) {
			return key;
		}
		public static String getError() {
			return "Error";
		}
	

}
