package interfaces;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Waiter waiter = new Waiter() {
            @Override
            public void giveOrder(String dish) {
                System.out.println("Принес " + dish);
            }
        };
        client.makeOrder(waiter, "Пиво");

        MyWaiter waiterr = new MyWaiter();
        client.makeOrder(waiterr, "водяра");
    }


}
