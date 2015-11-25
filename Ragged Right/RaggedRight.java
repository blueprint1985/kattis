/**
 * Problem: Ragged Right
 * https://open.kattis.com/problems/raggedright
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RaggedRight {
 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> lineLengths = new ArrayList<Integer>();

		while(sc.hasNextLine()) {
			lineLengths.add(sc.nextLine().length());
		}

		int last = lineLengths.remove(lineLengths.size()-1);

		int longest = 0;

		if (lineLengths.size() > 0) {
			Collections.sort(lineLengths);

			longest = lineLengths.get(lineLengths.size()-1);
		} else {
			longest = last;
		}

		int i = 0;

		if (last > longest) {
			longest = last;
			i = lineLengths.size()-1;
		} else {
			i = lineLengths.size()-2;
		}

		int score = 0;

		while (i >= 0) {
			int current = lineLengths.get(i);
			score += (int)Math.pow((double)(longest-current), (double)2);
			i--;
		}
		

		System.out.println(Integer.toString(score));
	}
}