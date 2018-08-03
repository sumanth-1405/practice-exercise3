package com.stackroute.exercise3;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to get student marks
 */
public class StudentMarks {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the number of students");
		int numOfStudents = sc.nextInt();
		stuGrades(numOfStudents);
	}

	/**
	 * @param numOfStudents
	 * method to take student grades and handling exceptions
	 */
	public static void stuGrades(int numOfStudents) {
		int[] grades = new int[numOfStudents];
		try {
			for (int i = 0; i < numOfStudents; i++) {
				System.out.printf("enter the grade of student %d\n", i + 1);
				grades[i] = sc.nextInt();
				if (grades[i] < 0 || grades[i] > 100) {
					throw new ArithmeticException();
				}
			}
		} catch (ArithmeticException e) {
			System.err.println("grade should be between 0 to 100");
		}

	}
}
