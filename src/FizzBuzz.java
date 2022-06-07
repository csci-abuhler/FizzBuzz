/*
 * Solution to the FizzBuzz programming challenge.
 */
public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Buzz");
			} else if (i % 2 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			} // if
		} // for
	} // main
} // class
