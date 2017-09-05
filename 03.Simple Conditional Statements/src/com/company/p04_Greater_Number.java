package com.company;

import java.util.Scanner;

public class p04_Greater_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = Integer.parseInt(input.nextLine());
        int secound = Integer.parseInt(input.nextLine());


        if (first > secound) {
            System.out.println(first);
        } else {
            System.out.println(secound);
        }
    }
}
