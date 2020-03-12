package com.epam.task1;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Main {
    public static void main(String[] args) {
        int size = 3;
        String[] camelCase = new String[size];
        camelCase[0] = "findSpace";
        camelCase[1] = "maxElement";
        camelCase[2] = "minElement";

        String[] snake_case = new String[size];

        for (int i = 0; i < size; i++) {
            snake_case[i] = changeCase(camelCase, size, i);
            System.out.println(camelCase[i] + "\t" + snake_case[i]);
        }
    }

    public static String changeCase(String[] camelCase, int size, int index) {
        char[] array = new char[camelCase[index].length() + 1];

        for (int i = 0; i < camelCase[index].length(); i++) {
            array[i] = camelCase[index].charAt(i);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                swap(array, i);
                array[i] = '_';
                break;
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
