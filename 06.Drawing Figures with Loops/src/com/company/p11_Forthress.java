package com.company;

import java.util.Scanner;

public class p11_Forthress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer n = Integer.parseInt(input.nextLine());

        Integer colSize = n / 2;
        Integer midSize = 2 * n - 2 * (n / 2) - 4;

        // Draw the first row
        System.out.printf("/%s\\%s/%s\\\n",repeatStr("^",colSize),repeatStr("_",midSize),repeatStr("^",colSize));
        // Middle rows
        for (int row = 1; row <= n - 3; row++)
            System.out.printf("|%s|\n",repeatStr(" ",2*n-2));
        // Draw the row before the last
        System.out.printf("|%s%s%s|\n",repeatStr(" ",colSize+1),repeatStr("_",midSize),repeatStr(" ",colSize+1));

        // Draw the last row
        System.out.printf("\\%s/%s\\%s/",repeatStr("_",colSize),repeatStr(" ",midSize),repeatStr("_",colSize));

    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
