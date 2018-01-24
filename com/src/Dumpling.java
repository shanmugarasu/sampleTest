package com;

import java.util.Scanner;

public class Dumpling {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long[] ans = new long[t];
		for (int i = 0; i < t; i++)
			ans[i] = code(in);
		for (int i = 0; i < t; i++)
			System.out.println(ans[i]);
	}

	static long code(Scanner in) {
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long k = in.nextLong();
		long X = gcd(a, b);
		System.out.println("X:" + X);
		long Y = gcd(c, d);
		System.out.println("Y:" + Y);
		long L = (X * Y) / gcd(X, Y);
		System.out.println("L:" + L);
		long ans = k / L;
		System.out.println("ans:" + ans);
		return 2 * ans + 1;

	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		else
			return gcd(b % a, a);
	}
}
