package lesson11.PartTwo;

import java.util.Objects;

public class Mael extends AllInfaThings {
    public String vegetarian;

    public Mael() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mael mael = (Mael) o;
        return Objects.equals(vegetarian, mael.vegetarian);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vegetarian);
    }
}
