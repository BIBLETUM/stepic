package interfaces;

public class Cook implements AbleToWork, AbleToDrive {
    @Override
    public void work() {
        System.out.println("Повар работает");
    }

    @Override
    public void drive() {
        System.out.println("Повар ведет");
    }
}
