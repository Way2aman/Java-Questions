package com.aman;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base of triangle: ");
        float base = in.nextFloat();
        System.out.println("Enter Height of the Triangle :");
        float height = in.nextFloat();
        float area = (base * height )/2;
        System.out.println("Area of Triangle is :"+ area);

    }
}
