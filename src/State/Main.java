package State;

public class Main {

    public static void main(String[] args) {

        Plague corona = new Plague(new Outbreak());

        for(int i=0; i < 14; i++) {
            corona.spread();
        }

    }
}