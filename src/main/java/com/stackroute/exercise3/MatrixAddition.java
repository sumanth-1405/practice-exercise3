package com.stackroute.exercise3;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to add two matrices
 */
public class MatrixAddition {
	static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        try {
        	MatrixAddition assignment = new MatrixAddition();
            System.out.println("Input number of rows of matrix: ");
            int rows = sc.nextInt();
            System.out.println(" Input number of columns of matrix: ");
            int columns = sc.nextInt();
            int[][] a = new int[rows][columns];
            int[][] b = new int[rows][columns];
            System.out.println("Input elements of first matrix: ");
            int i, j;
            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Input elements of second matrix: ");
            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
        int[][] c=assignment.matrixAdd(a, b, rows, columns);
            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    System.out.print(c[i][j]+"\t");
                    
                    
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Invalid");
        }

    }

    /**
     * @param a
     * @param b
     * @param rows
     * @param columns
     * @return c
     * method to add two matrices
     */
    public int [][] matrixAdd(int a[][], int b[][], int rows, int columns) {
        int[][] c = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }

        
    }
        return c;
    }
}