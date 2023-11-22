import inheritance.*;
import inheritance.Rectangle;

public class MyClass {
    public static void main(String[] args) {
        Triangle tri = new Triangle(10,10,10);
        Rectangle rect = new Rectangle(10,10);
        tri.showPerimetr();
        rect.showPerimetr();
    }
}

