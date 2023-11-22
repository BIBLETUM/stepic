package inheritance;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        this(size, size, size, weight);
    }

    public BoxWeight(double allSize){
        this(allSize, allSize);
    }

    public BoxWeight(){
        this(10);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf(" вес: " + weight);
    }
}
