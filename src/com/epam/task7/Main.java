package com.epam.task7;

// 2. В строке вставить после каждого символа 'a' символ 'b'.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aout, aove, aility, asurd, ale.");

        System.out.println(sb.toString().replaceAll("a", "ab"));
    }
}
