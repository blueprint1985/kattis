/**
 * Problem: Toilet Seat
 * https://open.kattis.com/problems/toilet
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Toilet {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		int policy1 = 0;
		int policy2 = 0;
		int policy3 = 0;
		char lastpos = 'Q';

		for (int i = 0; i < inputString.length(); i++) {
			if (i == 0) {
				lastpos = inputString.charAt(i);
			} else if (i == 1) {
				if (inputString.charAt(i) != lastpos) {
					policy1++;
					policy2++;
					policy3++;
				}
				if (inputString.charAt(i) == 'D') policy1++;
				if (inputString.charAt(i) == 'U') policy2++;
				lastpos = inputString.charAt(i);
			} else {
				if (inputString.charAt(i) == 'D') policy1 += 2;
				if (inputString.charAt(i) == 'U') policy2 += 2;
				if (inputString.charAt(i) != lastpos) policy3++;
				lastpos = inputString.charAt(i);
			}
		}

		System.out.println(Integer.toString(policy1));
		System.out.println(Integer.toString(policy2));
		System.out.println(Integer.toString(policy3));

	}
}