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

public class Pet {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxRes = 0;
		int maxCont = 0;

		for (int i = 0; i < 5; i++) {
			String inputString = sc.nextLine();

			String[] inputArr = inputString.split(" ");

			int thisRes = 0;

			for (int j = 0; j < 4; j++) {
				thisRes += Integer.parseInt(inputArr[j]);
			}

			if (thisRes > maxRes) {
				maxRes = thisRes;
				maxCont = i + 1;
			}
		}

		String answer = Integer.toString(maxCont) + " " + Integer.toString(maxRes);

		System.out.println(answer);
		
	}
}