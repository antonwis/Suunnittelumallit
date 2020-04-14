package Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player implements Runnable {

    private Riddler riddler;
    private String name;
    private Object obj;
    List<Integer> numbers;

    public Player(String name, Riddler riddler) {
        this.name = name;
        this.riddler = riddler;
        this.numbers = new ArrayList();
    }

    public void joinGame() {
        this.obj = riddler.getNumber(this);
    }

    public String getName() {
        return name;
    }

    public void guess() {
        int guess = new Random().nextInt(20);
        System.out.print(getName() + "'s guess: " + guess + ". ");
        if (!this.numbers.contains(guess)) {
            this.numbers.add(guess);
        }
        if (!riddler.guessNumber(obj, guess)) {
            guess();
        } else {
            System.out.println(getName() + " beat the Riddler.");
        }
    }

    @Override
    public void run() {
        joinGame();
        guess();

    }

}
