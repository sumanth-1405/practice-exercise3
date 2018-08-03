package com.stackroute.exercise3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMatrixAddition {
	MatrixAddition obj=new MatrixAddition();
	
	@Test
	void test() {
		int[][] arr1= {{1,2,3},{4,5,6}};
		int[][] arr2= {{7,8,9},{10,11,12}};
		int[][] arr3= {{8,10,12},{14,16,18}};
		assertArrayEquals(arr3,obj.matrixAdd(arr1,arr2,2,3));
	}
	
}
