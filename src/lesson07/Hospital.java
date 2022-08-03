package lesson07;
import java.util.Arrays;

public class Hospital {
    public static void main(String[] args) {
        /*
        Создать программу для имитации работы клиники.
Пусть в клинике будет три врача: хирург, терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» и класс «План лечения».
Создать объект класса «Пациент» и добавить пациенту план лечения.
Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
         */
        Doktors doktors = new Doktors();

        IllPerson illPerson = new IllPerson();
        illPerson.surNameIllPerson = "Иванов";
        illPerson.nameIllPerson = "Иван";
        illPerson.ageIllPerson = 37;
        illPerson.diagnosisIllPerson = illPerson.treatmentPlan.getTreatmentPlanSurgeon();

        IllPerson illPerson1 = new IllPerson();
        illPerson1.surNameIllPerson = "Петров";
        illPerson1.nameIllPerson = "Николай";
        illPerson1.ageIllPerson = 55;
        illPerson1.diagnosisIllPerson = illPerson1.treatmentPlan.getTreatmentPlanDantist();

        IllPerson illPerson2 = new IllPerson();
        illPerson2.surNameIllPerson = "Сидорова";
        illPerson2.nameIllPerson = "Людмила";
        illPerson2.ageIllPerson = 73;
        illPerson2.diagnosisIllPerson = illPerson1.treatmentPlan.getTreatmentPlanInternist();

        IllPerson[] sickList = new IllPerson[]{illPerson, illPerson1, illPerson2};

        for (int i = 0; i < sickList.length; i++) {
            System.out.println(sickList[i].surNameIllPerson + "\n" + sickList[i].nameIllPerson);
            System.out.println(sickList[i].ageIllPerson);
            doktors.treatPerson(sickList[i].diagnosisIllPerson);
            System.out.println("----------------------");
        }
    }
}
