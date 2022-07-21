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
        int[] arrayTwo;
        int colMassivaTwo = 0;
        int i = 0;

        for ( ; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 50);
            if(arrayOne[i] %2 == 0) {
                colMassivaTwo++;
            }
        }
        arrayTwo = new int[colMassivaTwo];
        colMassivaTwo = 0;
        for (i = 0; i < arrayOne.length; i++) {
            if(arrayOne[i] %2 == 0) {
                arrayTwo[colMassivaTwo] = arrayOne[i];
                colMassivaTwo++;
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
        for (int s = 0; s < arrayThree.length; s++) {
            if (s %2 != 0) {
                arrayThree[s] = 0;
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
        int[] arrayFive = new int[] {8, 3, 2, 7, 1, 9, 5};
        System.out.println(Arrays.toString(arrayFive));
        boolean sotrted = false;
        int peremen;
        while (!sotrted) {  // цикл будет работать пока не будет отсортировано все
            sotrted  = true;
            for (int in = 0; in < arrayFive.length-1; in++ ) { // цикл проходим до предпоследнего индекса,тк внутри в условии последнее значение массива будет в последнем индексе
                if(arrayFive[in] > arrayFive[in+1]) {  // одно условие, сравнивается лывый элемент с правым, что бы правый элемент был, сделали индекс текущий +1
                    peremen = arrayFive[in];   // переменная что бы сохранять левое значение, что бы потом присвоить правому
                    arrayFive[in] = arrayFive[in + 1];  // левый элемент равен правому
                    arrayFive[in + 1] = peremen;       // правый элемент равен левому
                    sotrted = false; // были изменения, поэтому не все отсортировано, нужно дальше идти по циклу
                }
            }
            System.out.println(Arrays.toString(arrayFive));
        }
    }
}
