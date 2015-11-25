/**
 * Problem: Solving for Carrots
 * https://open.kattis.com/problems/carrots
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
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

		for (int i = 0; i < contestants; i++) {
			String nextContestant = sc.nextLine();
		}

		System.out.println(inputArr[1]);
	}
}