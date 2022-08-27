package lesson13;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListString {
    /*
    Создать коллекцию класса ArrayList со значениями имен всех студентов в группе.
С помощью Stream'ов:
- Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего
регистра букв)
     */
    ArrayList<String> students= new ArrayList<>();
    public void addList() {
        students.add("Nicol");
        students.add("Max");
        students.add("Sofa");
        students.add("Mark");
        students.add("kate");
        students.add("Jon");
        students.add("matt");
        students.add("Kate");
        students.add("Johan");
    }

    public void group() {
        System.out.println(students);
        Long colStudents = students.stream()
                .count();
        System.out.println("Состав группы: " + colStudents + " студентов");

        String name = "Kate";
         long count = students.stream()
                .filter(nn -> nn.equalsIgnoreCase(name))
                .count();
        System.out.println("Количество повторений 'Kate': " + count);
/*
Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 */
        String findLitter = "M";
        ArrayList<String> newListFirstA = (ArrayList<String>) students.stream()
                .filter(i -> i.toUpperCase().startsWith(findLitter))
                .collect(Collectors.toList());
        System.out.println(newListFirstA);

        /*
        - Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста
         */
        Optional<String> firstElement = students.stream()
                .sorted()
                .findFirst();
        System.out.println(firstElement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListString that = (ArrayListString) o;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}
