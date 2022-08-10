package lesson08.Part2;

import java.util.Objects;

public class Director extends InfoPerson implements Employed {
    public String education;

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return Objects.equals(education, director.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), education);
    }

    @Override
    public void printPosition(String position) {
        System.out.println("Должность: " + position + "\nОбразование: " + education);
    }

    public Director(String surname, String name, int salary) {
        super(surname, name, salary);
    }

    public void PrintInfoDirector() {
        System.out.println(surname + " " + name);
        printPosition("Директор");
        System.out.println("\nОклад: " + salary + "\n---------------------------");
    }
}
