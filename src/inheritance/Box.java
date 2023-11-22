package inheritance;

public class Box {
    private double len;
    private double width;
    private double height;

    public Box(){
        this(10);
    }
    public Box(double size){
        this(size, size, size);
    }
    public Box(double length, double width, double height) {
        this.len = length;
        this.height = height;
        this.width = width;
    }
    public double getVolume(){
        return len * width * height;
    }

    public void showInfo(){
        System.out.println("Ширина: " + width + " высота: " + height + " длина: " + len);
    }

    public Box copy() {
        return new Box(this.height);
    }

    public Box incr() {
        return new Box(this.height * 2);
    }
}
