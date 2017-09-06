package com.company;

import java.util.Scanner;

public class p01_Personal_Titles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double age = Double.parseDouble(input.nextLine());
        String gender = input.nextLine();

        if (age < 16) {
            if (gender.equals("m")) {
                System.out.printf("Master");
            } else if (gender.equals("f")) {
                System.out.printf("Miss");
            }
        } else if (age >= 16) {
            if (gender.equals("m")) {
                System.out.printf("Mr.");
            } else if (gender.equals("f")) {
                System.out.printf("Ms.");
            }
        }
    }
}
