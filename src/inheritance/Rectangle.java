package inheritance;

public class Rectangle extends Shape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double perimetr() {
        return (a + b) * 2;
    }
}
