package com.company;
import java.util.Scanner;

public class p11_Equal_Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine().toLowerCase();
        String secound = input.nextLine().toLowerCase();

        if (first.equals(secound)) {
            System.out.printf("yes");
        }
        else {
            System.out.printf("no");
        }
    }
}
