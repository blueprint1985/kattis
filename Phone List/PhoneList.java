/**
 * Phone List by Martin Björling, 
 * martinbjorling@gmail.com, 0737565044
 *
 * @author   Martin Björling
 * @version  1.0
 * @since    2015-11-04
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PhoneList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numOfTestCases = Integer.parseInt(sc.nextLine());

		ArrayList<String> answers = new ArrayList<String>();

		for (int i = 0; i < numOfTestCases; i++) {

			int numOfPhoneNumbers = Integer.parseInt(sc.nextLine());

			ArrayList<String> numbers = new ArrayList<String>();

			for (int j = 0; j < numOfPhoneNumbers; j++) {
				String nextNumber = sc.nextLine();

				numbers.add(nextNumber);
			}

			Collections.sort(numbers);

			boolean isConsistent = true;

			for (int j = 0; j < numOfPhoneNumbers-1; j++) {
				String str1 = numbers.get(j);
				String str2 = numbers.get(j+1);

				if (str1.length() < str2.length()) str2 = str2.substring(0,str1.length());

				if (str1.equals(str2)) {
					isConsistent = false;				
					break;
				}
			}

			String ansString = (isConsistent) ? "YES" : "NO";

			answers.add(ansString);
		}

		for (int i = 0; i < numOfTestCases; i++) {
			System.out.println(answers.get(i));
		}
	}
}