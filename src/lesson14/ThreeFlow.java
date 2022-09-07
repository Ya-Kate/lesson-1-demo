package lesson14;

public class ThreeFlow extends Thread {

    public ThreeFlow(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.print(this.getName());
    }
}
