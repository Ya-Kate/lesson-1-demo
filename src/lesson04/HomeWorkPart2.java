package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        /*
        Создайте массив из N-случайных целых чисел и выведите его на экран. Размер массива пусть
задается с консоли и размер массива может быть больше 5 и меньше или равно 10. Если N не
удовлетворяет условиям – выведите сообщение. Если пользователь ввел неподходящее N, то
программа должна просить пользователя повторить ввод. Создайте второй массив только из четных
элементов первого массива, если они там есть, и вывести эго на экран.
         */
        System.out.println("№1");
        System.out.println("Введите длину массива больше 5 до 10");
        Scanner scanner = new Scanner(System.in);
        int arrayLenght;

        while (true){
            arrayLenght = scanner.nextInt();
            if (arrayLenght > 5 && arrayLenght <= 10) {
                break;
            }
            System.out.println("длина массива должна быть больше 5 до 10, повторите");

        }
        int[] arrayOne = new int[arrayLenght];
        int[] arrayTwo = new int[arrayLenght];
        int ii = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 50);
            if(arrayOne[i] %2 == 0){
                arrayTwo[ii] = arrayOne[i];
                ii++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

        /*
        Создайте массив и заполните его. Выведите массив на экран в строку. Заменит каждый элемент с
нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.
         */
        System.out.println("№2");
        int[] arrayThree = new int[] {2,4,3,5,6,8,7,9,10,12};
        System.out.println(Arrays.toString(arrayThree));
        for (int i = 0; i < arrayThree.length; i++) {
            if (i %2 != 0) {
                arrayThree[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayThree));

        /*
        Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
Результат выведите на консоль.
         */
        System.out.println("№3");
        String[] arrayFour = new String[] {"Nina", "Alina", "Nikita", "Max", "Alex", "Kate"};
        Arrays.sort(arrayFour);
        System.out.println(Arrays.toString(arrayFour));

        /*
        Реализуйте алгоритм сортировки пузырьком, проставляя комментарии на каждом шаге.
         */
        System.out.println("№4");

    }
}
