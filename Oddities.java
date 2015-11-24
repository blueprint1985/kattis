/**
 * Ladder by Martin Björling, 
 * martinbjorling@gmail.com, 0737565044
 *
 * @author   Martin Björling
 * @version  1.0
 * @since    2015-11-04
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Oddities {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		int numOfTestCases = Integer.parseInt(sc.nextLine());

		if (numOfTestCases < 0 || numOfTestCases > 20) {
			System.out.println("Wrong value");
			System.exit(1);
		}

		for (int i = 0; i < numOfTestCases; i++) {
			int testCase = Integer.parseInt(sc.nextLine());

			if (testCase < -10 || testCase > 10) {
				System.out.println("Wrong value");
				System.exit(1);
			}

			if (testCase % 2 == 0) answers.add(Integer.toString(testCase) + " is even");
			else answers.add(Integer.toString(testCase) + " is odd");
		}

		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}

		
	}
}