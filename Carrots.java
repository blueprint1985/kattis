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

public class Carrots {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		String[] inputArr = inputString.split(" ");

		int contestants = Integer.parseInt(inputArr[0]);
		int carrots = Integer.parseInt(inputArr[1]);

		if (contestants < 1 || carrots > 1000) {
			System.out.println("Wrong value");
			System.exit(1);
		}

		for (int i = 0; i < contestants; i++) {
			String nextContestant = sc.nextLine();
		}

		System.out.println(inputArr[1]);
	}
}