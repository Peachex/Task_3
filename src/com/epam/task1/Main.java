package com.epam.task1;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Main {
    public static void main(String[] args) {
        int size = 3;
        String[] camelCase = new String[size];
        camelCase[0] = "findOutExtraSpace";
        camelCase[1] = "maxElement";
        camelCase[2] = "SNAKECASE";

        String[] snakeCase = new String[size];

        for (int i = 0; i < size; i++) {
            snakeCase[i] = changeCase(camelCase[i]);
            System.out.println(camelCase[i] + "\t" + snakeCase[i]);
        }
    }

    public static String changeCase(String camelCase) {
        int count = 0;

        for (int i = 0; i < camelCase.length(); i++) {
            if (camelCase.charAt(i) >= 'A' && camelCase.charAt(i) <= 'Z') {
                count++;
            }
        }

        char[] array = new char[camelCase.length() + count];

        for (int i = 0; i < camelCase.length(); i++) {
            array[i] = camelCase.charAt(i);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                swap(array, i);
                array[i] = '_';
                array[i + 1] = (char) (array[i + 1] + 'a' - 'A');
            }
        }

        return String.valueOf(array);
    }

    public static void swap(char[] array, int begin) {
        for (int i = array.length - 1; i > begin; i--) {
            array[i] = array[i - 1];
        }
    }
}
