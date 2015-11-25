/**
 * Problem: Line Them Up
 * https://open.kattis.com/problems/lineup
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class LineUp {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numOfTestCases = Integer.parseInt(sc.nextLine());

		String[] names = new String[numOfTestCases];

		for (int i = 0; i < numOfTestCases; i++) {
			names[i] = sc.nextLine();
		}

		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 0; i < numOfTestCases-1; i++) {
			if (names[i].compareTo(names[i+1]) < 0) decreasing = false;
			if (names[i].compareTo(names[i+1]) > 0) increasing = false;
		}

		if (increasing && !decreasing) System.out.println("INCREASING");
		else if (!increasing && decreasing) System.out.println("DECREASING");
		else System.out.println("NEITHER");

	}
}