package com.epam.task14;

import java.util.Scanner;

/* 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
   буквы. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String(in.nextLine());

        int upperCaseAmount = 0;
        int lowerCaseAmount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                upperCaseAmount++;
            } else {
                if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                    lowerCaseAmount++;
                }
            }
        }

        System.out.println("Количество прописных (больших) букв = " + upperCaseAmount);
        System.out.println("Количество строчных (маленьких) букв = " + lowerCaseAmount);
    }
}
