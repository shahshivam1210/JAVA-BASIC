package com.company;

import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        //Accept the gender from the user as char and print the respective greeting message
        //     Ex - Good Morning Sir (on the basis of gender)
        Scanner in = new Scanner(System.in);
        System.out.println("type M for male and F for female in capital");
        char gender = in.next().charAt(0);
        if (gender == 'M'){
            System.out.println("Good Morning sir ");
        }
        else{
            System.out.println("Good Morning mam");
        }
    }
}
