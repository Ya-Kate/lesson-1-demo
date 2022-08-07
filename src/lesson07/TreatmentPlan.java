package lesson07;
import java.util.Scanner;

public class TreatmentPlan {
     int treatmentPlan;

    public int setTreatmentPlan(String surnameIll) {
        System.out.println("Введите какой план лечения для: " + surnameIll);
        Scanner scanner = new Scanner(System.in);
        treatmentPlan = scanner.nextInt();
        return treatmentPlan;
    }

}
