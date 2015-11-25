/**
 * Problem: Ladder
 * https://open.kattis.com/problems/ladder
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
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

		double height = Double.parseDouble(inputArr[0]);
		double angle = Math.toRadians(Double.parseDouble(inputArr[1]));

		double length = height / Math.sin(angle);

		int answer = (int)Math.ceil(length);

		System.out.println(Integer.toString(answer));
	}
}