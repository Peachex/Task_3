package com.epam.task10;

// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Main {
    public static void main(String[] args) {
        String str1 = "5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.";

        String str2 = str1.replaceAll("[^а]", "");
        System.out.println(str2.length());
    }
}
