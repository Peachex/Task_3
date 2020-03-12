package com.epam.task2;

// 2. Замените в строке все вхождения 'word' на 'letter'.
public class Main {
    public static void main(String[] args) {
        String str1 = "My word is very long. Your word isn't my word. My word.";
        System.out.println(str1);

        char[] array1 = new char[str1.length()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = str1.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < array1.length - 4; i++) {
            if (checkCondition(array1, i)) {
                count++;
            }
        }

        char[] array2 = new char[str1.length() + 2 * count];
        for (int i = 0; i < str1.length(); i++) {
            array2[i] = str1.charAt(i);
        }

        for (int i = 0; i < array2.length - 4; i++) {
            if (checkCondition(array2, i)) {
                swap(array2, i);
                array2[i] = 'l';
                array2[i + 1] = 'e';
                array2[i + 2] = 't';
                array2[i + 3] = 't';
                array2[i + 4] = 'e';
                array2[i + 5] = 'r';
                i += 5;
            }
        }

        String str2 = String.valueOf(array2);
        System.out.println(str2);
    }

    public static boolean checkCondition(char[] array, int index) {
        return (array[index] == 'w' && array[index + 1] == 'o' && array[index + 2] == 'r' && array[index + 3] == 'd');
    }

    public static void swap(char[] array, int begin) {
        int count = 0;
        while (count < 2) {
            for (int i = array.length - 1; i > begin; i--) {
                array[i] = array[i - 1];
            }
            count++;
        }
    }
}
