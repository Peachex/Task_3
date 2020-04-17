package com.epam.task12;

import java.util.Scanner;

/* 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
   def", то должно быть выведено "abcdef". */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.nextLine());

        deleteSpaces(sb);
        deleteSameLetters(sb);

        System.out.println(sb);
    }

    public static void deleteSpaces(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
            }
        }

    }

    public static void deleteSameLetters(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
    }
}

