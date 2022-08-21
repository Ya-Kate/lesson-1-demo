package lesson11.Part1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class Test {

    public Test() {
    }

    public static void main(String[] args) throws IOException {
        /*
        Сравните производительность 2 коллекций: ArrayList, LinkedList
Программа должна сравнить скорость работы всех основных действий:
- Взятие по индексу (из начала, из конца, из середины)
- Поиск по элементу
- Добавление (в начало, в конец, в середину)
- Удаление (в начало, в конец, в середину)
Результат запишите в файл result.txt
Приложите данный файл в git (в pull request он должен отображаться) + код
Каждый из списков должен содержать 10000000 элементов.
         */
        File myFile = new File("result.txt");
        PrintWriter pw = new PrintWriter(myFile);

        int sizeList = 10000000;
        long timeSpend;
        ArrayTestList testArray = new ArrayTestList();
        LinkedListTest testLinkedList = new LinkedListTest();
        testArray.add(sizeList);
        testLinkedList.add(sizeList);
        timeSpend = testArray.getIndex(0);
        pw.println("Взятие по индексу начало: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.getFirst();
        pw.println("Взятие по индексу начало: " + timeSpend + "-LinkedList");
        timeSpend = testArray.getIndex(sizeList--);
        pw.println("Взятие по индексу конец: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.getLast();
        pw.println("Взятие по индексу конец: " + timeSpend + "-LinkedList");
        timeSpend = testArray.getIndex(sizeList/2);
        pw.println("Взятие по индексу середина: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.getIndex(sizeList/2);
        pw.println("Взятие по индексу середина: " + timeSpend + "-LinkedList");
        pw.println("-----------------------");

        int num = (int) (Math.random() * 51);
        timeSpend = testArray.findEllement(num);
        pw.println("Поиск по элементу: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.findEllement(num);
        pw.println("Поиск по элементу: " + timeSpend + "-LinkedList");
        pw.println("-----------------------");

        num = (int) (Math.random() * 51);
        timeSpend = testArray.addFirstNum(0,num);
        pw.println("Добавление элемента в начало: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.addNum(num);
        pw.println("Добавление элемента в начало: " + timeSpend + "-LinkedList");
        pw.println("-----------------------");

        timeSpend = testArray.addNum(num);
        pw.println("Добавление элемента в конец: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.addNumLast(num);
        pw.println("Добавление элемента в конец: " + timeSpend + "-LinkedList");
        pw.println("-----------------------");

        timeSpend = testArray.addFirstNum(sizeList/2,num);
        pw.println("Добавление элемента в середину: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.addNumMiddle(num);
        pw.println("Добавление элемента в середину: " + timeSpend + "-LinkedList");
        pw.println("-----------------------");

        timeSpend = testArray.removeNum(0);
        pw.println("Удаление элемента с начало: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.removeNumFirst();
        pw.println("Удаление элемента с начало: " + timeSpend + "-LinkedList");
        pw.println("-----------------------");

        timeSpend = testArray.removeNum(testArray.arrayListTest.size()-1);
        pw.println("Удаление элемента c конеца: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.removeNumLast();
        pw.println("Удаление элемента c конеца: " + timeSpend + "-LinkedList");
        pw.println("-----------------------");

        timeSpend = testArray.removeNum(testArray.arrayListTest.size()/2);
        pw.println("Удаление элемента с середины: " + timeSpend + "-ArrayList");
        timeSpend = testLinkedList.removeNumMiddle();
        pw.println("Удаление элемента с середины: " + timeSpend + "-LinkedList");

        pw.close();

    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
