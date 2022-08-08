package lesson08;

import java.util.Objects;

public abstract class InfoPerson {
    String surname;
    String name;
    int salary;

    public InfoPerson() {

    }
    public InfoPerson(String surname, String name, int salary) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoPerson that = (InfoPerson) o;
        return salary == that.salary && Objects.equals(surname, that.surname) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, salary);
    }
}
