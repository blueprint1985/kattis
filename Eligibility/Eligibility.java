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

public class Eligibility {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		int numOfTestCases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < numOfTestCases; i++) {
			String testCase = sc.nextLine();

			String[] testCaseArr = testCase.split(" ");

			String[] psStudiesArr = testCaseArr[1].split("/");

			if (Integer.parseInt(psStudiesArr[0]) >= 2010) {
				answers.add(testCaseArr[0] + " eligible");
			} else {
				String[] birthArr = testCaseArr[2].split("/");

				if (Integer.parseInt(birthArr[0]) >= 1991) {
					answers.add(testCaseArr[0] + " eligible");
				} else {
					if (Integer.parseInt(testCaseArr[3]) > 40) {
						answers.add(testCaseArr[0] + " ineligible");
					} else {
						answers.add(testCaseArr[0] + " coach petitions");
					}
				}
			}
		}
		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}

		
	}
}