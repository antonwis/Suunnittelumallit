package Observer;

import java.time.LocalTime;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {

    private int second;
    private String output;
    private LocalTime time;

    public ClockTimer() {
        this.time = LocalTime.now();
        this.second = time.getSecond();
    }

    public String getOutput() { return output;}

    public void setOutput(String output) {
        this.output = output;
    }
    @Override
    public void run() {
        while(true) {
            time = LocalTime.now();
            if(second != time.getSecond()) {
                setOutput(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond());
                setChanged();
                notifyObservers();
                second = time.getSecond();
            }
        }
    }
}
