package com.bridgelabs.functionalprograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x1, x2, y1, y2 ;
        double distance;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x1 point");
        x1 = scan.nextInt();
        System.out.println("enter y1 point");
        y1 = scan.nextInt();
        System.out.println("enter x2 point");
        x2 = scan.nextInt();
        System.out.println("enter y2 point");
        y2 = scan.nextInt();
        distance = Math.sqrt(( x2 - x1 ) * ( x2 - x1 )  +  ( y2 - y1 ) * ( y2 - y1 ));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);
    }
}



