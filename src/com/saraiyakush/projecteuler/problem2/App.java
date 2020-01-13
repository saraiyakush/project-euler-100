package com.saraiyakush.projecteuler.problem2;

/**
 * Find the sum of all even numbers in Fibonacci series of n numbers
 * 
 * @author Kush Saraiya
 *
 */
public class App {

	public static void main(String[] args) {
		/*
		 * Change the input to run more tests
		 */
		System.out.println(evenSumFibo(5));
	}

	private static int evenSumFibo(int n) {

		/*
		 * If n is 0 or 1, sum will be 0
		 */
		if (n < 2)
			return 0;
		/*
		 * If n is 2, sum will be 2
		 */
		else if (n == 2)
			return 2;

		/*
		 * For n > 2, sum will be at least 2
		 */
		int sum = 2;

		/*
		 * Start with 1 and 2
		 */
		int prev1 = 1;
		int prev2 = 2;

		/*
		 * Loop from 3 to n (1 and 2 are already accounted for).
		 * If modulo two of the sum of previous two is zero, the number is even.
		 * Add it to sum.
		 * Else move on to the next number
		 */
		for (int i = 3; i <= n; i++) {
			int next = prev1 + prev2;
			if (next % 2 == 0) {
				sum += next;
			}
			prev1 = prev2;
			prev2 = next;
		}

		return sum;
	}
}
