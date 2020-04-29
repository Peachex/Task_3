package com.epam.task16;

import java.util.regex.Pattern;

/* 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении
по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту. */
public class Main {
    public static void main(String[] args) {
        StringBuilder sbText = new StringBuilder("Утро в середине ноября могло быть самым обыкновенным, если бы за ночь не выпало столько снега. Всё вокруг в один миг" +
                " преобразилось, как в волшебной сказке. Белоснежные сугробы покрыли мостовые, аллеи в парках, узкие дорожки во дворах, машины," +
                " как будто кто-то накинул большую накрахмаленную простыню на город. Невесомые снежинки, вздрагивая от малейшего порыва ветра, " +
                "искрятся и сверкают миллионами огней в лучах мягкого зимнего солнца, словно драгоценные кристаллы.\n\nПервый снег - это всегда" +
                " радость, настоящее преображение природы. Зима вступила в свои права, и это её щедрый подарок. Хлопья снега сыпятся из тяжелых " +
                "нависших над городом туч и пушистым ковром ложатся на улицы. Воздух свеж и чист. Голые ветки деревьев ранним утром покрывает " +
                "колючий иней, придавая им причудливую форму. Тонкие заледеневшие иголочки красиво сверкают и переливаются разноцветными огнями. " +
                "Не деревья в парке, а заколдованный лес! Морозное дыхание зимы рисует на стёклах затейливый орнамент, и окна сразу приобретают " +
                "сказочный вид.\n\nТихо. Всё вокруг замирает. Деревья, тянущие изогнутые ветви к небу, напоминают заснеженных молчаливых " +
                "истуканов. Но стоит приблизиться, и волшебство исчезает. Такая хрупкая красота! Ажурные снежинки осыпятся от лёгкого " +
                "прикосновения, оголив тёмные ветки. Но за ночь чародейка-зима всё исправит, чтобы утром все снова смогли насладиться" +
                " первозданной красотой.");

        ///////////////////////////////////////////////////////////////////////////////////////
        /*String[] paragraphsArray = split("\\s\\s", sbText);

        int[] sentencesAmount = new int[paragraphsArray.length];
        int sentencesCount = 0;

        for (int i = 0; i < paragraphsArray.length; i++) {
            for (int j = 0; j < paragraphsArray[i].length(); j++) {
                if (paragraphsArray[i].charAt(j) == '.' || paragraphsArray[i].charAt(j) == '?' || paragraphsArray[i].charAt(j) == '!') {
                    sentencesCount++;
                }
            }
            sentencesAmount[i] = sentencesCount;
            sentencesCount = 0;
        }

        String temp;

        for (int count = 0; count < paragraphsArray.length; count++) {
            for (int j = 0; j < paragraphsArray.length - 1; j++) {
                if (sentencesAmount[j] > sentencesAmount[j + 1]) {
                    temp = paragraphsArray[j];
                    paragraphsArray[j] = paragraphsArray[j + 1];
                    paragraphsArray[j + 1] = temp;
                }
            }
        }

        sbText = new StringBuilder();

        System.out.println("Количество предложений в абзаце:");

        for (int i = 0; i < paragraphsArray.length; i++) {
            System.out.println((i + 1) + ")" + sentencesAmount[i]);
            sbText.append(paragraphsArray[i] + "\n\n");
        }

        viewText(sbText);*/
        /////////////////////////////////////////////////////////////////////////

        /*String regex = "\\p{Punct}";
        Pattern pattern = Pattern.compile(regex);*/

       /* String[] paragraphsArray = split("\\s\\s", sbText);

        StringBuilder sb;

        for (int i = 0; i < paragraphsArray.length; i++) {
            sb = new StringBuilder(paragraphsArray[i]);
            String[] sentencesArray = split("\\.|!|\\?", sb);

            int countPunct = 0;

            for (int j = 0; j < sentencesArray.length; j++) {
                countPunct += sentencesArray[j].length();
                sb = new StringBuilder(sentencesArray[j]);
                String[] wordsArray = split("\\p{Blank}|\\,|\\- ", sb);
                sortWordsByLength(wordsArray);
                sentencesArray[j] = addToString(wordsArray, paragraphsArray[i].charAt(countPunct));
                countPunct++;
            }

            paragraphsArray[i] = addToString(sentencesArray, ' ');
        }

        StringBuilder sbText2 = new StringBuilder();
        for (int i = 0; i < paragraphsArray.length; i++) {
            sbText2.append(paragraphsArray[i] + "\n\n");
        }

        viewText(sbText2);*/



    }


    public static void viewText(StringBuilder sb) {
        System.out.println(sb);
    }

    public static String[] split(String regex, StringBuilder sb) {
        Pattern pattern = Pattern.compile(regex);

        return pattern.split(sb);
    }

    public static void sortWordsByLength(String[] array) {
        String temp;
        for (int count = 0; count < array.length; count++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].length() > array[i + 1].length()) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static String addToString(String[] array, char symbol) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                sb.append(array[i] + " ");
            } else {
                sb.append(array[i]);
            }
        }

        sb.append(symbol);

        return sb.toString();
    }
}
