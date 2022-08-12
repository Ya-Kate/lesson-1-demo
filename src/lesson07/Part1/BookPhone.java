package lesson07.Part1;

public class BookPhone {
    public static void main(String[] args) {
        /*
        Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого
класса. Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
телефона звонящего.
Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
         */

        Phone phoneOne = new Phone();
        phoneOne.number = 344_22_15;
        phoneOne.model = "Siemens";
        phoneOne.weight = 0.2;

        Phone phoneTwo = new Phone();
        phoneTwo.number = 564_33_22;
        phoneTwo.model = "Nokia";
        phoneTwo.weight = 0.18;

        Phone phoneThree = new Phone();
        phoneThree.number = 666_12_13;
        phoneThree.model = "Samsung";
        phoneThree.weight = 0.21;

        Phone[] phones = {phoneOne, phoneTwo, phoneThree};
        for (Phone phone : phones) {
            System.out.println(phone.number + "." + phone.model + ": " + phone.weight + "kg");
        }

        phoneOne.receiveCall("Max");
        System.out.println(phoneOne.getNumber());

        phoneOne.receiveCall("Nic");
        System.out.println(phoneTwo.getNumber());

        phoneOne.receiveCall("Alex");
        System.out.println(phoneThree.getNumber());

        phoneOne.receiveCall("M", phoneOne.number);
        phoneTwo.receiveCall("N", phoneTwo.number);
        phoneThree.receiveCall("A", phoneThree.number);

        Phone.sendMessage(phoneOne.number, phoneTwo.number, phoneThree.number);

    }
}
