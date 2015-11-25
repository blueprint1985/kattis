/**
 * Problem: The Easiest Problem Is This One
 * https://open.kattis.com/problems/easiest
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Easiest {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		while (true) {
			String inputString = sc.nextLine();

			if (inputString.equals("0")) break;

			int inputSum = 0;

			for (int i = 0; i < inputString.length(); i++) {
				char c = inputString.charAt(i);

				inputSum += Character.getNumericValue(c);
			}

			int inputInt = Integer.parseInt(inputString);

			int k = 11;

			while (true) {
				int sumOfMult = inputInt * k;

				String sumString = Integer.toString(sumOfMult);

				int multSum = 0;

				for (int l = 0; l < sumString.length(); l++) {
					char d = sumString.charAt(l);

					multSum += Character.getNumericValue(d);
				}

				if (multSum == inputSum) {
					answers.add(Integer.toString(k));
					break;
				}

				k++;
			}
			
		}
		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}
		
		
	}
}