package lesson08;

import java.util.Objects;

public class Triangle implements Figure {
    int sideOne;
    int sideTwo;
    int sideThree;
    int hFigure;
    String nameFigure = "Треугольник";

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }

    public void sethFigure(int hFigure) {
        this.hFigure = hFigure;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }

    public int gethFigure() {
        return hFigure;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideOne == triangle.sideOne && sideTwo == triangle.sideTwo && sideThree == triangle.sideThree && hFigure == triangle.hFigure && nameFigure.equals(triangle.nameFigure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideOne, sideTwo, sideThree, hFigure, nameFigure);
    }

    public Triangle () {  // конструктор по умолчанию

    }
    public Triangle(int sideOne, int sideTwo, int sideThree, int hFigure) { // конструктор с параметрами, инициализируются переменные данного класса
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.hFigure = hFigure;
    }

    @Override
    public void squareFigure() { // переопределяется функция родительского класса  считается и выводится площадь треугольника
        int sSquareFig = (int) (0.5 * hFigure * sideThree);
        System.out.println("Площадь " + nameFigure + ": " + sSquareFig);
    }

    @Override
    public int perimeterFigure() { // переопределяется функция родительского класса  считается и возвращает int значение- периметр треугольника
        int perimetrFig = sideOne + sideTwo + sideThree;
        return perimetrFig;
    }
}
