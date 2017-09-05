package com.company;

import java.util.Scanner;

public class p03_Greeting_by_Name {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
