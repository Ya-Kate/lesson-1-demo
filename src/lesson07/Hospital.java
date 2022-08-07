package lesson07;
import java.util.Arrays;

public class Hospital {

    public void Initialize() {
        Doktors doktors = new Doktors();

        IllPerson illPerson = new IllPerson();
        illPerson.surNameIllPerson = "Иванов";
        illPerson.nameIllPerson = "Иван";
        illPerson.ageIllPerson = 37;
        illPerson.diagnosisIllPerson = illPerson.treatmentPlan.setTreatmentPlan(illPerson.surNameIllPerson);

        IllPerson illPerson1 = new IllPerson();
        illPerson1.surNameIllPerson = "Петров";
        illPerson1.nameIllPerson = "Николай";
        illPerson1.ageIllPerson = 55;
        illPerson1.diagnosisIllPerson = illPerson1.treatmentPlan.setTreatmentPlan(illPerson1.surNameIllPerson);

        IllPerson illPerson2 = new IllPerson();
        illPerson2.surNameIllPerson = "Сидорова";
        illPerson2.nameIllPerson = "Людмила";
        illPerson2.ageIllPerson = 73;
        illPerson2.diagnosisIllPerson = illPerson2.treatmentPlan.setTreatmentPlan(illPerson2.surNameIllPerson);

        IllPerson[] sickList = new IllPerson[]{illPerson, illPerson1, illPerson2};

        for (int i = 0; i < sickList.length; i++) {
            System.out.println(sickList[i].surNameIllPerson + "\n" + sickList[i].nameIllPerson);
            System.out.println(sickList[i].ageIllPerson);
            doktors.treatPerson(sickList[i].diagnosisIllPerson);
            System.out.println("----------------------");
        }
    }
}

