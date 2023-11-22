package interfaces;

public class Client {
    public void makeOrder(Waiter waiter, String dish) {
        waiter.giveOrder(dish);
    }
}
