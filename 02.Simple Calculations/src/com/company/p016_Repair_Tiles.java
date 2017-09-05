package com.company;

import java.util.Scanner;

public class p016_Repair_Tiles {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        Double N = Double.parseDouble(n.nextLine());
        Double W = Double.parseDouble(n.nextLine());
        Double L = Double.parseDouble(n.nextLine());
        Double M = Double.parseDouble(n.nextLine());
        Double O = Double.parseDouble(n.nextLine());

        Double area = ((N * N) - (M * O)) / (W * L);
        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", area*0.2);
    }
}
