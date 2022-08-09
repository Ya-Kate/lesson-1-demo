package lesson08.Part2;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        /*
2. Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название должности и
имплементировать этот метод в созданные классы.
         */
        Director director = new Director("Иванов", "Иван", 2500);
        director.education = "Высшее";
        director.PrintInfoDirector();

        Worker worker = new Worker ("Веселкин", "Леонид", 1300);
        worker.numerPlaceWork = 2;
        worker.PrintInfoWorker();

        Accountant accountant = new Accountant("Сидорова", "Ирина", 2000);
        accountant.yearBalans = true;
        accountant.printInfoAccountant();
    }
}
