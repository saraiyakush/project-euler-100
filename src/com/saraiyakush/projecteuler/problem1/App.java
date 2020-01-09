package com.saraiyakush.projecteuler.problem1;

/**
 * Find the sum of all the multiples of 3 or 5 below the provided parameter value <strong>number</strong>
 * @author Kush Saraiya
 *
 */
public class App {

	public static void main(String[] args) {
		/*
		 * Change the input to run more tests
		 */
		System.out.println(multiplesOf3and5(1000));
	}

	private static int multiplesOf3and5(int number) {
		int sum = 0;

		// Loop through all the numbers
		for (int i = 1; i < number; i++) {

			/*
			 * If module of 3 or 5 is 0 then the number is a multiple of either of them Add
			 * such numbers
			 */
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}

		}
		return sum;
	}
}
