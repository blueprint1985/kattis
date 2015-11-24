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

public class Acm {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int problemsSolved = 0;
		int minutesResult = 0;

		String wrongString = "";

		while (true) {
			String inputString = sc.nextLine();

			if (inputString.equals("-1")) break;

			String[] inputArr = inputString.split(" ");

			int ansTime = Integer.parseInt(inputArr[0]);
			String ansResult = inputArr[2];

			if (ansResult.equals("right")) {
				problemsSolved++;

				int counter = 0;
				for(int i = 0; i < wrongString.length(); i++) {
				    if (wrongString.charAt(i) == inputArr[1].charAt(0)) {
				        counter++;
				    } 
				}



				minutesResult = minutesResult + counter*20 + ansTime;
			} else {
				wrongString += inputArr[1];
			}
		}
		
		if (problemsSolved == 0) minutesResult = 0;

		System.out.println(Integer.toString(problemsSolved) + " " + Integer.toString(minutesResult));
		
	}
}