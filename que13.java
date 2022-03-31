package com.company;

import java.util.Scanner;

public class que13 {
    public static void main(String[] args) {
        // Accept an integer and check whether it is an even number or odd.
        Scanner in = new Scanner(System.in);
        System.out.println("give an integer to check weather it is even or odd");
        int integer = in.nextInt();
        if (integer%2==1 && integer%integer==0){
            System.out.println("that is odd");
        }
        else{
            System.out.println("this is even number");
        }
    }
}
