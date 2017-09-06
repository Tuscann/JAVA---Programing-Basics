package com.company;

import java.util.Scanner;

public class p07_Fruit_Shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.nextLine().toLowerCase();
        String day = input.nextLine().toLowerCase();
        Double quantity = Double.parseDouble(input.nextLine());

        Double price = -1.0;
        Boolean error = false;


        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            if (fruit.equals("banana")) {
                price = 2.5;
            } else if (fruit.equals("apple")) {
                price = 1.2;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.7;
            } else if (fruit.equals("pineapple")) {
                price = 5.5;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                error = true;
            }
        } else if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) {
                price = 2.7;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.9;
            } else if (fruit.equals("grapefruit")) {
                price = 1.6;
            } else if (fruit.equals("kiwi")) {
                price = 3.0;
            } else if (fruit.equals("pineapple")) {
                price = 5.6;
            } else if (fruit.equals("grapes")) {
                price = 4.2;
            } else {
                error = true;
            }
        } else {
            error = true;
        }

        if (error) {
            System.out.printf("error");
        } else {
            System.out.printf("%.2f", price * quantity);
        }

    }
}
