package lesson03;

import java.util.Scanner;

public class HomeWorkPart1 {
    public static void main (String[] args) {
        System.out.println("№1");
        System.out.println("Print number month");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
       switch (number) {
           case 1:
               System.out.println("January");
               break;
           case 2:
               System.out.println("February");
               break;
           case 3:
               System.out.println("March");
               break;
           case 4:
               System.out.println("April");
               break;
           case 5:
               System.out.println("May");
               break;
           case 6:
               System.out.println("June");
               break;
           case 7:
               System.out.println("July");
               break;
           case 8:
               System.out.println("August");
               break;
           case 9:
               System.out.println("September");
               break;
           case 10:
               System.out.println("October");
               break;
           case 11:
               System.out.println("November");
               break;
           case 12:
               System.out.println("Descember");
               break;

       }
       if(number == 1){
           System.out.println("Январь");
       }
        else if(number == 2){
            System.out.println("Февраль");
        }
         else  if(number == 3){
            System.out.println("Март");
        }
         else  if(number == 4){
            System.out.println("Апрель");
        }
         else  if(number == 5){
            System.out.println("Май");
        }
         else  if(number == 6){
            System.out.println("Июнь");
        }
        else if(number == 7){
            System.out.println("Июль");
        }
        else if(number == 8){
            System.out.println("Август");
        }
        else if(number == 9){
            System.out.println("Сентябрь");
        }
        else if(number == 10){
            System.out.println("Октябрь");
        }
        else if(number == 11){
            System.out.println("Ноябрь");
        }
        else if(number == 12){
            System.out.println("Декабрь");
        }
        else {
            System.out.println("No this month");
        }


        System.out.println("--");
        System.out.println("№2");
        System.out.println("Print number");
        number = scanner.nextInt() % 2;
        String print = number == 0 ? "четное" : "не четное";
        System.out.println(print);


        System.out.println("--");
        System.out.println("№3");
        System.out.println("Print 't' outside");
        int t = scanner.nextInt();
        boolean peremen = true;
        while (peremen){
            if (t > 15){
                System.out.println("Тепло");
            }
            if (t <= 15 && t > -5) {
                System.out.println("Нормально");
            }
            if (t <= -5) {
                System.out.println("Холодно");
            }
            peremen = false;
        }


        System.out.println("--");
        System.out.println("№4");
        System.out.println("Print number rainbow");
        number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
        }
        if(number < 1 || number > 7) {
            System.out.println("No this rainbow");
        }
    }
}




