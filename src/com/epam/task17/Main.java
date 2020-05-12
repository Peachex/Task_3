package com.epam.task17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/* 2. Дана строка, содержащая следующий текст (xml-документ):

            <notes>
               <note id = "1">
                   <to>Вася</to>
                   <from>Света</from>
                   <heading>Напоминание</heading>
                   <body>Позвони мне завтра!</body>
               </note>
               <note id = "2">
                   <to>Петя</to>
                   <from>Маша</from>
                   <heading>Важное напоминание</heading>
                   <body/>
               </note>
            </notes>

   Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег,
   закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя. */
public class Main {
    public static void main(String[] args) {
        String str = "<notes> \n" +
                "   <note id = \"1\"> \n" +
                "       <to>Вася</to> \n" +
                "       <from>Света</from> \n" +
                "       <heading>Напоминание</heading> \n" +
                "       <body>Позвони мне завтра!</body> \n" +
                "   </note> \n" +
                "   <note id = \"2\"> \n" +
                "       <to>Петя</to> \n" +
                "       <from>Маша</from> \n" +
                "       <heading>Важное напоминание</heading> \n" +
                "       <body/> \n" +
                "   </note> \n" +
                "</notes>";

        String regex = "(<[a-z]+>)|(</[a-z]+>)|([А-Я].+[а-я][!]?)|(<.+id.+>)|(<[a-z]+/)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                System.out.println(matcher.group(1) + " - ОТКРЫВАЮШИЙ ТЕГ.");
            } else {
                if (matcher.group(2) != null) {
                    System.out.println(matcher.group(2) + " - ЗАКРЫВАЮШИЙ ТЕГ.");
                } else {
                    if (matcher.group(3) != null) {
                        System.out.println(matcher.group(3) + " - СОДЕРЖИМОЕ ТЕГА.");
                    } else {
                        if (matcher.group(4) != null) {
                            System.out.println(matcher.group(4) + " - АТРИБУТ ТЕГА.");
                        } else {
                            if (matcher.group(5) != null) {
                                System.out.println(matcher.group(5) + " - ТЕГ БЕЗ ТЕЛА.");
                            }
                        }
                    }
                }
            }
        }
    }
}