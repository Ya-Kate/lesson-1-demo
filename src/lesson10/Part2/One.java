package lesson10.Part2;

import java.util.Scanner;

public class One {

    public void one (String printString) {
         /*
       Дана строка произвольной длины с произвольными словами.
Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.
        */

        String[] word = printString.split(" ");
        wordShort(word);
        wordLong(word);
    }


    public static void wordShort(String[] word) {

        String wordShort = word[0];
        for (int i = 0; i < word.length; i++) {
            if (wordShort.length() > word[i].length()) {
                wordShort = word[i];
            }
        }
        System.out.println("Самое короткое слово: " + wordShort);
    }

    public static void wordLong(String[] words) {

        String wordLong = "";
        for (int i = 0; i < words.length; i++) {
            if (wordLong.length() <= words[i].length()) {
                wordLong = words[i];
            }
        }
        System.out.println("Самое длинное слово: " + wordLong);
    }
}
