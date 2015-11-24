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

public class Tri {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();
		String[] inputArr = inputString.split(" ");

		double first = Double.parseDouble(inputArr[0]);
		double second = Double.parseDouble(inputArr[1]);
		double third = Double.parseDouble(inputArr[2]);

		String answer = "";

		if ((first + second) == third) {
			answer += inputArr[0] + "+" + inputArr[1] + "=" + inputArr[2];
		} else if ((first - second) == third) {
			answer += inputArr[0] + "-" + inputArr[1] + "=" + inputArr[2];
		} else if ((first * second) == third) {
			answer += inputArr[0] + "*" + inputArr[1] + "=" + inputArr[2];
		} else if ((first / second) == third) {
			answer += inputArr[0] + "/" + inputArr[1] + "=" + inputArr[2];
		} else if (first == (second + third)) {
			answer += inputArr[0] + "=" + inputArr[1] + "+" + inputArr[2];
		} else if (first == (second - third)) {
			answer += inputArr[0] + "=" + inputArr[1] + "-" + inputArr[2];
		} else if (first == (second * third)) {
			answer += inputArr[0] + "=" + inputArr[1] + "*" + inputArr[2];
		} else if (first == (second / third)) {
			answer += inputArr[0] + "=" + inputArr[1] + "/" + inputArr[2];
		} else {
			answer += "none";
		}

		System.out.println(answer);
		
	}
}