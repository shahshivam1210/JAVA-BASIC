package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        //Accept name and age from the user. Check if the user is a valid voter or not.
        //      Vaid - Hello Shery, You are a valid voter.
        //      Invalid - Sorry Shery, you can't cast the vote.
        //	Part 2 - Print after how many years the user will be eligible
        System.out.println("Welcome in voter campain");
        Scanner in = new Scanner(System.in);
        System.out.println("Give your name please");
        String name = in.next();
        System.out.println("Give your age please");
        int age = in.nextInt();
        if (age>=18){
            System.out.println("Hello "+name+" You are Valid voter");
        }
        else{
            System.out.println("Sorry " + name +" , you can't cast the vote.");
            System.out.println("Came after "+ (18-age)+" year");
        }
    }
}
