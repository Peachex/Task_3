package com.epam.task14;

import java.util.Scanner;

/* 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
   буквы. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String str1 = str.replaceAll("[a-z]", "");
        String str2 = str.replaceAll("[A-Z]", "");

        System.out.println("Количество прописных (больших) букв = " + str1.length());
        System.out.println("Количество строчных (маленьких) букв = " + str2.length());
    }
}
