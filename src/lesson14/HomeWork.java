package lesson14;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 20; i++) {
        ThreeFlow t1 = new ThreeFlow("Привет!!! ");
        ThreeFlow t2 = new ThreeFlow("Как дела? ");
        ThreeFlow t3 = new ThreeFlow("Что делаешь?\n");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        }
    }
}

