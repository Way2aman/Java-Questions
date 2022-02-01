package com.aman;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length of rectangle: ");
        float length = in.nextFloat();
        System.out.println("Enter Width of the rectangle :");
        float width = in.nextFloat();
        float area = (length * width );
        System.out.println("Area of Rectangle is :"+ area);
    }
}
