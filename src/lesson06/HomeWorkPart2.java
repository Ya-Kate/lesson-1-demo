package lesson06;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        /*
        Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип), RAM и HDD. Для полей RAM и
HDD следует создать свои собственные классы. Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми
параметрами.
Класс RAM имеет поля "название" и "объем".
Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
Класс Computer должен иметь два конструктора:
- первый - с параметрами стоимость и модель,
- второй - со всеми полями.
При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RAM и HDD с помощью конструкторов по
умолчанию. В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
Тестовый сценарий для проверки:
создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.
         */
        Computer computer1 = new Computer(210.0, "ML1");
        computer1.printInfoComputer();

        RAM ram = new RAM();
        ram.nameRAM = "MN";
        ram.volumeRAM = 156;

        HDD hdd = new HDD();
        hdd.nameHDD = "LKP";
        hdd.volumeHDD = 280;
        hdd.typeHDD = "inside";
        Computer computer2 = new Computer(150,"ML", ram, hdd);
        computer2.printInfoComputer();
    }
}

class Computer {
    double cost;
    String model;
    RAM RAM;
    HDD HDD;

    Computer (double costComp, String modelComp) {
        cost = costComp;
        model = modelComp;
        RAM = new RAM();
        HDD = new HDD();
    }
    Computer (double costComp, String modelComp, RAM ramComp, HDD hddComp ) {
        cost = costComp;
        model = modelComp;
        RAM = ramComp;
        HDD = hddComp;
    }

    void printInfoComputer () {
        System.out.println("Модель:" + model + " Стоимость:" + cost);
        System.out.println("RAM name:" + RAM.nameRAM + " RAM volume:" + RAM.volumeRAM);
        System.out.println("HDD name:" + HDD.nameHDD + " HDD volume:" + HDD.volumeHDD + " HDD type:" + HDD.typeHDD);
    }
}

class RAM {
    String nameRAM;
    double volumeRAM;
}

class HDD {
    String nameHDD;
    double volumeHDD;
    String typeHDD;
}
