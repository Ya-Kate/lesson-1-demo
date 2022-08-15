package lesson10.Part2;

public class Five {
    /*
    Дана произвольная строка. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo".
     */

    public void five(String printString) {
        String[] word = printString.split(" ");
        System.out.println("Дублирование: ");
        for (int i = 0; i < word.length; i++) {
            String dupl = word[i].replaceAll(".", "$0$0");
            System.out.print(dupl);
            if (i+1 < word.length) {
                System.out.print(" ");
            }
        }
    }
}
