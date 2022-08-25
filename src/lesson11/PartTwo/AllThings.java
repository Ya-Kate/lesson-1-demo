package lesson11.PartTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AllThings <T> {
    ArrayList<T> allTsing = new ArrayList<T>();
    Scanner scanner = new Scanner(System.in);

//    String vvodPerson;

    public AllThings() {
    }

    public AllThings(ArrayList<T> allTsing) {
        this.allTsing = allTsing;
    }

    public void addClothes() {
        Clothe clothe1 = new Clothe();
        clothe1.name = "Шапка";
        clothe1.cost = 10;
        clothe1.size = "s, m, l";
        allTsing.add((T) clothe1);

        Clothe clothe2 = new Clothe();
        clothe2.name = "Куртка";
        clothe2.cost = 45;
        clothe2.size = "m, l, xl";
        allTsing.add((T) clothe2);
    }

    public void addMaels() {
        Mael mael1 = new Mael();
        mael1.name = "Сыр";
        mael1.cost = 15;
        mael1.vegetarian = "true";
        allTsing.add((T) mael1);

        Mael mael2 = new Mael();
        mael2.name = "Мясо";
        mael2.cost = 20;
        mael2.vegetarian = "false";
        allTsing.add((T) mael2);
    }

    public void addClotheNew() {
        Clothe clothe = new Clothe();
        System.out.println("Введите наименование одежды: ");
        clothe.name = scanner.next();
        System.out.println("Введите стоимость одежды: ");
        clothe.cost = scanner.nextInt();
        System.out.println("Введите размерный ряд одежды: ");
        clothe.size = scanner.next();
        allTsing.add((T) clothe);
    }

    public void addMealNew() {
        Mael mael = new Mael();
        System.out.println("Введите наименование продукта: ");
        mael.name = scanner.next();
        System.out.println("Введите стоимость продукта: ");
        mael.cost = scanner.nextInt();
        System.out.println("Вегетарианский: ");
        mael.vegetarian = scanner.next();
        allTsing.add((T) mael);
    }
}
