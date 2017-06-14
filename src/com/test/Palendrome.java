package com.test;

public class Palendrome {

	public boolean callPalin(int a) {
		if (20 == a) {
			return true;

		} else
			return false;

	}

	public void reversString(String prefix, String input) {
		int length = input.length();
		if (length == 0)
			System.out.println(prefix);
		else {
			 for (int i = 0; i < length; i++)
				reversString(prefix + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, length));
		}
	}

}
