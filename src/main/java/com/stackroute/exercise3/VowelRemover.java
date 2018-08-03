package com.stackroute.exercise3;

import java.util.Scanner;

/**
 * @author sumanth reddy
 * program to remove vowels
 */
public class VowelRemover {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the number of strings you want to enter");
		int n = sc.nextInt();
		String[] input=new String[n];
		String in;
		for (int i = 0; i < n; i++) {
			System.out.printf("enter the input %d",i+1);
			input[i]=sc.next();
		}
		String[] result = vowelRemove(input,n);
		for(int i=0;i<result.length;i++) {
		System.out.println(result[i]);}
	}

	/**
	 * @param input
	 * @param n
	 * @return result
	 * method to remove vowels from the given words
	 */
	public static String[] vowelRemove(String[] input,int n) {
		String[] result=new String[n];
		for(int i=0;i<n;i++) {
		String strOld = input[i];
		for(int j=0;j<strOld.length();j++) {
			String strNew=strOld.replaceAll("[aeiou]", "");
			result[i]=strNew;
		}
		}
		return result;
	}
}
