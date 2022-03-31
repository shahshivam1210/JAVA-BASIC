package com.company;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        //Write a program to accept temperature in Fahrenheit & convert into Celsius. (Look for the formula on internet)
        Scanner in = new Scanner(System.in);
        System.out.println("give temporature in ferenhight to convert in celcious");
        int fre = in.nextInt();
        float cel = (fre-32)*5/9;
        System.out.println("temprature in celcious : " + cel +"C");
    }
}
