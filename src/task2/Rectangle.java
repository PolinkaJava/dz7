package task2;

public class Rectangle implements Figure {
    double a, b;

   Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
@Override
public double getPl() {
        return a * b;
    }
@Override
    public double getPer() {
        return 2 * (a + b);
    }
}