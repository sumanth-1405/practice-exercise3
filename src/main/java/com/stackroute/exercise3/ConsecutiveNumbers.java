package com.stackroute.exercise3;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to check whether the given integers are consecutive or not
 */
public class ConsecutiveNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String input = sc.next();
		String output = consecutiveChecker(input);
		System.out.println(output);
	}

	/**
	 * @param input
	 * @return result 
	 * method checking the numbers are consecutive or not
	 */
	public static String consecutiveChecker(String input) {
		String[] arr = input.split(",");
		String result = "";
		int[] out = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			out[i] = Integer.parseInt(arr[i]);
		}
		for (int j = 0; j < out.length - 1; j++) {
			if (out[j + 1] - out[j] == 1) {
				result = input + " are consecutive numbers";
			} else {
				result = input + " non consecutive numbers";
			}
		}
		return result;
	}

}
