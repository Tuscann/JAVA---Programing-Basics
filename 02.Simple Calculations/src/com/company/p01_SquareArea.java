package com.company;
import java.util.Scanner;  // 100/100

public class p01_SquareArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Integer area = a * a;

        System.out.println("Square = " + area);
    }
}
