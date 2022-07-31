package lesson06;

public class HomeWorkPart1 {
    public static void main(String[] args) {
        /*
        Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер
счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
         */
        CreditCard clientOne = new CreditCard();
        clientOne.name = "Ivanov S.A.";
        clientOne.numberAccount = "3hbkj65677";
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
