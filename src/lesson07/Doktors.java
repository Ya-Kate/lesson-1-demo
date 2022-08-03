package lesson07;

public class Doktors {
    String surgeon;
    String internist;
    String dentist;
    void setSurgeon() {
        surgeon = "Хирург";
    }
    void setInternist() {
        internist = "Терапевт";
    }
    void setDentist() {
        dentist = "Дантист";
    }

    void treatPerson (int treatPlan) {
        if (treatPlan == 1) {
            System.out.println("Назначить хирурга");
            termentMetodSurgeon();
        }
        else if (treatPlan == 2) {
            System.out.println("Назначить дантиста");
            termentMetodDentist();
        }
        else {
            System.out.println("Назначить терапевта");
            termentMetodInternist();
        }
    }

    void termentMetodSurgeon() {
        System.out.println("-Снимок" + "\n-Тугая повязка" + "\n-Обезбаливающее");
    }
    void termentMetodDentist() {
        System.out.println("-Снимок" + "\n-Уколоть обезбаливающее" + "\n-Вырвать или залечить");
    }
    void termentMetodInternist() {
        System.out.println("-Сдать анализы" + "\n-Сделать MRT" + "\n-Сделать ЭКГ" + "\n-Повторный прием");
    }

}
