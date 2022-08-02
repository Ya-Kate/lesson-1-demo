package lesson06;

public class HomeWorkPart3 {
    public static void main(String[] args) {
        ATMmachine atmMachine = new ATMmachine( 5, 2, 3);
        atmMachine.nameBank = "BSB";
        atmMachine.typeATMmachine = "OUTSide";
        atmMachine.AddMoney();
        boolean makeGood = atmMachine.GiveMoney(270);
        if (makeGood) {
            System.out.println("Операция прошла успешна.");
        }
    }
}

class ATMmachine {
    String nameBank;
    String typeATMmachine;
    int pieces20;
    int pieces50;
    int pieces100;
    int summMoneyATMmachine;
    boolean workIsDone;
    int summaGiveMoney;

    ATMmachine (int coll20, int coll50, int coll100) {
        pieces20 = coll20;
        pieces50 = coll50;
        pieces100 = coll100;
    }

    void PrintMoneyATMmachine() {
        System.out.println(nameBank + "/"+ typeATMmachine + " " + "Доступная сумма : " + summMoneyATMmachine);
    }

    void AddMoney() {
        summMoneyATMmachine = (20 * pieces20) + (50 * pieces50) + (100 * pieces100);
        PrintMoneyATMmachine();
    }

    boolean GiveMoney(int summaMoney) {
        summaGiveMoney = summaMoney;

        if(summMoneyATMmachine >= summaGiveMoney) {

            if (summaGiveMoney / 100 <= pieces100) {
                pieces100 = summaGiveMoney / 100;
                System.out.println("выдало: 100 -" + pieces100 + "штук");
            }
            summaGiveMoney -= (pieces100 * 100);
            if (summaGiveMoney / 50 <= pieces50 && summaGiveMoney %20 != 0) {
                pieces50 = summaGiveMoney / 50;
                summaGiveMoney -= (pieces50 * 50);
                System.out.println("выдало: 50 -" + pieces50 + "штук");
            }

            if (summaGiveMoney / 20 <= pieces20) {
                pieces20 = summaGiveMoney / 20;
                summaGiveMoney -= (pieces20 * 20);
                System.out.println("выдало: 20 -" + pieces20 + "штук");
            }
            summMoneyATMmachine -= summaMoney;
            PrintMoneyATMmachine();
            workIsDone = true;
        }
        else {
            System.out.println("Операция не выполнена: в АТМ не хватает денег");
        }
        return workIsDone;
    }
}