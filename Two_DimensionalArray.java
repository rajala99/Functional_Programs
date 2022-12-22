package com.bridgelabs.functionalprograms;

import java.util.Scanner;

public class Two_DimensionalArray {
    public static void main(String[] args) {
        int matrix[][] = new int[2][2];
        Scanner Scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println( " enter the value for ( " + i + " ," + j + ") : " );
                matrix[i][j] = Scan.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
