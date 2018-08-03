package com.stackroute.exercise3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVowelRemover {
	VowelRemover obj = new VowelRemover();

	@Test
	void test() {
		String[] arr = new String[2];
		arr[0] = "India";
		arr[1] = "Germany";
		String[] arr1 = new String[2];
		arr1[0] = "Ind";
		arr1[1] = "Grmny";
		assertArrayEquals(arr1, obj.vowelRemove(arr, 2));
	}

}
