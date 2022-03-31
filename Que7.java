package com.company;
import java.util.Scanner;

public class Que7 {
    //Accept the marks of Robert in three subjects Maths, Computer, English respectively (each out of 100 ),
    //    Write a program to calculate his total marks and percentage marks.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the marks of computer out of 100");
        int comp = in.nextInt();
        System.out.println("Give the marks of history out of 100");
        int his = in.nextInt();
        System.out.println("Give the marks of maths out of 100");
        int mat = in.nextInt();
        System.out.println("total numberr of marks : " + (comp+mat+his));
        System.out.println("percentage of the given number : "+ ((comp+his+mat)*100)/300 + "%") ;
    }
}
