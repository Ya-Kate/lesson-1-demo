package lesson03;

import java.util.Scanner;

public class HomeWorkPart1 {
    public static void main (String[] args) {
        /*
        Написать программу для вывода времени года по номеру месяца.
 Должно быть 2 варианта реализации: switch-case и if-else-if
         */
        System.out.println("№1");
        System.out.println("Print number month");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String season = "";
       switch (number) {
           case 1:
           case 2:
           case 12:
               season = "Winter";
               break;
           case 3:
           case 4:
           case 5:
               season = "Spring";
               break;
           case 6:
           case 7:
           case 8:
               season = "Summer";
               break;
           case 9:
           case 10:
           case 11:
               season = "Autumn";
               break;
       }
        System.out.println(season);

       if(number == 1 || number == 2 || number == 12){
           season = "Зима";
       }
         else  if(number == 3 || number == 4 || number == 5){
           season = "Весна";
        }
         else  if(number == 6 || number == 7 || number == 8){
            System.out.println("Лето");
        }
        else if(number == 9 || number == 10 || number == 11){
            System.out.println("Осень");
        }
        else {
            System.out.println("No this month");
        }
        System.out.println(season);

        /*
        Напишите программу, которая будет принимать на вход число (можно задать явно в коде)
        и на выход будет выводить сообщение о четности числа.
         */
        System.out.println("№2");
        System.out.println("Print number");
        number = scanner.nextInt() % 2;
        String print = number == 0 ? "четное" : "не четное";
        System.out.println(print);

        /*
        Для числа t (температура на улице) вывести:
- Если t > 15, то вывести «Тепло»
- Если t <= 15 и t > -5, то вывести «Нормально»
- Если t <= 5, то вывести «Холодно»
         */
        System.out.println("№3");
        System.out.println("Print 't' outside");
        int t = scanner.nextInt();
            if (t > 15){
                System.out.println("Тепло");
            }
            else if (t <= -5) {
                System.out.println("Холодно");
            }
            else  {
                System.out.println("Нормально");
            }

        /*
        По введенному (можно задать явно) номеру определить цвет радуги (1 – красный, 4 – зеленый и т.д.)
         */
        System.out.println("№4");
        System.out.println("Print number rainbow");
        number = scanner.nextInt();
        String ptintCollors = "";
        switch (number){
            case 1:
                ptintCollors = "Красный";
                break;
            case 2:
                ptintCollors = "Оранжевый";
                break;
            case 3:
                ptintCollors = "Желтый";
                break;
            case 4:
                ptintCollors = "Зеленый";
                break;
            case 5:
                ptintCollors = "Голубой";
                break;
            case 6:
                ptintCollors = "Синий";
                break;
            case 7:
                ptintCollors = "Фиолетовый";
                break;
            default:
                System.out.println("No this rainbow");
        }
        System.out.println(ptintCollors);
    }
}




