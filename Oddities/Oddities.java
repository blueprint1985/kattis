/**
 * Problem: Oddities
 * https://open.kattis.com/problems/oddities
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Oddities {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		int numOfTestCases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < numOfTestCases; i++) {
			int testCase = Integer.parseInt(sc.nextLine());

			if (testCase % 2 == 0) answers.add(Integer.toString(testCase) + " is even");
			else answers.add(Integer.toString(testCase) + " is odd");
		}

		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}

		
	}
}