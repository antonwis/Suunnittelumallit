package Visitor;

public class Pandemic implements PlagueState {
    private long bodyCount;
    private long maxCasualties = (long) Math.pow(999999999, 2);
    private boolean genocide;

    public Pandemic(long bodyCount) {
        this.bodyCount = bodyCount;
    }

    @Override
    public void spread(Plague plague) {
        bodyCount = (long) Math.pow(bodyCount, 2);
        System.out.println(bodyCount + " people infected.");
        if(checkUpgradeCriteria()) {
            plague.evolve();
        }
    }

    @Override
    public void evolve(Plague plague) {
        System.out.println("Everyone is either infected or dead. Next stop: Space!");
        genocide = true;

    }

    @Override
    public boolean checkUpgradeCriteria() { return bodyCount >= maxCasualties; }

    @Override
    public boolean genocide() { return genocide; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
