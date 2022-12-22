package com.bridgelabs.functionalprograms;

public class Sum_Three_Integers_zero {
    public static void main(String[] args) {
        int a[] = {3, -1, -7, -4, -5, 9, 10};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int l = j + 1; l < a.length; l++) {
                    if (a[i] + a[j] + a[l] == 0) {
                        System.out.println("Found 3 elements whose sum is = 0");
                        System.out.println("Elements are " + a[i] + " " + a[j] + " " + a[l]);
                        return;
                    }
                }
            }
        }
        System.out.println("Did not find 3 elements whose sum is = 0");
    }
}

