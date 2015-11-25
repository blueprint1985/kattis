/**
 * Problem: Reverse Rot
 * https://open.kattis.com/problems/reverserot
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-25
 */

import java.lang.Math;
//import java.lang.StringBuilder;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseRot {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

		while (true) {
			String inputString = sc.nextLine();

			if (inputString.equals("0")) break;

			String[] inputArr = inputString.split(" ");

			String returnStr = "";

			int rotation = Integer.parseInt(inputArr[0]);

			for (int i = 0; i < inputArr[1].length(); i++) {
				char curr = inputArr[1].charAt(i);

				int currPos = alphabet.indexOf(curr);

				int newPos = -1;

				if (currPos > alphabet.length()-1-rotation) {
					newPos = currPos + rotation - alphabet.length();
					returnStr += Character.toString(alphabet.charAt(newPos));
				} else {
					newPos = currPos + rotation;
					returnStr += Character.toString(alphabet.charAt(newPos));
				}
			}

			answers.add(new StringBuilder(returnStr).reverse().toString());

		}

		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}	
		
	}
}