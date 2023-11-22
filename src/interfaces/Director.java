package interfaces;

public class Director implements AbleToWork {
    @Override
    public void work() {
        System.out.println("Директор работает");
    }
}
