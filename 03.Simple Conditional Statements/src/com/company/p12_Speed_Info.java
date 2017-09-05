package com.company;

import java.util.Scanner;

public class p12_Speed_Info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double speed = Double.parseDouble(input.nextLine());

        if (speed <= 10) {
            System.out.printf("slow");
        } else if (speed > 10 && speed <= 50) {
            System.out.printf("average");
        }
        else if (speed > 50 && speed <= 150) {
            System.out.printf("fast");
        }
        else if (speed > 150 && speed <= 1000) {
            System.out.printf("ultra fast");
        }
        else if (speed>1000){
            System.out.printf("extremely fast");
        }
    }
}
