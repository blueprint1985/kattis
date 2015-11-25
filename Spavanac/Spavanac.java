/**
 * Problem: Spavanac
 * https://open.kattis.com/problems/spavanac
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;

public class Spavanac {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		String[] inputArr = inputString.split(" ");

		int hours = Integer.parseInt(inputArr[0]);
		int minutes = Integer.parseInt(inputArr[1]);

		if (minutes < 45) {
			if (hours == 0) {
				hours = 23;
			} else {
				hours--;
			}
			
			minutes = 60 + (minutes-45);
		} else {
			minutes = minutes - 45;
		}

		System.out.println(Integer.toString(hours) + " " + Integer.toString(minutes));
	}
}