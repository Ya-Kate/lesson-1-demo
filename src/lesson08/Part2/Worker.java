package lesson08.Part2;

import java.util.Objects;

public class Worker extends InfoPerson implements Employed {
    public int numerPlaceWork;

    public void setNumerPlaceWork(int numerPlaceWork) {
        this.numerPlaceWork = numerPlaceWork;
    }

    public int getNumerPlaceWork() {
        return numerPlaceWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return numerPlaceWork == worker.numerPlaceWork;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numerPlaceWork);
    }

    @Override
    public void printPosition(String position) {
        System.out.println("Должность: " + position);
    }

    public Worker(String surname, String name, int salary) {
        super(surname, name, salary);
    }

    public void PrintInfoWorker() {
        System.out.println(surname + " " + name);
        printPosition("Инженер");
        System.out.println("Участок: " + numerPlaceWork + "\nОклад: " + salary + "\n---------------------------");
    }


}
