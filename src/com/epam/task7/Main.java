package com.epam.task7;

// 2. В строке вставить после каждого символа 'a' символ 'b'.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aout, aove, aility, asurd, ale.");

        insert(sb);
        System.out.println(sb);
    }

    public static void insert(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.insert(i + 1, 'b');
            }
        }
    }
}
