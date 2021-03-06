/**
 * Problem: Billiard
 * https://open.kattis.com/problems/billiard
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Billiard {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> answers = new ArrayList<String>();

		while (true) {
			String inputString = sc.nextLine();

			if (inputString.equals("0 0 0 0 0")) break;

			String[] inputArr = inputString.split(" ");

			int a = Integer.parseInt(inputArr[0]);
			int b = Integer.parseInt(inputArr[1]);
			int s = Integer.parseInt(inputArr[2]);
			int m = Integer.parseInt(inputArr[3]);
			int n = Integer.parseInt(inputArr[4]);

			double sideH = a * m;
            double sideV = b * n;
            double sideC = Math.sqrt(sideH * sideH + sideV * sideV);
            double angle = Math.toDegrees(Math.acos(sideH / sideC));
			
			double angleRounded = ((double)Math.round(angle * 100)) / 100;
			double timeRounded = ((double)Math.round((sideC / s) * 100)) / 100;

			String returnAngle = Double.toString(angleRounded);
			String returnTime = Double.toString(timeRounded);

			String[] angleArr = returnAngle.split("\\.");
			if (angleArr[1].length() == 1) returnAngle += "0";

			String[] timeArr = returnTime.split("\\.");
			if (timeArr[1].length() == 1) returnTime += "0";

			answers.add(returnAngle + " " + returnTime);
		}
		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(answers.get(j));
		}
	}
}