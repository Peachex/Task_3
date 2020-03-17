package com.epam.task5;

/* 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
   Крайние пробелы в строке удалить. */
public class Main {
    public static void main(String[] args) {
        String str1 = "                          Hello!                          How                        are                          you?                       ";
        System.out.println(str1);

        char[] array1 = new char[str1.length()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = str1.charAt(i);
        }

        int countExtraSpaces = 0;

        int begin = 0;
        for (int i = 1; array1[i - 1] == 32; i++) {
            countExtraSpaces++;
            begin = i;
        }

        int end = array1.length;
        for (int i = array1.length - 2; array1[i + 1] == 32; i--) {
            countExtraSpaces++;
            end = i;
        }

        for (int i = begin; i < end; i++) {
            if (array1[i] == 32 && array1[i + 1] == 32) {
                countExtraSpaces++;
            }
        }

        char[] array2 = new char[array1.length - countExtraSpaces];

        int j = 0;
        for (int i = begin; i <= end ; i++) {
            if (array1[i] == 32 && array1[i + 1] == 32) {
                array2[j] = 32;
                j++;
                while (array1[i + 1] == 32) {
                    i++;
                }
            } else {
                array2[j] = array1[i];
                j++;
            }
        }

        String str2 = String.valueOf(array2);
        System.out.println(str2);
    }
}
