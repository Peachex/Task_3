package com.epam.task15;

import java.util.Scanner;

/* 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
   знаком. Определить количество предложений в строке X. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] strArray1 = str.split("[.!?]");

        System.out.println("Количество предложений = " + ((strArray1.length) - 1));
    }
}
