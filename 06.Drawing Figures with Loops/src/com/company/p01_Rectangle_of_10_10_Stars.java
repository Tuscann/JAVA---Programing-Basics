package com.company;

import java.util.Scanner;

public class p01_Rectangle_of_10_10_Stars {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Integer n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
