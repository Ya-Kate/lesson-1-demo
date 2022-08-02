package lesson06;

public class CreditCard {
    String numberAccount;
    double summToAccount;

    void addSummCreditCard(int numberAdd) {
        this.summToAccount += numberAdd;
    }

    void takeOffSummCretitCard(int numbedrOff) {
        if(this.summToAccount > numbedrOff) {
            this.summToAccount -= numbedrOff;
        }
        else {
            System.out.println("снять не возможно, остаток: " + summToAccount);
        }
    }

    void printSummCreditCart() {
        System.out.println("Карточка: " + numberAccount + ", остаток: " + summToAccount);
    }

}
