package com.epam.task9;

// 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Main {
    public static void main(String[] args) {
        String str = "информатика";
        System.out.println(str.substring(7, 8) + str.substring(3, 5) + str.substring(7, 8));
    }
}
