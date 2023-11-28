package task2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Figure[] f = new Figure[5];
        f[0] = new Triangle(3, 4.87969, 5);
        f[1] = new Rectangle(4, 5.859579);
        f[2] = new Circle(5.87654332);
        f[3] = new Triangle(5, 6, 6);
        f[4] = new Rectangle(5.8, 6.876);

        double sum = 0;
        for (Figure figure : f) {
            sum += figure.getPer();
        }
        System.out.println("Сумма периметров всех фигур: " + sum);
    }
}