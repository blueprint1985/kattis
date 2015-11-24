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

public class Ladder {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		String[] inputArr = inputString.split(" ");

		int heightInt = Integer.parseInt(inputArr[0]);
		int angleInt = Integer.parseInt(inputArr[1]);

		if (heightInt < 1 || heightInt > 10000 || angleInt < 1 || angleInt > 89) {
			System.out.println("Wrong value");
			System.exit(1);
		}

		double height = Double.parseDouble(inputArr[0]);
		double angle = Math.toRadians(Double.parseDouble(inputArr[1]));

		double length = height / Math.sin(angle);

		int minLen = (int)Math.ceil(length);

		System.out.println(Integer.toString(minLen));
	}
}