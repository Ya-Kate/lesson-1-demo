package lesson08.Part1;

import java.util.Objects;

public class Trapezoid implements Figure { // класс реализующий интерфейс. имеет дополнительные свои парамтры.
    public String nameTrapezoid = "Трапеция";
    public int sideOnaUp;
    public int sideTwoDown;
    public int heightTrapezoid;
    public int sideThree;

    public Trapezoid() { // конструктор по умолчанию, нужен, тк есть класс с параметрами (переменные)

    }

    public Trapezoid(int sideOnaUp, int sideTwoDown, int heightTrapezoid, int sideThree) { // конструктор с параметрами, инициализируются переменные данного класса
        this.sideOnaUp = sideOnaUp;
        this.sideTwoDown = sideTwoDown;
        this.heightTrapezoid = heightTrapezoid;
        this.sideThree = sideThree;
    }

    @Override
    public void squareFigure() { // переопределяется функция родительского класса  считается и выводится площадь трапеции
        int sSquareFig = (int) (0.5 * (sideOnaUp + sideTwoDown) * heightTrapezoid);
        System.out.println("Площадь " + nameTrapezoid + ": " + sSquareFig);
    }

    @Override
    public int perimeterFigure() { // переопределяется функция родительского класса  считается и возвращает int значение- периметр трапеции
        int perimetrFig = (sideThree * 2) + sideOnaUp + sideTwoDown;
        return perimetrFig;
    }

    public void setSideThree(int sideThree) {

        this.sideThree = sideThree;
    }

    public int getSideThree() {

        return sideThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return sideOnaUp == trapezoid.sideOnaUp && sideTwoDown == trapezoid.sideTwoDown && heightTrapezoid == trapezoid.heightTrapezoid && sideThree == trapezoid.sideThree && nameTrapezoid.equals(trapezoid.nameTrapezoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTrapezoid, sideOnaUp, sideTwoDown, heightTrapezoid, sideThree);
    }

    public void setNameTrapezoid(String nameTrapezoid) {

        this.nameTrapezoid = nameTrapezoid;
    }

    public void setSideOnaUp(int sideOnaUp) {

        this.sideOnaUp = sideOnaUp;
    }

    public void setSideTwoDown(int sideTwoDown) {

        this.sideTwoDown = sideTwoDown;
    }

    public void setHeightTrapezoid(int heightTrapezoid) {

        this.heightTrapezoid = heightTrapezoid;
    }

    public String getNameTrapezoid() {

        return nameTrapezoid;
    }

    public int getSideOnaUp() {

        return sideOnaUp;
    }

    public int getSideTwoDown() {

        return sideTwoDown;
    }

    public int getHeightTrapezoid() {

        return heightTrapezoid;
    }
}
