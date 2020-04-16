package Visitor;

public class Main {

    public static void main(String[] args) {

        Plague corona = new Plague(new Outbreak());
        Visitor visitor = new PlagueVisitor();

        while(!corona.genocide()) {
            corona.accept(visitor);
            corona.spread();
        }
    }
}