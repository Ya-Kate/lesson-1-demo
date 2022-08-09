package lesson08.Part1;

import java.util.Objects;

public class Triangle implements Figure { // класс реализующий интерфейс и имеющий параметры (переменные) по сторонам только своего класса
    int sideOne;
    int sideTwo;
    int baseFigure;
    int hFigure;
    String nameFigure = "Треугольник";

    public Triangle () {  // конструктор по умолчанию

    }
    public Triangle(int sideOne, int sideTwo, int baseFigure, int hFigure) {
        // конструктор с параметрами, инициализируются переменные данного класса
        // находит площадь треугольника, через основание и высоту h.
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.baseFigure = baseFigure;
        this.hFigure = hFigure;
    }

    @Override
    public void squareFigure() { // переопределяется функция родительского класса  считается и выводится площадь треугольника
        int sSquareFig = (int) (0.5 * hFigure * baseFigure);
        System.out.println("Площадь " + nameFigure + ": " + sSquareFig);
    }

    @Override
    public int perimeterFigure() { // переопределяется функция родительского класса  считается и возвращает int значение- периметр треугольника
        int perimetrFig = sideOne + sideTwo + baseFigure;
        return perimetrFig;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(int sideThree) {
        this.baseFigure = sideThree;
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
        return baseFigure;
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
        return sideOne == triangle.sideOne && sideTwo == triangle.sideTwo && baseFigure == triangle.baseFigure && hFigure == triangle.hFigure && nameFigure.equals(triangle.nameFigure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideOne, sideTwo, baseFigure, hFigure, nameFigure);
    }

}
