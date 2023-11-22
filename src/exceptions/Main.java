package exceptions;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;
        for (int i = 0; i < 100; i++) {
            number = rand.nextInt(1, 7);
            System.out.println(String.format("Ваше число %s", number));
        }
    }
}
