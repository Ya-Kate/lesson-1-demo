package lesson11.PartTwo;

import java.util.Objects;

public class Clothe extends AllInfaThings {
    public String size;

    public Clothe() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothe clothe = (Clothe) o;
        return Objects.equals(size, clothe.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
