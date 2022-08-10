package lesson08.Part1;

import java.util.Objects;

public class Circle implements Figure { // реализует интерфейс, имеет свои пераметры(переменные)
    public String nameCircle = "Круг";
    public int lenghtCircl;

    public Circle () { // конструктор по умолчанию

    }

    public Circle(int lenghtCircl) { // конструктор с параметрами
        this.lenghtCircl = lenghtCircl;
    }

    @Override
    public void squareFigure() { // переопределяется функция родительского класса  считается и выводится площадь круга
        int sSquareFig = (int) (lenghtCircl * lenghtCircl / (4 *  Math.PI));
        System.out.println("Площадь " + nameCircle + ": " + sSquareFig);
    }

    @Override
    public int perimeterFigure() { // переопределяется функция родительского класса  считается и возвращает int значение- периметр круга

        return lenghtCircl;
    }

    public void setNameCircle(String nameCircle) {

        this.nameCircle = nameCircle;
    }

    public void setLenghtCircl(int lenghtCircl) {

        this.lenghtCircl = lenghtCircl;
    }

    public String getNameCircle() {
        return nameCircle;
    }

    public int getLenghtCircl() {

        return lenghtCircl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return lenghtCircl == circle.lenghtCircl && nameCircle.equals(circle.nameCircle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCircle, lenghtCircl);
    }

}
