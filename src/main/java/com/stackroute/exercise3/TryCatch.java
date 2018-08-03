package com.stackroute.exercise3;

/**
 * @author sumanth reddy 
 * program to handle try,catch,finally blocks
 */
public class TryCatch {
	TryCatch(String exc) {
		exc = "this statement is catched";
	}

	public static void main(String[] args) throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("iam here");
		}
	}
}
