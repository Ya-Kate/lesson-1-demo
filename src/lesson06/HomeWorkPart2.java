package lesson06;

public class HomeWorkPart2 {
    public static void main(String[] args) {
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