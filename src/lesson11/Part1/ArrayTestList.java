package lesson11.Part1;

import java.util.*;

public class ArrayTestList {
    long timeFirst;
    long timeLast;
    long time = 0;
    int peremenNum;
    ArrayList<Integer> arrayListTest = new ArrayList<Integer>();

    public void add(int sizeList) {
        for (int i = 0; i < sizeList; i++) {
            int num = (int) (Math.random() * 51);
            arrayListTest.add (num);
        }
    }

    public long getIndex(int numIndex) {
        timeFirst = System.nanoTime();
        peremenNum = arrayListTest.indexOf(numIndex);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long findEllement(int numFind) {
        timeFirst = System.nanoTime();
        boolean find = arrayListTest.contains(numFind);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long addFirstNum(int ind, int num) {
        timeFirst = System.nanoTime();
        arrayListTest.add(num);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long addNum(int num) {
        timeFirst = System.nanoTime();
        arrayListTest.add(num);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long removeNum(int ind) {
        timeFirst = System.nanoTime();
        arrayListTest.remove(ind);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public long removeNumLast() {
        timeFirst = System.nanoTime();
        arrayListTest.remove(arrayListTest.size()/2);
        timeLast = System.nanoTime();
        time = timeLast - timeFirst;
        return time;
    }

    public ArrayTestList() {
    }

    public ArrayTestList(long timeFirst, long timeLast, long time, int peremenNum, ArrayList<Integer> arrayListTest) {
        this.timeFirst = timeFirst;
        this.timeLast = timeLast;
        this.time = time;
        this.peremenNum = peremenNum;
        this.arrayListTest = arrayListTest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayTestList that = (ArrayTestList) o;
        return timeFirst == that.timeFirst && timeLast == that.timeLast && time == that.time && peremenNum == that.peremenNum && Objects.equals(arrayListTest, that.arrayListTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeFirst, timeLast, time, peremenNum, arrayListTest);
    }
}
