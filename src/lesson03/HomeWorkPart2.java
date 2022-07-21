package lesson03;

import java.util.Scanner;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        /*
        При помощи цикла for вывести на экран нечетные числа от 1 до 99. (использовать инкремент)
         */
        System.out.println("№1");
        for ( int number = 0; number <= 99; number++ ) {
            if (number %2 != 0) {
                System.out.print(number + " ");
            }
        }

        /*
        При помощи цикла for вывести на экран числа от 15 до 1. (использовать декремент)
         */
        System.out.println("\n");
        int number = 0;
        System.out.println("№2");
        for (number = 15 ;number >= 1; number--){
            System.out.print(number + " ");
        }

        /*
        Напишите программу, где пользователь вводит любое целое положительное число - N. Программа
суммирует все числа от 1 до N. Для ввода числа используйте класс Scanner.
         */
        System.out.println("\n");
        System.out.println("№3");
        System.out.println("print number >0");
        Scanner scanner = new Scanner(System.in);

//        int N = scanner.nextInt() +1;
//        int summ = 0;
//        while (N-- != 0){
//            summ += N;
//        }
//        System.out.println("Number" + summ);

        int N = scanner.nextInt();
        int summ = 0;
        do {
            summ += N;
        }
        while (N-- != 1); {
            summ += N;
        }
        System.out.println("Number" + summ);



        /*
        Напишите программу, которая будет выводить на экран такую последовательность: 7 14 21 28 35 42
49 56 63 70 77 84 91 98. В решении использовать цикл while
         */
        System.out.println("№4");
        number =7;
        while (number < 100){
            if(number == 98){
                System.out.print(number);
                break;
            }
            System.out.print(number + ",");
            number += 7;
        }

        /*
        Вывести 10 первых чисел последовательности 0, -5, -10, -15…
         */
        System.out.println("\n");
        System.out.println("№5");
        number = 0;
        N = 0;
        while (number != 10) {
            System.out.print(N + " ");
            N -= 5;
            number ++;
        }

        /*
        Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
         */
        System.out.println("\n");
        System.out.println("№6");
        for (number = 10; number <= 20 ; number++){
            System.out.print(number * number + " ");
        }
}
}
