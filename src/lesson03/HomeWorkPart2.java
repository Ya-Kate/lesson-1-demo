package lesson03;

import java.util.Scanner;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        System.out.println("№1");
        int number = 0;
        for (;number <= 99; number++ ) {
            if (number %2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n");
        System.out.println("№2");
        for (number =15 ;number >=1; number--){
            System.out.print(number + " ");
        }

        System.out.println("\n");
        System.out.println("№3");
        System.out.println("print number >0");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        number = 1;
        int summ = 0;
        while (number <= N){
            summ += number;
            number++;
        }
        System.out.println("Number" + summ);

        System.out.println("--");
        System.out.println("№4");
        number =7;
        while (number < 100){
            System.out.print(number + " ");
            number += 7;
        }

        System.out.println("\n");
        System.out.println("№5");
        number = 0;
        N = 0;
        while (number != 10) {
            System.out.print(N + " ");
            N -= 5;
            number ++;
        }

        System.out.println("\n");
        System.out.println("№6");
        for (number = 10; number <= 20 ; number++){
            System.out.print(number * number + " ");
        }
}
}
