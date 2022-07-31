package lesson06;

public class CreditCard {
    String name;
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
           System.out.println(name + "\n снять не возможно, остаток: " + summToAccount);
       }
   }

   void printSummCreditCart() {
       System.out.println(name + "\n Карточка: " + numberAccount + ", остаток: " + summToAccount);
   }

}
