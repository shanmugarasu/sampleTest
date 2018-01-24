package com;

public class FindMaxMin {

	public static void main(String[] args) {
		int[] a = { 4, 8, 6, 67, 3, 9, 2 };
		int min = a[0], max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min :" + min);
		System.out.println("Max :" + max);

	}
}
