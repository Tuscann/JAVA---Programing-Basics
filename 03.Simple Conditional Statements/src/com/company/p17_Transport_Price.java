package com.company;

import java.util.Scanner;

public class p17_Transport_Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer km = Integer.parseInt(input.nextLine());
        String typeOfDay = input.nextLine();

        Double Taxe = 0.0;

        if (km < 20) {
            if (typeOfDay.equals("day")) {
                Taxe = 0.79;
            } else if (typeOfDay.equals("night")) {
                Taxe = 0.9;
            }
            Double taxiStart = 0.70;
            System.out.println(taxiStart + km * Taxe);
        } else if (km >= 20 && km < 100) {
            Taxe = 0.09;
            System.out.println(km*Taxe);
        }
        else if (km >= 100) {
            Taxe = 0.06;
            System.out.println(km*Taxe);
        }
    }
}
