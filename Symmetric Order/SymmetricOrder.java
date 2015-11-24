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

public class SymmetricOrder {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		int caseCounter = 1;

		while (true) {
			String inputString = sc.nextLine();

			if (inputString.equals("0")) break;

			int nameAmount = Integer.parseInt(inputString);

			String[] names = new String[nameAmount];

			int lowCounter = 0;
			int highCounter = nameAmount - 1;

			answers.add("SET " + Integer.toString(caseCounter));
			caseCounter++;

			for (int i = 0; i < nameAmount; i++) {
				if (i % 2 == 0) {
					names[lowCounter] = sc.nextLine();
					lowCounter++;
				} else {
					names[highCounter] = sc.nextLine();
					highCounter--;
				}
			}

			for (int i = 0; i < nameAmount; i++) {
				answers.add(names[i]);
			}
		}
		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}
		
		
	}
}