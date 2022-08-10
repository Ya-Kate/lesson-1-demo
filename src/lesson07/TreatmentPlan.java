package lesson07;
import java.util.Objects;
import java.util.Scanner;

public class TreatmentPlan {
     public int treatmentPlan;

    public TreatmentPlan() {
    }

    public int setTreatmentPlan(String surnameIll) {
        System.out.println("Введите какой план лечения для: " + surnameIll);
        Scanner scanner = new Scanner(System.in);
        treatmentPlan = scanner.nextInt();
        return treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreatmentPlan that = (TreatmentPlan) o;
        return treatmentPlan == that.treatmentPlan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentPlan);
    }
}
