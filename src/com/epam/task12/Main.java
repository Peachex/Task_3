package com.epam.task12;

import java.util.Scanner;

/* 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
   def", то должно быть выведено "abcdef". */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();

        deleteSameLetters(str1.replaceAll("\\p{Blank}", ""));
    }

    public static void deleteSameLetters(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!sb.toString().contains(String.valueOf(str.charAt(i)))) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
