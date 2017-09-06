package com.company;

import java.util.Scanner;

public class p12_Butterfly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer n = Integer.parseInt(input.nextLine());
        System.out.printf("%s\\ /%s\n", repeatStr("*", n - 2), repeatStr("*", n - 2));
        for (int i = 1; i <= n / 2 - 1; i++) {
            System.out.printf("%s\\ /%s\n",repeatStr("-", n - 2), repeatStr("-", n - 2));
            System.out.printf("%s\\ /%s\n", repeatStr("*", n - 2), repeatStr("*", n - 2));

        }
        System.out.printf("%s@%s\n",repeatStr(" ",n-1),repeatStr(" ",n-1));
        System.out.printf("%s/ \\%s\n", repeatStr("*", n - 2), repeatStr("*", n - 2));

        for (int i = 1; i <= n / 2 - 1; i++) {
            System.out.printf("%s/ \\%s\n", repeatStr("-", n - 2), repeatStr("-", n - 2));
            System.out.printf("%s/ \\%s\n", repeatStr("*", n - 2), repeatStr("*", n - 2));
        }
    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
