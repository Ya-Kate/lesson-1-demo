package lesson08.Part1;

public class HomeWorkPart1 {
    public static void main(String[] args) {
        /*
        1. Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.
         */
        Figure triangle = new Triangle(10, 20, 30, 13);
        Figure rectangle = new Rectangle(5, 10);
        Figure circle = new Circle(20);
        Figure square = new Square(10);
        Figure trapezoid = new Trapezoid(5, 10, 3, 4);

        int summAllPerimeter = 0;
        Figure[] figures = new Figure[] {triangle, rectangle, circle, square, trapezoid};
        for (Figure p : figures) {
            p.squareFigure();
            summAllPerimeter += p.perimeterFigure();
        }
        System.out.println("Периметр всех фигур: " + summAllPerimeter);
    }
}
