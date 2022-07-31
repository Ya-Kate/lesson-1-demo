package lesson06;

public class HomeWorkPart1 {
    public static void main(String[] args) {
        CreditCard clientOne = new CreditCard();
        clientOne.name = "Ivanov S.A.";
        clientOne.numberAccount = "3hbkj6567";
        clientOne.summToAccount = 500;

        CreditCard clientTwo = new CreditCard();
        clientTwo.name = "Petrov N.A.";
        clientTwo.numberAccount = "879ijnjmp";
        clientTwo.summToAccount = 300;

        CreditCard clientThree = new CreditCard();
        clientThree.name = "Sidirov A.T.";
        clientThree.numberAccount = "tfgv8789";
        clientThree.summToAccount = 100;

        clientOne.addSummCreditCard(100);
        clientOne.printSummCreditCart();

        clientTwo.addSummCreditCard(200);
        clientTwo.printSummCreditCart();

        clientThree.takeOffSummCretitCard(500);
        clientThree.takeOffSummCretitCard(50);
        clientThree.printSummCreditCart();

    }

}
