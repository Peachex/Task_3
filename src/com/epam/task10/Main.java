package com.epam.task10;

// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Main {
    public static void main(String[] args) {
        String str = "5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.";
        System.out.println(str.replaceAll("[^а]", "").length());
    }
}
