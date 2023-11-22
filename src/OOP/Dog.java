package OOP;

public class Dog {
    String name;
    String breed;
    int weight;
    int speed;

    void info() {
        System.out.println("Имя: " + name + " порода: " + breed + " Вес: " + weight);
    }

    void showSpeed() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу" + (i + 1));
        }
    }
}
