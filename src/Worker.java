public class Worker {
    String name;
    String position;
    int paycheck;

    Worker(String name, String position, int paycheck) {
        this.paycheck = paycheck;
        this.position = position;
        this.name = name;
    }

    void showInfo() {
        System.out.println("Имя: " + name + "\nДолжность: " + position + "\nЗП: " + paycheck);
    }
}
