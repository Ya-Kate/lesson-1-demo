package lesson07;

public class Dentist extends Doktors {

    @Override
    public void termentMetod() {
        specialism = "Дантист";
        System.out.println("Назначить: " + specialism + "\n-Снимок" + "\n-Уколоть обезбаливающее" + "\n-Вырвать или залечить");
    }
}
