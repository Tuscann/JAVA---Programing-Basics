package com.company;

import java.util.Scanner;

public class p012_Currency_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double USD = 1.79549;
        Double EUR = 1.95583;
        Double GBP = 2.53405;

        Double n = Double.parseDouble(input.nextLine());
        String first = input.nextLine();
        String secound = input.nextLine();
        Double moneyInleva = 0.0;
        Double MoneyInWanted = 0.00;

        if (first.equals("USD")) {
            moneyInleva = n * USD;
        }
        else if (first.equals("BGN")) {
            moneyInleva = n;
        }
        else if (first.equals("EUR")) {
            moneyInleva = n * EUR;
        }
        else if (first.equals("GBP")) {
            moneyInleva = n * GBP;
        }

        if (secound.equals("USD")) {
            MoneyInWanted = moneyInleva / USD;
        }
        else if (secound.equals("EUR")) {
            MoneyInWanted = moneyInleva / EUR;
        }
        else if (secound.equals("GBP")) {
            MoneyInWanted = moneyInleva / GBP;
        }
        else if (secound.equals("BGN")) {
            MoneyInWanted = moneyInleva;
        }

        System.out.printf("%.2f EUR", MoneyInWanted);

    }
}
