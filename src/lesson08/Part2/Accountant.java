package lesson08.Part2;

import java.util.Objects;

public class Accountant extends InfoPerson implements Employed {
    public boolean yearBalans;

    public void setYearBalans(boolean yearBalans) {
        this.yearBalans = yearBalans;
    }

    public boolean isYearBalans() {
        return yearBalans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Accountant that = (Accountant) o;
        return yearBalans == that.yearBalans;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearBalans);
    }

    @Override
    public void printPosition(String position) {
        System.out.println("Должность: " + position + "\nСдала годовой баланс: " + yearBalans);
    }

    public Accountant(String surname, String name, int salary) {
        super(surname, name, salary);
    }

    public void printInfoAccountant() {
        System.out.println(surname + " " + name);
        printPosition("Бухгалтер");
        System.out.println("\nОклад: " + salary);
    }
}
