package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Cat cat = new Cat();
        Fish fish = new Fish();
        Dog dog = new Dog();
        Bird bird = new Bird();*/
        Cook cook = new Cook();
        Developer dev = new Developer();
        Director dir = new Director();
        ArrayList<AbleToWork> workers = new ArrayList<>();
        workers.add(cook);
        workers.add(dev);
        workers.add(dir);
        ArrayList<AbleToDrive> drivers = new ArrayList<>();
        drivers.add(cook);
        drivers.add(dev);
        for (AbleToWork worker : workers) {
            worker.work();
        }

        for (AbleToDrive driver : drivers) {
            driver.drive();
        }

    }
}
