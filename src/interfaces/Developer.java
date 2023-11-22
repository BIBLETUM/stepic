package interfaces;

public class Developer implements AbleToWork, AbleToDrive {

    @Override
    public void drive() {
        System.out.println("Программист ведет");
    }

    @Override
    public void work() {
        System.out.println("Программист работает");
    }
}
