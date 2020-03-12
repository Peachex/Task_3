package com.epam.task4;

// 4. В строке найти количество чисел.
public class Main {
    public static void main(String[] args) {
        String str = "My number is 11, your number is 64. 64 + 11 = 75";
        System.out.println(str);

        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                count++;
                while (i < array.length && array[i] >= '0' && array[i] <= '9') {
                    i++;
                }
            }
        }

        System.out.println("Количество чисел = " + count);
    }
}
