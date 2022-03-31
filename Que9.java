package com.company;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        //Accept the Principle amount, time & rate of interest and calculate the Simple Interest
        Scanner in = new Scanner(System.in);
        System.out.println("give the principal of  amount : ");
        int pri = in.nextInt();
        System.out.println("give the rate of intrest");
        int rate = in.nextInt();
        System.out.println("give hte time of intrest");
        int time = in.nextInt();

        float principal = pri*(1+(rate*time));
        System.out.println("So the Simpal INTREST : "+principal);

    }
}
