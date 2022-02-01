package com.aman;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = in.nextInt();      // taking input in radius variable
        float area = (float) ((3.14)*( radius * radius));    // expression for Area of circle
        System.out.println("Area of circle is: " + area);

    }
}
