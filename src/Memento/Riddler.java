package Memento;

import java.util.Random;

public class Riddler {

    public Riddler() {

    }

    public Object getNumber(Player player) {
        return new Memento(player.getName(), new Random().nextInt(20));
    }

    public boolean guessNumber(Object obj, int guess) {
        Memento memento = (Memento) obj;
        if (memento.number == guess) {
            System.out.println("Guess was correct");
            return true;
        }
        System.out.println("Guess was wrong.");
        return false;
    }

    private class Memento{
        private String player;
        private int number;

        public Memento(String player, int number){
            this.player=player;
            this.number=number;
        }
    }

}
