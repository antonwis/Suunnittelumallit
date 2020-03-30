package Observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer clockTimer) {
        timer = clockTimer;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        draw();
    }

    private void draw() {
        System.out.println(timer.getOutput());

    }
}
