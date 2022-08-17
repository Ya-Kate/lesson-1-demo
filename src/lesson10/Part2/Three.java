package lesson10.Part2;

import java.util.Scanner;

public class Three {
    /*
    . Дана строка произвольной длины с произвольными словами.
Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
     */

    public void trhee (String printString) {
        String[] word = printString.split(" ");
        System.out.println("Введите номер слова, проверяющего на полиндром");
        int i = 0;
        boolean polidrom = false;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String numWord = scanner.next();
            try {
                i = Integer.parseInt(String.valueOf(numWord));
            }
            catch (NumberFormatException e) {
                System.out.println("Введите число");
                continue;
            }
            if (i < 0 || i > word.length) {
                System.out.println("Нет слова под таким номером ");
                System.out.println("Введите от 1 до " + word.length);
            }
            else {
                break;
            }
        }

        polidrom = find(word[i-1]);
        System.out.println(word[i-1] + ": является " + polidrom + " Палиндромом ");
    }

    public boolean find (String word) {
        boolean findPolidromTrue;

        findPolidromTrue = word.replaceAll ("\\ s", "") .equals (new StringBuilder(word.replaceAll
                ("\\ s", "")). reverse ( ) .toString () + "");

        return findPolidromTrue;
    }
}
