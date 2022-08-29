package lesson13;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListInteger {
    /*
    Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа
Integer.
С помощью Stream'ов:
- Удалить дубликаты
- Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
- Каждый элемент умножить на 2
- Отсортировать и вывести на экран первых 4 элемента
- Вывести количество элементов в стриме
- Вывести среднее арифметическое всех чисел в стриме
     */
    ArrayList <Integer> listInt = new ArrayList<>();
    public int lengthList = 5;

    public void addListInt() {
        for(int i = 0; i < lengthList; i++) {
            listInt.add((int) (Math.random() * 51));
        }
        System.out.println(listInt);

// создаем новый лист, отсортировываем по уникальности и выводим на экран
        System.out.println("Уникальные числа:");
       ArrayList<Integer> newList = (ArrayList<Integer>) listInt.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newList);

        System.out.println("Четные элементы в диапазоне от 7 до 17:");
        ArrayList<Integer> newList2 = (ArrayList<Integer>) newList.stream()
                .filter(i -> i>7 && i < 17 && i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(newList2);

        System.out.println("Каждый элемент умножаем на 2:");
        ArrayList<Integer> newList3 = (ArrayList<Integer>) newList2.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println(newList3);

        System.out.println("Отсортированные вывод первые 4 числа:");
        listInt.stream()
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        System.out.println("Количество элементов в списке:");
        long count = listInt.stream()
                .count();
        System.out.println(count);

        System.out.println("среднее арифметическое всех чисел:");
        int summMidl = listInt.stream()
                        .mapToInt(el -> el).sum();
        summMidl /=count;
        System.out.println(summMidl);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListInteger that = (ArrayListInteger) o;
        return lengthList == that.lengthList && Objects.equals(listInt, that.listInt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listInt, lengthList);
    }
}
