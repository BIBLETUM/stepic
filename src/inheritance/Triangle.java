package inheritance;

public class Triangle extends Shape{
    public double c;
    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }
}
