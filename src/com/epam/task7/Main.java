package com.epam.task7;

// 2. В строке вставить после каждого символа 'a' символ 'b'.
public class Main {
    public static void main(String[] args) {
        String str1 = "aout, aove, aility, asurd, ale.";
        String str2 = str1.replaceAll("a", "ab");

        System.out.println(str2);
    }
}
