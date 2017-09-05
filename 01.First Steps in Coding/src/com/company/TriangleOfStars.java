package com.company;
import java.util.Collections;

public class TriangleOfStars {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.join("", Collections.nCopies(i, "*")));
        }
    }
}
