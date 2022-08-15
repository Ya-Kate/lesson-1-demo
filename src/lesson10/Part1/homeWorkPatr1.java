package lesson10.Part1;

public class homeWorkPatr1 {
    public static void main(String[] args) {
        /*
        Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.
Также надо создать свои классы исключений на каждую ситуацию:
- Проверить содержит ли номер документа последовательность abc.
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Если номер документа не удовлетворяет условию - то "бросить" исключение.
В методе класса, в котором будут вызываться эти методы для демонстрации работы, перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для
пользователя (сообщение на консоль).
         */
        String document = "1234-abc-5678-dfj-11K12m";
        System.out.println("Исходный документ: " + document);
        /*
        Вывести на экран в одну строку два первых блока по 4 цифры.
         */
        Document.dokumentBlok(document);

        /*
        Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
         */
        Document.dokumentLittReplacement(document);

        /*
        Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
         */
        Document.allLetters(document);

        /*
        Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
         */
        Document.findLitterPrintUP(document);

        String littersFindDoc = "ABC";
        Document.findLittersPrint(document,littersFindDoc);
        /*
        Проверить начинается ли номер документа с последовательности 555.
         */
        String findStartDok = "555";
        Document.startfind(document,findStartDok);
        /*
        Проверить заканчивается ли номер документа на последовательность 1a2b.
         */
        String findFinishDok = "1a2b";
        Document.finishfind(document,findFinishDok);

    }
}
