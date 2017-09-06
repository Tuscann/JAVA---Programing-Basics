package com.company;

import java.util.Scanner;

public class p01_Numbers_from_1_to_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer zero = input.nextInt();

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
