package lesson12;

import java.time.LocalDate;
import java.util.*;

public class Accounting {
    LinkedHashMap<String,IdCard> listWorks = new LinkedHashMap<>();
    LocalDate date;
    public void addIdCardOne() {
        InfoWorker infoWorkerOne = new InfoWorker();
        infoWorkerOne.surname = "Иванов";
        infoWorkerOne.name = "Иван";

        IdCard idCardOne = new IdCard();
        idCardOne.infoWorker = infoWorkerOne;
        idCardOne.numCard = "0001";
        idCardOne.dataAddIdCard = LocalDate.of(2022, 07, 10);
        date = idCardOne.dataAddIdCard;
        int i = 0;
        while (i != 24 && date.isBefore(LocalDate.now())) {
            AllReport reportOne = new AllReport();
            reportOne.dataStartWork = idCardOne.dataAddIdCard.plusMonths(1);
            reportOne.salary = (int) ((Math.random() * 501) + 200);
            reportOne.plan = (int) ((Math.random() * 101) + 40);
            reportOne.didPlan = (int) ((Math.random() * 201) +30);
            date = date.plusMonths(1);
            i++;
            idCardOne.reports.add(reportOne);
        }
        listWorks.put(infoWorkerOne.name+infoWorkerOne.surname, idCardOne);
    }

    public void addIdCardTwo() {
        InfoWorker infoWorkerTwo = new InfoWorker();
        infoWorkerTwo.surname = "Петров";
        infoWorkerTwo.name = "Николай";


        IdCard idCardTwo = new IdCard();
        idCardTwo.infoWorker = infoWorkerTwo;
        idCardTwo.numCard = "0002";
        idCardTwo.dataAddIdCard = LocalDate.of(2018, 11, 11);

        int i = 0;
        date = idCardTwo.dataAddIdCard;
        while (i != 24 && date.isBefore(LocalDate.now())) {
            AllReport reportTwo = new AllReport();
            reportTwo.dataStartWork = idCardTwo.dataAddIdCard.plusMonths(1);
            reportTwo.salary = (int) ((Math.random() * 501) + 200);
            reportTwo.plan = (int) ((Math.random() * 101) + 40);
            reportTwo.didPlan = (int) ((Math.random() * 201) +40);
            date = date.plusMonths(1);
            i++;
            idCardTwo.reports.add(reportTwo);
        }
        listWorks.put(infoWorkerTwo.name+infoWorkerTwo.surname, idCardTwo);
    }

    public void printReport() {
        Object[] cards = listWorks.values().toArray();

        for(int i = 0; i < cards.length; i++) {
            IdCard idCard = (IdCard)cards[i];
            System.out.println("Фамилия: " + idCard.infoWorker.surname + "\nИмя: " + idCard.infoWorker.name);
            System.out.println("Дата приема на работу: " + idCard.dataAddIdCard + ", Номер карты: " + idCard.numCard);

            for (int s = 0; s < idCard.reports.size(); s++) {
                System.out.println("//");
                System.out.println("Заработная плата за месяц: " + idCard.reports.get(s).salary);
                System.out.println("План работы за месяц: " + idCard.reports.get(s).plan);
                System.out.println("Выполнено за месыц: " + idCard.reports.get(s).didPlan + ". Премия: " + idCard.reports.get(s).getBonus());
                System.out.println("Дата составления плана за предыдущий месяц месяц: " + idCard.dataAddIdCard.plusMonths(1+s));
                System.out.println("С планом ознакомлен: " + idCard.reports.get(s).signatureWorker());
            }
            System.out.println("______________________");
        }
    }
}
