/**
 * Problem: Speed Limit
 * https://open.kattis.com/problems/speedlimit
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class SpeedLimit {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> answers = new ArrayList<Integer>();

		int i = 0;
		int totDist = 0;
		int time = 0;

		while (true) {
			String inputString = sc.nextLine();

			String[] inputArr = inputString.split(" ");

			if (inputArr.length == 1) {
				if (i == 1) answers.add(totDist);
				if (inputString.equals("-1")) break;
				i = 1;
				totDist = 0;
				time = 0;
			} else {
				int speed = Integer.parseInt(inputArr[0]);
				int currTime = Integer.parseInt(inputArr[1]);
				int driveTime = currTime - time;
				int dist = speed * driveTime;
				time = currTime;
				totDist = totDist + dist;
			}
		}
		
		for (int j = 0; j < answers.size(); j++) {
			System.out.println(Integer.toString(answers.get(j)) + " miles");
		}

		
	}
}