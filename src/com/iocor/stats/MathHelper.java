package com.iocor.stats;

/**
 * @author seb
 * @author Sam Phippen (samphippen@gmail.com)
 */
public class MathHelper {
	/**
	 * calculate the square root of a number
	 * 
	 * @param x
	 *            the number to have it's square root calculated
	 * @return square root of x
	 */
	public static double SquareRoot(double x) {
		return Math.pow(x, 0.5);
	}

	/**
	 * calculate the square of a number
	 * 
	 * @param x
	 *            the number to be squared
	 * @return x squared
	 */
	public static double Square(double x) {
		return Math.pow(x, 2);
	}

	/**
	 * calculates the area of a trapezium
	 * 
	 * @param width
	 *            the width accross the trapezium
	 * @param a
	 *            side length of side a
	 * @param b
	 *            side length of side b
	 * @return the area of the trapezium
	 */
	public static double TrapeziumArea(double width, double a, double b) {
		return (0.5 * width * (a + b));
	}

	/**
	 * rounds a number to RPL places
	 * 
	 * @param d
	 *            the double to be rounded
	 * @param Rpl
	 *            the number of places to round to
	 * @return the rounded double
	 */
	public static float Round(double d, int Rpl) {
		float p = (float) Math.pow(10, Rpl);
		d = d * p;
		float tmp = Math.round(d);
		return (float) tmp / p;
	}

	/**
	 * returns the factorial of a number
	 * 
	 * @param x
	 *            the number to have it's factorial calculated
	 * @return x factorial
	 * @throws IllegalArgumentException
	 */
	public static int Factorial(int x) throws IllegalArgumentException {
		if (x == 0 || x == 1) {
			return 1;
		} else if (x > 0) {
			int mul = 2;
			for (int i = 3; i <= x; i++) {
				mul *= i;
			}
			return mul;
		} else {
			throw new IllegalArgumentException("cannot calculate the factorial of a negative number");
		}

	}

	/**
	 * raises a number to the power e
	 * 
	 * @param d
	 * @return e^d
	 */
	public static double Exp(double d) {
		return Math.pow(Math.E, d);
	}
	
	/**
	 * works out binomial coefficient
	 * 
	 * @param n
	 * @param r
	 * @return nCr
	 */
	public static double nCr(int n, int r) {
		
		return Factorial(n) / (Factorial(r) * Factorial(n - r));
	}
	
}
