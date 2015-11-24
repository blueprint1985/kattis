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

public class Kemija08 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		int i = 0;

		String answer = "";

		while (i < inputString.length()) {
			char c = inputString.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				answer += c;
				i += 3;
			} else {
				answer += c;
				i++;
			}
		}

		System.out.println(answer);
	}
}