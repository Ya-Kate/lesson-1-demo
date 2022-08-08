package lesson08;

import java.util.Objects;

public class Square implements Figure {
    public String nameRectangle = "Квадрат";
    public int sideSquare;

    public void setNameRectangle(String nameRectangle) {

        this.nameRectangle = nameRectangle;
    }

    public void setSideSquare(int sideSquare) {

        sideSquare = sideSquare;
    }

    public String getNameRectangle() {

        return nameRectangle;
    }

    public int getSideSquare() {
        return sideSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return sideSquare == square.sideSquare && Objects.equals(nameRectangle, square.nameRectangle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRectangle, sideSquare);
    }

    Square() { // конструктор по умолчанию

    }

    public Square(int sideSquare) { // конструктор с параметрами, инициализируются все переменные данного класса
        this.nameRectangle = nameRectangle;
        this.sideSquare = sideSquare;
    }


    @Override
    public void squareFigure() { // переопределяется функция родительского класса  считается и выводится площадь квадрата
        int sSquareFig = sideSquare * sideSquare;
        System.out.println("Площадь " + nameRectangle + ": " + sSquareFig);
    }

    @Override
    public int perimeterFigure() { // переопределяется функция родительского класса  считается и возвращает int значение- периметр квадрата
        int perimetrFig = sideSquare * 4;
        return perimetrFig;
    }
}
