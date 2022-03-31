package com.company;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        //Accept the User's name, age and print in following manner
        //	Ex - Hello Shery, you are 12 years old.
        Scanner input = new Scanner(System.in);
        System.out.println("give the name of the user : ");
        String name = input.next();
        System.out.println("give your age please : ");
        int age = input.nextInt();
        System.out.println("Hello "+(name) + ", you are "+ (age)+ " year old");
    }
}
