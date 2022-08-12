package lesson07.Part2;

public class Hospital {
    public void Initialize() {
        Doktors doktors = new Doktors();

        IllPerson illPerson = new IllPerson();
        illPerson.surName = "Иванов";
        illPerson.name = "Иван";
        illPerson.age = 37;
        illPerson.diagnosis = illPerson.treatmentPlan.setTreatmentPlan(illPerson.surName);

        IllPerson illPerson1 = new IllPerson();
        illPerson1.surName = "Петров";
        illPerson1.name = "Николай";
        illPerson1.age = 55;
        illPerson1.diagnosis = illPerson1.treatmentPlan.setTreatmentPlan(illPerson1.surName);

        IllPerson illPerson2 = new IllPerson();
        illPerson2.surName = "Сидорова";
        illPerson2.name = "Людмила";
        illPerson2.age = 73;
        illPerson2.diagnosis = illPerson2.treatmentPlan.setTreatmentPlan(illPerson2.surName);

        IllPerson[] sickList = new IllPerson[]{illPerson, illPerson1, illPerson2};

        for (int i = 0; i < sickList.length; i++) {
            System.out.println(sickList[i].surName + "\n" + sickList[i].surName);
            System.out.println(sickList[i].age + "years old");
            doktors.treatPerson(sickList[i].diagnosis);
            System.out.println("----------------------");
        }
    }
}
