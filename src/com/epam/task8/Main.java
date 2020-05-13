package com.epam.task8;

// 3. Проверить, является ли заданное слово палиндромом.
public class Main {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "Level";
        str[1] = "madam";
        str[2] = "dog";

        view(str);
    }

    public static boolean checkWord(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        return (sb.reverse().toString().equalsIgnoreCase(str));
    }

    public static void view(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            if (checkWord(strArray[i])) {
                System.out.println("Слово \"" + strArray[i] + "\" является палиндромом.");
            } else {
                System.out.println("Слово \"" + strArray[i] + "\" не является палиндромом.");
            }
        }
    }
}
