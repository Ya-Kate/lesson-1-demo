package lesson11.Part1;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListTest {
    long timeFirst;
    long timeLast;
    long time = 0;
    int findPeremenNum;
    LinkedList<Integer> linkedListTest = new LinkedList<Integer>();

    public void add(int sizeList) {
        for (int i = 0; i < sizeList; i++) {
            int num = (int) (Math.random() * 51);
            linkedListTest.add(num);
        }
    }

    public long getFirst() {
        timeFirst = System.nanoTime();
        findPeremenNum = linkedListTest.getFirst();
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long getLast() {
        timeFirst = System.nanoTime();
        findPeremenNum = linkedListTest.getFirst();
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long getIndex(int numIndex) {
        timeFirst = System.nanoTime();
        findPeremenNum = linkedListTest.indexOf(numIndex);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long findEllement(int numFind) {
        timeFirst = System.nanoTime();
        boolean find = linkedListTest.contains(numFind);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long addNum(int num) {
        timeFirst = System.nanoTime();
        linkedListTest.addFirst(num);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long addNumLast(int num) {
        timeFirst = System.nanoTime();
        linkedListTest.addLast(num);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long addNumMiddle(int num) {
        timeFirst = System.nanoTime();
        linkedListTest.add(linkedListTest.size()/2,num);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long removeNumFirst() {
        timeFirst = System.nanoTime();
        linkedListTest.removeFirst();
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long removeNumLast() {
        timeFirst = System.nanoTime();
        linkedListTest.removeLast();
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long removeNumMiddle() {
        timeFirst = System.nanoTime();
        linkedListTest.remove(linkedListTest.size()/2);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public LinkedListTest() {
    }

    public LinkedListTest(long timeFirst, long timeLast, long time, int findPeremenNum, LinkedList<Integer> linkedListTest) {
        this.timeFirst = timeFirst;
        this.timeLast = timeLast;
        this.time = time;
        this.findPeremenNum = findPeremenNum;
        this.linkedListTest = linkedListTest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedListTest that = (LinkedListTest) o;
        return timeFirst == that.timeFirst && timeLast == that.timeLast && time == that.time && findPeremenNum == that.findPeremenNum && Objects.equals(linkedListTest, that.linkedListTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeFirst, timeLast, time, findPeremenNum, linkedListTest);
    }
}
