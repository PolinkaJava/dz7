package task2;
 class Circle implements Figure {
    double r;

   public Circle(double r) {
        this.r = r;
    }

   public double getPl() {
        return Math.PI * r * r;
    }
@Override
public double getPer() {
        return 2 * Math.PI * r;
    }
}