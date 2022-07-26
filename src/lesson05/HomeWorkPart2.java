package lesson05;

import java.util.Arrays;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        /*
        Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы).
        Напишите программу для умножения двух матриц.
         */
        System.out.println("Task №1");
        int [][] arrMultiplyOneTwo = new int [3][3];
        int [][] arrOne = new int[][] {
            {1,2,5},
            {3,4,5},
            {10,10,10}
        };
        int [][] arrTwo = new int[][] {
                {1,2,5},
                {3,4,5},
                {10,20,30}
        };
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                arrMultiplyOneTwo[i][j] = arrOne[i][j] * arrTwo[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arrOne));
        System.out.println(Arrays.deepToString(arrTwo));
        System.out.println(Arrays.deepToString(arrMultiplyOneTwo));

        System.out.println("--------------------------------");
        System.out.println("Task №2");
        /*
        Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов.
         */
        int [][] arrayOne = new int[][] {{1,2,3}, {10,11}, {100,200}};
        int summNumberArray = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                summNumberArray += arrayOne[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arrayOne));
        System.out.println("сумму всех элементов:" + summNumberArray);

        System.out.println("--------------------------------");
        System.out.println("Task №3");
        /*
        Создайте двумерный массив. Выведите на консоль диагонали массива.
         */
        int [][] arrayTwo = new int[][] {
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
            {26,27,28,29,30},
            {31,32,33,34,35}
        };

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {

                if (i == j) {
                    System.out.print(arrayTwo[i][j] + " ");
                }
            }
        }
        System.out.println("");
        for (int i = arrayTwo.length-1; i >= 0 ; i--) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                if (i  == 0) {
                    System.out.print(arrayTwo[i][j]);
                    break;
                }

                if (i == j) {
                    System.out.print(arrayTwo[i][j] + " ");
                }
            }
        }

        System.out.println("\n --------------------------------");
        System.out.println("Task №4");
        /*
        Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного
        массива по возрастанию.
         */
        int[][] arrayFour = new int[][] {
                {7,3,9,5,1},
                {14,17,12,10,13}
        };
        boolean readySort = false;
        int peremen;
        System.out.println(Arrays.deepToString(arrayFour));

        while (!readySort) {
            readySort = true;
                    for (int i = 0; i < arrayFour.length; i++) {
                        for (int j = 0; j < arrayFour[i].length-1; j++) {
                            if (arrayFour[i][j] > arrayFour[i][j+1]) {
                                peremen = arrayFour[i][j];
                                arrayFour[i][j] = arrayFour[i][j+1];
                                arrayFour[i][j+1] = peremen;
                                readySort = false;
                            }
                        }
                    }
        }
        System.out.println(Arrays.deepToString(arrayFour));
    }
}
