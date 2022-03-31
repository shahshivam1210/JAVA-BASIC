package com.company;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        //Take 3 int inputs from user and check and print the result.
        //	all are equal
        //	any of two are equal
        //	( use && || )
        Scanner in = new Scanner(System.in);
        System.out.println("give the first number");
        int a = in.nextInt();
        System.out.println("give the Second number");
        int b = in.nextInt();
        System.out.println("give the third number");
        int c = in.nextInt();
        if(a==b && b==c){
            System.out.println("All the elemnt are equal");
        }
        else if(a!=b && b==c){
            System.out.println("2nd and 3rd elemenet are equal");
        }
        else if(a==b && b!=c){
            System.out.println("1st and 2nd elemenet are equal");
        }
        else{
            System.out.println("FUCK OFF go and check the code");
        }

    }
}
