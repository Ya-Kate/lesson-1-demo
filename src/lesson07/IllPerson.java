package lesson07;

import java.util.Objects;

public class IllPerson {
    public TreatmentPlan treatmentPlan = new TreatmentPlan();
    public String name;
    public String surName;
    public int age;
    public int diagnosis;

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnosis(int diagnosis) {
        this.diagnosis = diagnosis;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getDiagnosis() {
        return diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IllPerson illPerson = (IllPerson) o;
        return age == illPerson.age && diagnosis == illPerson.diagnosis && treatmentPlan.equals(illPerson.treatmentPlan) && name.equals(illPerson.name) && surName.equals(illPerson.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentPlan, name, surName, age, diagnosis);
    }
}
