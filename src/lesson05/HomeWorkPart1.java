package lesson05;



import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkPart1 {
    public static void main(String[] args) {
        /*
         Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему
массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли.

         */
        System.out.println("Task №1");
        int[][][] arrayThreeOne = new int[][][] {{{1,3,5}, {2,4,6}, {11,12,13}}};
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Arrays.deepToString(arrayThreeOne));
        for (int i = 0; i < arrayThreeOne.length; i++ ) {

            for (int j = 0; j < arrayThreeOne[i].length; j++) {

                for (int s = 0; s < arrayThreeOne[i][j].length; s++) {
                    arrayThreeOne[i][j][s] += num;
                }
            }
        }
        System.out.println(Arrays.deepToString(arrayThreeOne));

        /*
        Шахматная доска. Создайте программу для раскраски шахматной доски с помощью
цикла. Использовать двумерный массив String размером 8х8. С помощью циклов задать
элементам значения B (Black) или W (White).
         */
        System.out.println("--------------------------------");
        System.out.println("Task №1");
        String [][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {

            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) %2 == 0) {
                    chessBoard[i][j] = "W";
                }
                else {
                    chessBoard[i][j] = "B";
                }
                System.out.printf( "%2s ", chessBoard[i][j]);
            }
            System.out.print("\n");
        }

    }

}