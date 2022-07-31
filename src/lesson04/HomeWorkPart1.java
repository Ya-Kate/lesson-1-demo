package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkPart1 {
    public static void main(String[] args) {
        /*
        Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
(класс Scanner).
         */
        System.out.println("№ 1");
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean thereIs = false;
        int[] array = new int[] {1, 2, 3, 4, 5};
        for (int i =0; i < array.length; i++) {
            if (number == array[i]) {
                thereIs = true;
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        if (thereIs) {
            System.out.println("число:" + number + "- входит в массив");
        }
        else {
            System.out.println("число:" + number + "- НЕ входит в массив");
        }

        /*
         Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
число задается с консоли (класс Scanner). Если такого числа нет – выведите сообщение
об этом.
         */
        System.out.println("№ 2");
        int[] arrayOne = new int[] {1, 2, 3, 3, 4, 4, 4};
        int[] arrayTwo;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число");
        int number1 = scanner1.nextInt();
        int colRepet = 0;
        int j = 0;
        int k = 0;
        for ( ; j < arrayOne.length; j++) {
            if (arrayOne[j] == number1){
                colRepet++;
            }
        }
        if (colRepet == 0) {
            System.out.println(number1 + "- такого числа нет в массиве");
        }

        arrayTwo = new int [arrayOne.length - colRepet];
        for (j = 0; j < arrayOne.length; j++) {
            if(arrayOne[j] != number1) {
                arrayTwo[k] = arrayOne[j];
                k++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

        /*
         Создайте и заполните массив случайными числами и выведите минимальное,
максимальное и среднее значение. Для генерации случайного числа используйте метод
Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
размер массива вводится с консоли.
         */
        System.out.println("№ 3");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("ВВедите длину массива");
        int arrayLength = scanner2.nextInt();
        int[] arrayThree = new int [arrayLength];
        int i = 0;
        int valueMin;
        int valueMax;
        int sumValue = 0;
        double medianValue;
        for ( ;i < arrayThree.length; i++ ) {
            arrayThree[i] = (int) (Math.random() *20);
        }
        i=0;
        valueMax = arrayThree[i];
        valueMin = arrayThree[i];
        System.out.println(Arrays.toString(arrayThree));
        for ( ; i < arrayThree.length; i++) {
            sumValue += arrayThree[i];

            if (valueMax < arrayThree[i]) {
                valueMax = arrayThree[i];
            }
            if (valueMin > arrayThree[i]) {
                valueMin = arrayThree[i];
            }
        }
        medianValue = (double) sumValue / arrayLength;
        String result = String.format("%.2f",medianValue);
        System.out.println("МАХ значение:" + valueMax);
        System.out.println("МИН значение:" + valueMin);
        System.out.println("Среднее значение:" + result);

        /*
        Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
из массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
         */
        System.out.println("№ 4");
        int[] arrayFour = new int[] {8, 20, 122, 24, 63};
        int[] arrayFive = new int[] {8, 20, 122, 24, 7};
        System.out.println(Arrays.toString(arrayFour));
        System.out.println(Arrays.toString(arrayFive));
        int medianValueOne;
        int medianValueTwo;
        int sumValueOne = 0;
        int sumValueTwo = 0;
        for (int ii =0; ii < arrayFive.length; ii++) {
            sumValueOne += arrayFour[ii];
            sumValueTwo += arrayFive[ii];
        }
        medianValueOne = sumValueOne / arrayFour.length;
        medianValueTwo = sumValueTwo / arrayFive.length;
        if (medianValueOne == medianValueTwo) {
            System.out.println("Средние арифметические двух массивов- равны");
        }
        else if (medianValueOne > medianValueTwo) {
            System.out.println("Средние арифметические первого массива- больше:" + medianValueOne);
        }
        else {
            System.out.println("Средние арифметические второго массива- больше:" + medianValueTwo);
        }

    }

}
