/**
 * Problem: I've Been Everywhere, Man
 * https://open.kattis.com/problems/everywhere
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-25
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Everywhere {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numOfTestCases = Integer.parseInt(sc.nextLine());

		ArrayList<String> answers = new ArrayList<String>();

		for (int i = 0; i < numOfTestCases; i++) {

			int numOfWorkTrips = Integer.parseInt(sc.nextLine());

			ArrayList<String> cities = new ArrayList<String>();

			for (int j = 0; j < numOfWorkTrips; j++) {
				String nextCity = sc.nextLine();

				if (!cities.contains(nextCity)) cities.add(nextCity);
			}

			answers.add(Integer.toString(cities.size()));
		}

		for (int i = 0; i < numOfTestCases; i++) {
			System.out.println(answers.get(i));
		}
	}
}