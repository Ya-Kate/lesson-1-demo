package lesson07.Part2;

public class Internist extends Doktors{
    @Override
    public void termentMetod() {

        specialism = "Терапевт";
        System.out.println("Назначить: " + specialism + "\n-Сдать анализы" + "\n-Сделать MRT" + "\n-Сделать ЭКГ" + "\n-Повторный прием");
    }
}
