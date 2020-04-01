package State;

public class Main {

    public static void main(String[] args) {

        Plague corona = new Plague(new Outbreak());

        while(!corona.genocide()) { corona.spread(); }
    }
}