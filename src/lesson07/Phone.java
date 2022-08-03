package lesson07;

public class Phone {
    int number;
    String model;
    double weight;
    Phone () {
    }
    Phone (int numbEr, String modEl, double weIght) {
        this (numbEr,modEl);
        number = numbEr;
        model = modEl;
        weight = weIght;

    }
    Phone (int num, String mod) {
        number = num;
        model = mod;
    }

    public void receiveCall (String Call) {
        System.out.println("Звонит: " + Call);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall (String nameCall, int numPhone) {
        System.out.println(nameCall + "-" + numPhone);
    }

    static void sendMessage(int...numPhon) {
    for (Object o : numPhon) {
        System.out.println(o.toString());
    }
    }

}

