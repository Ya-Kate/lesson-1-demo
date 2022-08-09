package lesson07;

public class Surgeon extends Doktors {

    @Override
    public void termentMetod() {
        specialism= "Хирург";
        System.out.println("Назначить: " + specialism + "\n-Снимок" + "\n-Тугая повязка" + "\n-Обезбаливающее");
    }
}


