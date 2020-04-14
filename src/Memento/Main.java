package Memento;

public class Main {

    public static void main(String[] args) {

        Riddler riddler = new Riddler();

        Player player1 = new Player("Seppo", riddler);
        Player player2 = new Player("Pekka", riddler);
        Player player3 = new Player("Kake", riddler);

        player1.run();
        player2.run();
        player3.run();
    }

}
