package Observer;

public class Main {
    public static void main(String[] args) {


        ClockTimer clockTimer = new ClockTimer();
        DigitalClock clock = new DigitalClock(clockTimer);


        Thread t = new Thread(clockTimer);
        t.run();

    }
}