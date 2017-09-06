package com.company;

import java.util.Scanner; // 100/100

public class p08_Factorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer n = Integer.parseInt(input.nextLine());

        Integer factoriel = 1;
        for (int i = 1; i <= n; i++) {
            factoriel = factoriel * i;
        }
        System.out.printf("%d",factoriel);
    }
}
