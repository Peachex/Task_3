package com.epam.task11;

// 6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("6. Из заданной строки получить новую, повторив каждый символ дважды.");

        for (int i = 0; i < sb.length(); i += 2) {
            sb.insert(i + 1, sb.charAt(i));
        }

        System.out.println(sb);
    }
}
