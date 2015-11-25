/**
 * Problem: Simon Says
 * https://open.kattis.com/problems/simonsays
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class SimonSays {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		int numOfTestCases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < numOfTestCases; i++) {
			String testCase = sc.nextLine();

			String[] testCaseArr = testCase.split(" ");

			if (testCaseArr[0].equals("Simon") && testCaseArr[1].equals("says")) {
				String returnStr = "";

				for (int k = 2; k < testCaseArr.length; k++) {
					if (k != 2) returnStr += " ";

					returnStr += testCaseArr[k];
				}

				answers.add(returnStr);
			}
		}
		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}

		
	}
}