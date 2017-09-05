package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Square_Of_Stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer n=Integer.parseInt(input.nextLine());

        System.out.println(String.join("", Collections.nCopies(n, "*")));
        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            System.out.print(String.join("", Collections.nCopies(n-2, " ")));
            System.out.println("*");
        }
        System.out.println(String.join("", Collections.nCopies(n, "*")));
    }
}
