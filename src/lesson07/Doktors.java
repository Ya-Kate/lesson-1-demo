package lesson07;

 public class Doktors {
     public String specialism;

     public String getSpecialism() {
         return specialism;
     }

     public void setSpecialism(String specialism) {
         this.specialism = specialism;
     }

     void termentMetod() {}

    void treatPerson (int treatPlan) {
        if (treatPlan == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.termentMetod();
        }
        else if (treatPlan == 2) {
            Dentist dentist = new Dentist();
            dentist.termentMetod();
        }
        else {
            Internist internist = new Internist();
            internist.termentMetod();
        }
    }
}

 class Surgeon extends Doktors {

     @Override
     void termentMetod() {
         specialism= "Хирург";
         System.out.println("Назначить: " + specialism + "\n-Снимок" + "\n-Тугая повязка" + "\n-Обезбаливающее");
     }
 }

class Dentist extends Doktors {

    @Override
    void termentMetod() {
        specialism = "Дантист";
        System.out.println("Назначить: " + specialism + "\n-Снимок" + "\n-Уколоть обезбаливающее" + "\n-Вырвать или залечить");
    }
}

class Internist extends Doktors {

    @Override
    void termentMetod() {
        specialism = "Терапевт";
        System.out.println("Назначить: " + specialism + "\n-Сдать анализы" + "\n-Сделать MRT" + "\n-Сделать ЭКГ" + "\n-Повторный прием");
    }
}


