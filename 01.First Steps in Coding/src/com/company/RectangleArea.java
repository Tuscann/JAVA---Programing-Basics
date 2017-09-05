package com.company;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer a = Integer.parseInt(input.nextLine());
        Integer b = Integer.parseInt(input.nextLine());

        System.out.println(a*b);
    }
}
