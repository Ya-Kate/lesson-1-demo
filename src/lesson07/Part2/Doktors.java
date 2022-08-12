package lesson07.Part2;

import java.util.Objects;

public class Doktors {
    public String specialism;

    public void termentMetod() {
    }

    public void treatPerson (int treatPlan) {
        if (treatPlan == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.termentMetod();
        }
        else if (treatPlan == 2) {
            Dentist dentist = new Dentist();
            dentist.termentMetod();
        }
        else {
            Internist internist = new Internist();
            internist.termentMetod();
        }
    }

    public String getSpecialism() {
        return specialism;
    }

    public void setSpecialism(String specialism) {
        this.specialism = specialism;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doktors doktors = (Doktors) o;
        return Objects.equals(specialism, doktors.specialism);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialism);
    }
}
