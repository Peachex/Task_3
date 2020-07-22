package com.epam.task7;

// 2. В строке вставить после каждого символа 'a' символ 'b'.
public class Main {
    public static void main(String[] args) {
        String str = "aout, aove, aility, asurd, ale.";
        System.out.println(str.replaceAll("a", "ab"));
    }
}
