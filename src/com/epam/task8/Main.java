package com.epam.task8;

// 3. Проверить, является ли заданное слово палиндромом.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Level");
        StringBuilder sb2 = new StringBuilder("madam");
        StringBuilder sb3 = new StringBuilder("dog");

        view(sb1);
        view(sb2);
        view(sb3);
    }

    public static boolean checkWord(StringBuilder sb) {
        String str = sb.toString();
        String strReverse = sb.reverse().toString();
        sb.reverse();

        return (str.compareToIgnoreCase(strReverse) == 0);
    }

    public static void view(StringBuilder sb) {
        if (checkWord(sb)) {
            System.out.println("Слово \"" + sb + "\" является палиндромом.");
        } else {
            System.out.println("Слово \"" + sb + "\" не является палиндромом.");
        }
    }
}
