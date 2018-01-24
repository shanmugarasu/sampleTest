package com;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubsttr {
	public static void main(String arg[]) {

		String a = "aacivicxx";

		char[] charArray = a.toCharArray();
		Set s = new HashSet(charArray.length);
		int finalSubStirngLength = charArray.length;
		int tempSubStirngLength = 0;
		int breakedSubStirngLength = 0;
		int currentSubStirngLength = 0;

		while (finalSubStirngLength > breakedSubStirngLength) {
			s.clear();
			int pos = charArray.length - finalSubStirngLength;
			System.out.println("pos" + pos);
			for (int j = pos; j < charArray.length; j++) {
				if (s.contains(charArray[j])) {
					breakedSubStirngLength = s.size();
					System.out.println("breakedSubStirngLength :" + breakedSubStirngLength);
					break;
				} else {
					s.add(charArray[j]);
				}
			}
			currentSubStirngLength = s.size();
			System.out.println("currentSubStirngLength :" + currentSubStirngLength);
			tempSubStirngLength = currentSubStirngLength > breakedSubStirngLength ? currentSubStirngLength
					: breakedSubStirngLength;
			int totalSize = currentSubStirngLength + pos;
			if (totalSize == charArray.length) {
				break;
			}
			finalSubStirngLength--;
		}
		System.out.println("result:" + tempSubStirngLength);

	}

}
