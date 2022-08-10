package lesson08.Part1;

import java.util.Objects;

public class Rectangle implements Figure { // реализует интерфейс. Имеет и свои параметры (переменные)
    String nameRectangle = "Прямоугольник";
    int lenghtSide;
    int widthSide;

    public Rectangle() { // конструктор по умолчанию, нужет тк есть конструктор с параметрами.

    }

    public Rectangle(int sideOne, int sideTwoo) { // конструктор с параметрами, инициализируются переменные данного класса
        this.lenghtSide = sideOne;
        this.widthSide = sideTwoo;
    }

    @Override
    public void squareFigure() { // переопределяется функция родительского класса  считается и выводится площадь прямоугольника
        int sSquareFig = lenghtSide * widthSide;
        System.out.println("Площадь " + nameRectangle + ": " + sSquareFig);
    }

    @Override
    public int perimeterFigure() { // переопределяется функция родительского класса  считается и возвращает int значение- периметр прямоугольника
        int perimetrFig = (lenghtSide + widthSide) * 2;
        return perimetrFig;
    }

    public void setNameRectangle(String nameRectangle) {
        this.nameRectangle = nameRectangle;
    }

    public void setLenghtSide(int lenghtSide) {

        this.lenghtSide = lenghtSide;
    }

    public void setWidthSide(int widthSide) {

        this.widthSide = widthSide;
    }

    public String getNameRectangle() {
        return nameRectangle;
    }

    public int getLenghtSide() {
        return lenghtSide;
    }

    public int getWidthSide() {
        return widthSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return lenghtSide == rectangle.lenghtSide && widthSide == rectangle.widthSide && Objects.equals(nameRectangle, rectangle.nameRectangle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRectangle, lenghtSide, widthSide);
    }
}
