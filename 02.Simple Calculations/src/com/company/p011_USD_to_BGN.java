package com.company;

import java.util.Scanner;

public class p011_USD_to_BGN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double dollars = Double.parseDouble(input.nextLine());

        Double leva = dollars * 1.79549;
        System.out.printf("%.2f BGN", leva);
    }
}
