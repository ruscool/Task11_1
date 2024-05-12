
public class Main {
    public static void main(String[] args) {
        TaskNumber numberTask = new TaskNumber();

        numberTask.printNumberTask("11.1.1");

        AgeCalculator age = new AgeCalculator();
        age.ageDetermination();

        numberTask.printNumberTask("11.1.2");

        EventScheduler newEvent =new EventScheduler();
        newEvent.findNextEvent();
    }
}