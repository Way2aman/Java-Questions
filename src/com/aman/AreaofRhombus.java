package com.aman;

import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Diagonal A :");
        float a = in.nextFloat();
        System.out.println("Enter Diagonal B :");
        float b = in.nextFloat();
        float area = (a*b)/2;
        System.out.println("Area of Rhombus is :" + area);

    }
}
