/**
 * Problem: Riječi
 * https://open.kattis.com/problems/rijeci
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Rijeci {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		int pressAmount = Integer.parseInt(inputString);

		String answer = "";

		int a = 1;
		int b = 0;

		for (int i = 0; i < pressAmount; i++) {
			int aOld = a;
			a = b;
			b = aOld + b;
		}

		answer += Integer.toString(a) + " " + Integer.toString(b);

		System.out.println(answer);
		
	}
}