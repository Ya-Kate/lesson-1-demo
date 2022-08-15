package lesson10.Part2;

import java.util.Scanner;

public class Two {
    /*
    . Дана строка произвольной длины с произвольными словами.
Найти слово, в котором число различных символов минимально.
Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
     */
    public void two (String printString) {

        String[] word = printString.split(" ");
            String goal = word[0]; // искомое слово
            for (int i = 1; i < word.length; i++){
                if ( diffWords(word[i]) < diffWords(goal))
                    goal = word[i]; // новый мин.эл
            }
            System.out.println("Искомое слово: "+goal+", число разных символов: "+diffWords(goal));
    }

    private static int diffWords(String word){
        StringBuffer u = new StringBuffer(); //уникальный символ который будет содержаться однажды
        String c;// текущий символ в строке

        for (int i = 0; i < word.length(); i++) {
            c = String.valueOf(word.charAt(i));
            if (u.indexOf(c) == -1) // символ еще не встречался
                u.append(c);
        }
        return u.length();
    }
}

