package com.epam.task6;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Main {
    public static void main(String[] args) {
        String str = "1.   Дан текст (     строка)  . Найдите наибольшее      количество подряд идущих пробелов    в  нем. ";

        String[] spaceStr = str.split("[^\\s]");

        System.out.println("Наибольшее количество подряд идущих пробелов = " + findMaxLength(spaceStr));
    }

    public static int findMaxLength(String[] str) {
        int maxLength = str[0].length();

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > maxLength) {
                maxLength = str[i].length();
            }
        }

        return maxLength;
    }
}


