package com;

import java.util.*;

public class FindLCMandGCD {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number 1");
		int a = s.nextInt();
		System.out.println("Please enter number 2");
		int b = s.nextInt();

		int gcd = gcd(a, b);
		int lcm = (a * b) / gcd;

		System.out.println("GCD is:" + gcd + " LCM is:" + lcm);
	}

	static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
