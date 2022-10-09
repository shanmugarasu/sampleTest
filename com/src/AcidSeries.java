package com;

public class AcidSeries {
	static int s = 15;
	static int d = 1;
	static java.util.Set ss = new java.util.HashSet();

	public static boolean printcombination(char str[]) {
		return printcombination(new char[0], str);
	}

	public static boolean printcombination(char prefix[], char str[]) {
		if (0 == str.length) {
			// System.out.println(new String(prefix));
			int sum = 0;
			for (char c : prefix) {
				sum += (c == 'A' ? 1 : -1);
				if (sum == 0)
					return false;
			}
			if (ss.add(new String(prefix))) {
				System.out.println(new String(prefix));
			}

		} else {
			for (int i = 0; i < str.length; i++) {
				char toAppendToPermutation = str[i];
				String strs = new String(str);

				String remaining = strs.substring(0, i) + strs.substring(i + 1);
				String newprefix = new String(prefix) + toAppendToPermutation;
				boolean ret = printcombination(newprefix.toCharArray(), remaining.toCharArray());
				/*
				 * if(!ret){ return false; }
				 */
			}
		}
		return true;
	}

	public static void main(String args[]) {
		printcombination(new char[] { 'A', 'A', 'N', 'A', 'N', 'A', 'N', 'A', 'N', 'A', 'N' });
		System.out.println("Show me the result");
	}

}
