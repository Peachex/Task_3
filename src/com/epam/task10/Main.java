package com.epam.task10;

// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Main {
    public static void main(String[] args) {
        String str = "5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.";
        System.out.println(toCount(str, 'а'));
    }

    public static int toCount(String str, char symbol) {
        int symbolCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol){
                symbolCount++;
            }
        }

        return symbolCount;
    }
}
