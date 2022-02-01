package com.aman;

import java.util.Scanner;

public class AreaofEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.732*a*a/4
        System.out.println("Enter the side A :");
        double a = in.nextDouble();
        double area = (1.732 * a * a)/4;
        System.out.println("Area of Equilateral Triangle is :" + area);
    }
}
