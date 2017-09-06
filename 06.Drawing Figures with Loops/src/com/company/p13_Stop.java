package com.company;

import java.util.Scanner; // 90/100

public class p13_Stop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int dots = n + 1;
        int underscopes = 2 * n + 1;

        System.out.printf("%s%s%s\n",
                repeatStr(".", n + 1),
                repeatStr("_", underscopes),
                repeatStr(".", n + 1));

        underscopes -= 2;
        dots--;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s//%s\\\\%s",
                    repeatStr(".", dots),
                    repeatStr("_", underscopes),
                    repeatStr(".", dots));
            System.out.println();

            underscopes += 2;
            dots--;
        }

        System.out.printf("//%sSTOP!%s\\\\\n",
                repeatStr("_", ((underscopes - 5) / 2)),
                repeatStr("_", ((underscopes - 5) / 2)));

        for (int i = 0; i < n; i++) {
            System.out.printf("%s\\\\%s//%s",
                    repeatStr(".", i),
                    repeatStr("_", underscopes),
                    repeatStr(".", i));
            System.out.println();
            underscopes -= 2;
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}

