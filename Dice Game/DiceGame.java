/**
 * Problem: Dice Game
 * https://open.kattis.com/problems/dicegame
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class DiceGame {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString1 = sc.nextLine();
		String[] inputArr1 = inputString1.split(" ");

		int gunnar1Low = Integer.parseInt(inputArr1[0]);
		int gunnar1High = Integer.parseInt(inputArr1[1]);
		int gunnar2Low = Integer.parseInt(inputArr1[2]);
		int gunnar2High = Integer.parseInt(inputArr1[3]);

		String inputString2 = sc.nextLine();
		String[] inputArr2 = inputString2.split(" ");

		int emma1Low = Integer.parseInt(inputArr2[0]);
		int emma1High = Integer.parseInt(inputArr2[1]);
		int emma2Low = Integer.parseInt(inputArr2[2]);
		int emma2High = Integer.parseInt(inputArr2[3]);

		int gunnarMin = gunnar1Low + gunnar2Low;
		int gunnarMax = gunnar1High + gunnar2High;

		int emmaMin = emma1Low + emma2Low;
		int emmaMax = emma1High + emma2High;

		String answer = "";

		int minDiff = gunnarMin - emmaMin;
		int maxDiff = gunnarMax - emmaMax;

		int prob = maxDiff + minDiff;

		if (prob > 0) {
			answer += "Gunnar";
		} else if (prob < 0) {
			answer += "Emma";
		} else {
			answer += "Tie";
		}

		System.out.println(answer);
		
	}
}