package com.company;

import java.util.Scanner;

public class p05_Invalid_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer n = Integer.parseInt(input.nextLine());

        if (n >= 100 && n <= 200 || n == 0){

        }
        else {
            System.out.printf("invalid");
        }
    }
}
