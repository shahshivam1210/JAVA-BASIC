package com.company;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        //Extend the previous program and handle the wrong inputs.
        //      Print Good Morning sir for input m or M & Good morning Maam for input F or f
        //      else print Wrong Input
        Scanner in = new Scanner(System.in);
        System.out.println("Type m for male anf f for female ");
        char gender = in.next().charAt(0);
        if (gender=='m' || gender=='M'){
            System.out.println("Good morning Sir");
        }
        else if (gender=='f' || gender=='F'){
            System.out.println("good morning mam");
        }
        else{
            System.out.println("FUCK OFF you give wrong input");
        }

    }
}
