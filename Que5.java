package com.company;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        // Accept the length and width of a rectangle. Calculate & print the area and perimiter.
        Scanner in = new Scanner(System.in);
        System.out.println("give the length of the rectangle");
        int length = in.nextInt();
        System.out.println("give the breadth of the rectangle");
        int breadth = in.nextInt();

        System.out.println("are of rectangle is : " + (length*breadth));
        System.out.println("perimeter of rectangle is : " + (2*(length+breadth)) );
    }
}
