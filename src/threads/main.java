package threads;

import java.util.Random;

public class main {
    static boolean isCorrect = false;

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(1000000000);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int guess = 0;
                while (!isCorrect) {
                    guess = rand.nextInt(1000000000);
                    if (guess == number)
                        isCorrect = true;
                }
                System.out.println(guess);
                System.out.println(number);
            }
        });
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (isCorrect) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread2.start();

    }
}
