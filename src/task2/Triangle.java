package task2;

class Triangle implements Figure {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Сумма двух сторон треугольника должна быть больше третьей");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPl() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPer() {
        return a + b + c;
    }
}