package com.company;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        //Accept two integers from user and print the sum
        //	Ex - The sum of 45 & 12 = 57
        Scanner in = new Scanner(System.in);
        System.out.println("give the value of a : ");
        int a = in.nextInt();
        System.out.println("give second value of b : ");
        int b = in.nextInt();

        System.out.println("The sum of " + (a) +" & " +(b) + " = " + (a+b));
    }
}
