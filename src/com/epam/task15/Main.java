package com.epam.task15;

import java.util.Scanner;

/* 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
   знаком. Определить количество предложений в строке X. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println("Количество предложений = " + sentencesAmount(str));
    }

    public static int sentencesAmount(String str) {
        int amount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                amount++;
            }
        }

        return amount;
    }
}
