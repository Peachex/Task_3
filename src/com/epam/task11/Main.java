package com.epam.task11;

// 6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Main {
    public static void main(String[] args) {
        String str1 = "6. Из заданной строки получить новую, повторив каждый символ дважды.";

        String str2 = addSymbols(str1);
        System.out.println(str2);
    }

    public static String addSymbols(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i += 2) {
            sb.insert(i + 1, sb.charAt(i));
        }

        return sb.toString();
    }
}
