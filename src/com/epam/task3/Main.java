package com.epam.task3;

// 3. В строке найти количество цифр.
public class Main {
    public static void main(String[] args) {
        String str = "This is 4 you. It's 2 long. F_11_X_252_Z_373_C_9_H.";
        System.out.println(str);

        char[] array = new char[str.length()];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
            if (array[i] >= '0' && array[i] <= '9') {
                count++;
            }
        }
        System.out.println("Количество цифр в строке = " + count);
    }
}
