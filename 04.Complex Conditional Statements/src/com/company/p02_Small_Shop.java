package com.company;

import java.util.Scanner;

public class p02_Small_Shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String product = input.nextLine().toLowerCase();
        String city = input.nextLine().toLowerCase();
        Double quantity = Double.parseDouble(input.nextLine());

        Double prise = 0.0;

        if (city.equals("sofia")) {
            if (product.equals("coffee")) {
                prise = 0.5;
            } else if (product.equals("water")) {
                prise = 0.8;
            } else if (product.equals("beer")) {
                prise = 1.20;
            } else if (product.equals("sweets")) {
                prise = 1.45;
            } else if (product.equals("peanuts")) {
                prise = 1.6;
            }
        } else if (city.equals("plovdiv")) {
            if (product.equals("coffee")) {
                prise = 0.4;
            } else if (product.equals("water")) {
                prise = 0.7;
            } else if (product.equals("beer")) {
                prise = 1.15;
            } else if (product.equals("sweets")) {
                prise = 1.3;
            } else if (product.equals("peanuts")) {
                prise = 1.5;
            }
        } else if (city.equals("varna")) {
            if (product.equals("coffee")) {
                prise = 0.45;
            } else if (product.equals("water")) {
                prise = 0.7;
            } else if (product.equals("beer")) {
                prise = 1.1;
            } else if (product.equals("sweets")) {
                prise = 1.35;
            } else if (product.equals("peanuts")) {
                prise = 1.55;
            }
        }
        System.out.printf("%f",prise*quantity);

    }
}
