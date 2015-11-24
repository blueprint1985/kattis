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
import java.util.ArrayList;

public class ReverseBinary {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int originalNum = Integer.parseInt(sc.nextLine());

		String binaryString = Integer.toBinaryString(originalNum);

		String reverseBinaryString = "";

		int binLen = binaryString.length();

		for (int i = 0; i < binLen; i++) {
			reverseBinaryString += binaryString.charAt(binLen - i - 1);
		}

		int newNum = Integer.parseInt(reverseBinaryString, 2);

		System.out.println(Integer.toString(newNum));
	}
}