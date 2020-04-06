package com.epam.task9;

// 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Main {
    public static void main(String[] args) {
        String strWord1 = "информатика";

        String str1 = returnLetter(strWord1, 'т');
        String str2 = returnLetter(strWord1, 'о');
        String str3 = returnLetter(strWord1, 'р');
        String str4 = returnLetter(strWord1, 'т');

        String strWord2 = str1.concat(str2).concat(str3).concat(str4);
        System.out.println(strWord2);
    }

    public static String returnLetter(String str, char letter) {
        int count = 0;

        while (count < str.length() - 1 && str.charAt(count) != letter) {
            count++;
        }

        return String.valueOf(str.charAt(count));
    }
}
