/**
 * Problem: Apaxiaaaaaaaaaaaans!
 * https://open.kattis.com/problems/apaxiaaans
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-25
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Apaxiaaans {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		char prev = '0';

		String answer = "";

		for (int i = 0; i < inputString.length(); i++) {
			char curr = inputString.charAt(i);

			if (curr != prev) {
				answer += Character.toString(curr);
			}

			prev = curr;
		}
		
		System.out.println(answer);		
		
	}
}