package com.company;
import java.util.Scanner;

public class p10_Diamond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer number = Integer.parseInt(input.nextLine());
        if (number == 1) {
            System.out.printf("*");
        } else if (number == 2) {
            System.out.printf("**");
        } else {
            if (number % 2 == 0)
            {
                for (int i = 0; i < number / 2; i++)
                {
                    Integer numberOfDashes = i * 2;
                    Integer numberOfDashesOutside = number - 2 - numberOfDashes;
                    System.out.printf("%s*%s*%s\n",repeatStr("-",numberOfDashesOutside/2),repeatStr("-",numberOfDashes),repeatStr("-",numberOfDashesOutside/2));
                }
                for (int i = (number - 1) / 2 - 1; i >= 0; i--)
                {
                    Integer numberOfDashes = i * 2;
                    Integer numberOfDashesOutside = number - 2 - numberOfDashes;
                    System.out.printf("%s",repeatStr("-",numberOfDashesOutside / 2));
                    System.out.printf("*");
                    System.out.printf("%s",repeatStr("-",numberOfDashes));
                    System.out.printf("*");
                    System.out.printf("%s\n",repeatStr("-",numberOfDashesOutside / 2));
                }
            } else {
                System.out.printf("%s*%s\n",repeatStr("-",(number - 1) / 2),repeatStr("-",(number - 1) / 2));

                Integer rows = (number - 1) / 2;

                for (int curentRow = 0; curentRow < rows; curentRow++) {
                    Integer numberOfDashes = (curentRow * 2) + 1;
                    Integer numberOfDashesOutside = number - 2 - numberOfDashes;
                    System.out.printf("%s*%s*%s\n",repeatStr("-",numberOfDashesOutside / 2),repeatStr("-",numberOfDashes),repeatStr("-",numberOfDashesOutside/2));
                }
                for (int curentRow = rows - 2; curentRow >= 0; curentRow--) {
                    Integer numberOfDashes = (curentRow * 2) + 1;
                    Integer numberOfDashesOutside = number - 2 - numberOfDashes;
                    System.out.printf("%s*%s*%s\n",repeatStr("-",numberOfDashesOutside / 2),repeatStr("-",numberOfDashes),repeatStr("-",numberOfDashesOutside/2));
                }
                System.out.printf("%s*%s\n",repeatStr("-",(number - 1) / 2),repeatStr("-",(number - 1) / 2));

           }
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
