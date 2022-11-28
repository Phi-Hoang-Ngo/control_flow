package control_flow;

import java.util.HashMap;
import java.util.Map.Entry;

public class AsciiChars {

	public static void printNumbers() {

		HashMap<Integer, Integer> validNums = new HashMap<Integer, Integer>();// Creating HashMap
		validNums.put(48, 0);
		validNums.put(49, 1);
		validNums.put(50, 2);
		validNums.put(51, 3);
		validNums.put(52, 4);
		validNums.put(53, 5);
		validNums.put(54, 6);
		validNums.put(55, 7);
		validNums.put(56, 8);
		validNums.put(57, 9);
		for (Entry<Integer, Integer> m : validNums.entrySet()) {
			System.out.println(m.getValue() + " " + m.getKey());
		}
	}

	public static void printLowerCase() {
		char[] letters = new char[123];
		int i;
		char x = 'a';
		for (i = 97; i < 123; i++) {
			letters[i] = x;
			System.out.println(x + " " + i);
			x++;
		}

	}

	public static void printUpperCase() {
		char[] letters = new char[91];
		int i;
		char x = 'A';
		for (i = 65; i < 91; i++) {
			letters[i] = x;
			System.out.println(x + " " + i);
			x++;
		}
	}
}
