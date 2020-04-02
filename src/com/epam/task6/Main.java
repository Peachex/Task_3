package com.epam.task6;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Main {
    public static void main(String[] args) {
        String str = new String("1.   Дан текст (     строка)  . Найдите наибольшее      количество подряд идущих пробелов    в  нем.");
        System.out.println("Наибольшее количество подряд идущих пробелов = " + maxSpaceNumber(str));
    }

    public static int maxSpaceNumber(String str) {
        int amount = 0;
        int maxAmount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                amount++;
            } else {
                if (amount > maxAmount) {
                    maxAmount = amount;
                }
                amount = 0;
            }
        }

        return maxAmount;
    }
}


