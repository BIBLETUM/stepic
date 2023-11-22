package interfaces;

public class MyWaiter implements Waiter {
    @Override
    public void giveOrder(String dish) {
        System.out.println("Принес " + dish);
    }
}
