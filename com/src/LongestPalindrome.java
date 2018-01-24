package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestPalindrome {

	public static void main(String arg[]) {

		String a = "aacivicxx";
		StringBuffer b = new StringBuffer();
		StringBuffer c = new StringBuffer();
		char[] charArray = a.toCharArray();
		int finalSubStirngLength = charArray.length;
		int templPalim = 0;
		while (finalSubStirngLength > templPalim) {
			int pos = charArray.length - finalSubStirngLength;
			System.out.println("pos" + pos);
			int tempLength = finalSubStirngLength;
			while (tempLength > pos) {
				b.append(a.substring(pos, tempLength));
				c = b.reverse();
				if (a.equals(c.toString())) {
					templPalim = c.length();
					System.out.println(a + " " + c.toString());
					break;
				}
				tempLength--;
				b = new StringBuffer();
				c = new StringBuffer();
			}

			int totalSize = c.length() + pos;
			if (totalSize == charArray.length) {
				break;
			}
			finalSubStirngLength--;
		}
	}

}
