package lesson12;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Scanner;

public class AllReport {
    public int salary;
    public int plan;
    public int didPlan;
    LocalDate dataStartWork;
    private int bonus;

    public int getBonus() {
        return bonus();
    }

    public boolean sig = false;
    public boolean signatureWorker() {
        System.out.println("Если ознакомлен, подпишите");
        Scanner scanner = new Scanner(System.in);
            String sigg = scanner.nextLine();
            if(sigg != null){
                sig = true;
            }
        return sig;
    }

    private int bonus() {
        int rezult = 0;
        if (didPlan >= plan * 2) {
            rezult = salary;
        }
        else if (didPlan == plan * 1.5 && didPlan < plan * 2) {
            rezult = (int) (salary * 0.5);
        }
        return rezult;
    }
}
