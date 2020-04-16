package Visitor;

public class Outbreak implements PlagueState {
    private long bodyCount = 0;

    public Outbreak() {
        System.out.println("Once upon a time there was a town called Wuhan where people used to consume live bats in a soup...");
    }

    @Override
    public void spread(Plague plague) {
        bodyCount += 20;
        System.out.println(bodyCount + " people infected.");
        if(checkUpgradeCriteria()) {
            plague.evolve();
        }
    }

    @Override
    public void evolve(Plague plague) {
        System.out.println("Plague has turned into an epidemic!");
        plague.setState(new Epidemic(bodyCount));
    }

    @Override
    public boolean checkUpgradeCriteria() { return bodyCount >= 100; }

    @Override
    public boolean genocide() { return false; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
