package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        Double PI = 3.14159;
        //double Area = PI*radius*radius;
        double Area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+radius+" is:"+Area);
    }
}
