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

public class MixedFractions {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		while (true) {
			String inputString = sc.nextLine();

			if (inputString.equals("0 0")) break;

			String[] inputArr = inputString.split(" ");

			int numerator = Integer.parseInt(inputArr[0]);
			int denominator = Integer.parseInt(inputArr[1]);

			int wholeNumber = numerator / denominator;
			int newNumerator = numerator % denominator;

			answers.add(Integer.toString(wholeNumber) + " " + Integer.toString(newNumerator) + " / " + Integer.toString(denominator));
		}
		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}

		
	}
}