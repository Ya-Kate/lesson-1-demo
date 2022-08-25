package lesson11.PartTwo;

import java.util.Objects;

public class AllInfaThings {
    public String name;
    public int cost;

    public AllInfaThings() {
    }

    public AllInfaThings(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllInfaThings that = (AllInfaThings) o;
        return cost == that.cost && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }
}
