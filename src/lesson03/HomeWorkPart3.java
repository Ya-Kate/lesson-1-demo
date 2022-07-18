package lesson03;

import java.math.BigDecimal;
import java.util.Scanner;

public class HomeWorkPart3 {
    public static void main(String[] args) {
        System.out.println("№1");
        int one =1;
        int two =1;
        int three ;
        System.out.print(one + " "+ two + " ");
        for (int i =3; i <=11; i++){
            three = one + two;
            one = two;
            two = three;
            System.out.print(three + " ");
        }

        System.out.println("\n");
        System.out.println("№2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print sum deposit");
        int sumDep = scanner.nextInt();
        System.out.println("Print sum Month");
        int sumMonth = scanner.nextInt();
        double itogSum = sumDep;
        for (int i =0; i < sumMonth; i++) {
            itogSum = itogSum + (itogSum * 0.07);
        }
        String result = String.format("%.2f",itogSum);
        System.out.print(result);

        System.out.println("--\n");
        System.out.println("№3");
        System.out.println(" Таблица Умножения:");
        for (int i =1; i <= 10; i++){
            System.out.print(" " + "  " + i );
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n"  + i + "\t");
            for (int s = 1; s <= 10; s++) {
                System.out.print(s * i + "\t");
            }
        }
    }
}
