package com.company;

import java.util.Scanner;

public class p03_Latin_Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer n = Integer.parseInt(input.nextLine());

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.printf(i + " ");
        }
    }
}
