package com.company;

import java.util.Scanner;

public class p07_Sum_Seconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer first = Integer.parseInt(input.nextLine());
        Integer secound = Integer.parseInt(input.nextLine());
        Integer third = Integer.parseInt(input.nextLine());

        Integer sumSecound = first + secound + third;
        Integer minutes = sumSecound / 60;
        Integer leftSecounds = sumSecound % 60;

        if (leftSecounds < 10) {
            System.out.printf("%d:0%d", minutes,leftSecounds);
        }
        else {
            System.out.printf("%d:%d", minutes,leftSecounds);
        }
    }
}
