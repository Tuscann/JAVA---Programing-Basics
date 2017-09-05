package com.company;

import java.util.Scanner;

public class p15_3_Equal_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer first = Integer.parseInt(input.nextLine());
        Integer secound = Integer.parseInt(input.nextLine());
        Integer third = Integer.parseInt(input.nextLine());

        if (first.equals(secound) && secound.equals(third)) {
            System.out.printf("yes");
        } else {
            System.out.printf("no");
        }
    }
}
