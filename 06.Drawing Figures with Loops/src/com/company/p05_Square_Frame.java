package com.company;

import java.util.Scanner;

public class p05_Square_Frame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Integer n = Integer.parseInt(console.nextLine());
        System.out.printf("+ %s+\n", repeatStr("- ", n - 2));
        for (int i = 0; i < n - 2; i++) {
            System.out.printf("| %s|\n", repeatStr("- ", n - 2));
        }
        System.out.printf("+ %s+\n", repeatStr("- ", n - 2));

    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
