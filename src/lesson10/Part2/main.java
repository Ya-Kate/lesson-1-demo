package lesson10.Part2;

import java.util.Scanner;

public class main {
    public static void mains (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку через пробел.");
        String printString = scanner.nextLine();
        System.out.println(printString);

        One one = new One();
        one.one(printString);

        Two two = new Two();
        two.two(printString);

        Three three = new Three();
        three.trhee(printString);

        Five five = new Five();
        five.five(printString);
    }
}
